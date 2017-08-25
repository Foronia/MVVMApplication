package com.simple.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by qijie07 on 2016/11/8.
 */
public class RecyclerItemViewModel extends BaseObservable {

    private Context mContext;
    @Bindable
    private String title;
    @Bindable
    private int position;

    public RecyclerItemViewModel(Context mContext) {
        this.mContext = mContext;
    }

    public RecyclerItemViewModel(Context mContext, String title,int position) {
        this.mContext = mContext;
        this.title = title;
        this.position = position;
    }

    public void onItemClick(View v){
        Toast.makeText(mContext, title, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v){
        Toast.makeText(mContext, "你点击了按钮" + position, Toast.LENGTH_SHORT).show();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
