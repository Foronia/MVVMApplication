package com.simple.viewModel;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import com.simple.mvvm.R;
import com.simple.mvvm.SlideSwitchActivity;

/**
 * Created by qijie07 on 2016/12/3.
 */

public class Student {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
    private Activity context;

    public Student(Activity context,String name, int age) {
        this.context = context;
        this.name.set(name);
        this.age.set(age);
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.name:
                Intent intergralIntent=new Intent(context, SlideSwitchActivity.class);
                context.startActivity(intergralIntent);
                break;
        }
    }

}
