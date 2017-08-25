package com.simple.mvvm;

import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;

import com.simple.NRecyclerView.NRecyclerView;
import com.simple.adapter.RecyclerViewAdapter;
import com.simple.mvvm.databinding.ActivityPullAndPushBinding;
import com.simple.viewModel.PullViewModel;
import com.simple.viewModel.Student;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class PullAndPushActivity extends RxAppCompatActivity implements
        NRecyclerView.RefreshAndLoadingListener{

    private PullViewModel pullViewModel;
    private ActivityPullAndPushBinding activityPullAndPushBinding;
    private NRecyclerView recyclerMagicView;
    private RecyclerViewAdapter adapter;
    private int state = 1;
    private ArrayList<Student> mData = new ArrayList<Student>() {
        {
            for (int i=0;i<30;i++) add(new Student(PullAndPushActivity.this,"loader" + i, 18 + i));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set Explode enter transition animation for current activity
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setEnterTransition(new Explode().setDuration(300));
        activityPullAndPushBinding = DataBindingUtil.setContentView(this,R.layout.activity_pull_and_push);
        pullViewModel = new PullViewModel(this);
        activityPullAndPushBinding.setPull(pullViewModel);
        initNRecyclerView();
    }

    private void initNRecyclerView(){
        recyclerMagicView = activityPullAndPushBinding.recyclerMagicView;
        recyclerMagicView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).marginResId(R.dimen.margin_left).build(),2);
        recyclerMagicView.setItemAnimator(new DefaultItemAnimator());

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

//        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerMagicView.setLayoutManager(layoutManager);
        recyclerMagicView.setOnRefreshAndLoadingListener(this);

        ViewGroup adVentureView = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.adventure_layout,(ViewGroup)findViewById(android.R.id.content),false);
        recyclerMagicView.setAdtureView(adVentureView);

        ViewGroup bottomView = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.bottom_layout,(ViewGroup)findViewById(android.R.id.content),false);
        recyclerMagicView.setBottomView(bottomView);

//        datas = Arrays.asList(getResources().getStringArray(R.array.data));

//        addItems();
        adapter = new RecyclerViewAdapter(mData);
        recyclerMagicView.setAdapter(adapter);
        recyclerMagicView.setTotalPages(5);
    }

    @Override
    public void refresh() {
        currentPage = 1;
        new AsyncTask<Void,Void,Integer>(){
            @Override
            protected Integer doInBackground(Void... params) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return 1;
            }

            @Override
            protected void onPostExecute(Integer integer) {
                super.onPostExecute(integer);
                if(integer == 1){

                    //TODO If successfully.
                    recyclerMagicView.removeErrorView();

                    //TODO The NRecyclerView can't loadmore anymore currentlly,So we should set it true according net call back data.
                    recyclerMagicView.setPullLoadEnable(currentPage>=totalPages?false:true);

                    recyclerMagicView.resetEntryView();
//                    addItems();
//                    adapter.setItems(currentDatas);
                    recyclerMagicView.endRefresh();
                }
            }
        }.execute();
    }

    private int currentPage = 1;
    private int totalPages = 6;

    @Override
    public void load() {

        currentPage ++;
        new AsyncTask<Void,Void,Integer>(){
            @Override
            protected Integer doInBackground(Void... params) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return 1;
            }

            @Override
            protected void onPostExecute(Integer integer) {
                super.onPostExecute(integer);

                if(currentPage >= totalPages){
                    recyclerMagicView.pullNoMoreEvent();
                }else{
//                    addItems();
//                    adapter.setItems(currentDatas);
                    recyclerMagicView.endLoadingMore();
                }

            }
        }.execute();
    }

//    private void addItems(){
//
//        List<RecyclerItemViewModel> recyclerItemViewModels = new ArrayList<>();
//
//        for(int i= (currentPage-1)*15;i<currentPage*15;i++ ){
//            recyclerItemViewModels.add(datas.get(i));
//        }

//        if(recyclerMagicView.isRefreshing())
//            currentDatas = strs;
//        else
//            currentDatas.addAll(strs);

//    }


//    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHoader>{
//
//        private List<String> data;
//
//        public MyAdapter(List<String> data){
//            this.data = data;
//        }
//
//        @Override
//        public ViewHoader onCreateViewHolder(ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test,parent,false);
//            return new ViewHoader(view);
//        }
//
//        @Override
//        public void onBindViewHolder(ViewHoader holder, int position) {
//            String str = data.get(position);
//            holder.tv.setText(str);
//        }
//
//        public void setItems(List<String> data){
//            this.data = data;
//            this.notifyDataSetChanged();
//        }
//
//        public void clearData(){
//            this.data.clear();
//            notifyDataSetChanged();
//        }
//
//        @Override
//        public int getItemCount() {
//            return data == null ? 0:data.size();
//        }
//
//        public class ViewHoader extends RecyclerView.ViewHolder{
//
//            private TextView tv;
//            public ViewHoader(View itemView) {
//                super(itemView);
//                tv = (TextView) itemView.findViewById(R.id.tv);
//            }
//        }
//    }
}
