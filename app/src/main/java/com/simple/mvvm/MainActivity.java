package com.simple.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;

import com.simple.mvvm.databinding.ActivityMainBinding;
import com.simple.viewModel.UserViewModel;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import java.util.Date;

public class MainActivity extends RxAppCompatActivity {

    private UserViewModel myUserViewModel;
    private ActivityMainBinding myBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myUserViewModel = new UserViewModel(this,"activity", 7);
        myBinding.setUser(myUserViewModel);
        myBinding.setButtonname("年龄+1");
        myBinding.setButtonfrag("切换");
        myBinding.setButtonintent("跳转");
        myBinding.setTime(new Date());

    }
}
