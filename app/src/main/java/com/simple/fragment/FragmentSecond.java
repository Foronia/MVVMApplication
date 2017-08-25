package com.simple.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simple.mvvm.Custom;
import com.simple.mvvm.R;
import com.simple.viewModel.PersonViewModel;
import com.trello.rxlifecycle.components.RxFragment;

/**
 * Created by qijie07 on 2016/11/21.
 */
public class FragmentSecond extends RxFragment {

    private PersonViewModel personViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Custom myBinding = DataBindingUtil.inflate(inflater,
                R.layout.frag_layout, container, false);
        personViewModel = new PersonViewModel(this,"FragmentSecond", 2);
        myBinding.setPerson(personViewModel);
        myBinding.setFrags(this);
        return myBinding.getRoot();
    }

}
