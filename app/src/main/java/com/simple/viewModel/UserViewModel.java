package com.simple.viewModel;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Fragment;
import android.content.Intent;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableList;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Toast;

import com.simple.bean.WeatherBean;
import com.simple.fragment.FragmentFirst;
import com.simple.fragment.FragmentSecond;
import com.simple.mvvm.BR;
import com.simple.mvvm.CardViewActivity;
import com.simple.mvvm.PullAndPushActivity;
import com.simple.mvvm.R;
import com.simple.util.ApiService;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import java.util.HashMap;
import java.util.Map;

import me.tatarka.bindingcollectionadapter.ItemView;
import rx.Subscriber;

/**
 * Created by qijie07 on 2016/11/8.
 */
public class UserViewModel {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
    public ObservableField<String> message = new ObservableField<>();

    public ObservableList<RecyclerItemViewModel> items = new ObservableArrayList<>();
    public ItemView itemView = ItemView.of(BR.item, R.layout.item);

    private Activity context;
    private Fragment mTempFragment;
    private FragmentFirst fragmentFirst;
    private FragmentSecond fragmentSecond;
    private boolean isFirst = true;

    public UserViewModel(final Activity context, String name, int age) {
        this.context = context;
        this.name.set(name);
        this.age.set(age);
        mTempFragment = new Fragment();
        fragmentFirst = new FragmentFirst();
        fragmentSecond = new FragmentSecond();
        Map params = new HashMap();//请求参数
        params.put("cityname", "苏州");//要查询的城市，如：温州、上海、北京
        params.put("key", "e1f1d6a349ef4a7135105a2414fd5939");//应用APPKEY(应用详细页查询)
        params.put("dtype", "");//返回数据的格式,xml或json，默认json
        for (int i = 0; i < 10; i++) {
            items.add(new RecyclerItemViewModel(context, "item " + i,i));
        }
        Subscriber<WeatherBean> subscriber = new Subscriber<WeatherBean>() {
            @Override
            public void onCompleted() {
                Toast.makeText(context, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                message.set(e.getMessage());
                Log.e("aaaa",e.getMessage());
            }

            @Override
            public void onNext(WeatherBean bean) {
                Toast.makeText(context, bean.getReason(), Toast.LENGTH_SHORT).show();
                message.set(bean.getResult().getData().getWeather().get(0).getNongli());
            }
        };
        ApiService.getApiService().get_weather(params).compose(((RxAppCompatActivity) context).bindToLifecycle()).subscribe(subscriber);
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.age_button:
                this.age.set(this.age.get() + 1);
                break;
            case R.id.intent_button:
//                context.startActivity(new Intent(context,PullAndPushActivity.class));
                context.startActivity(new Intent(context,PullAndPushActivity.class),
                        ActivityOptions.makeSceneTransitionAnimation(context).toBundle());
                break;
            case R.id.frag_button:
                if (isFirst){
                    switchFragment(fragmentFirst,null);
                    isFirst = false;
                }else {
                    switchFragment(fragmentSecond,null);
                    isFirst = true;
                }
                break;
            case R.id.cardview:
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(context,
                        Pair.create(view, "agreedName1"));
                context.startActivity(new Intent(context,CardViewActivity.class),options.toBundle());
                break;
        }
    }

    private void switchFragment(Fragment fragment,Bundle data) {
        if (fragment != mTempFragment) {
            if (!fragment.isAdded()) {
                fragment.setArguments(data);
                context.getFragmentManager().beginTransaction().hide(mTempFragment)
                        .add(R.id.container, fragment).commit();
            } else {
                context.getFragmentManager().beginTransaction().hide(mTempFragment)
                        .show(fragment).commit();
            }
            mTempFragment = fragment;
        }
    }

}
