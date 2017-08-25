package com.simple.viewModel;

import android.app.Activity;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.simple.mvvm.BR;
import com.simple.mvvm.R;

import me.tatarka.bindingcollectionadapter.ItemView;

/**
 * Created by qijie07 on 2016/12/2.
 */

public class PullViewModel {

    private Activity context;
    public ObservableList<RecyclerItemViewModel> items = new ObservableArrayList<>();
    public ItemView itemView = ItemView.of(BR.item, R.layout.item);

    public PullViewModel(Activity context) {
        this.context = context;
        for (int i = 0; i < 10; i++) {
            items.add(new RecyclerItemViewModel(context, "item " + i,i));
        }
    }
}
