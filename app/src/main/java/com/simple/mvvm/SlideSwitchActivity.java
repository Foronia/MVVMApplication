package com.simple.mvvm;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.simple.util.GestureListener;

public class SlideSwitchActivity extends AppCompatActivity implements View.OnClickListener{

    Button tv;
    RadioGroup ll_daily_recipe_footer;
    RadioButton rb_signin,rb_leave,rb_unsignin;
    private int current = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_switch);
        tv = (Button) findViewById(R.id.tv);
        ll_daily_recipe_footer = (RadioGroup) findViewById(R.id.ll_daily_recipe_footer);
        rb_signin = (RadioButton) findViewById(R.id.rb_signin);
        rb_leave = (RadioButton) findViewById(R.id.rb_leave);
        rb_unsignin = (RadioButton) findViewById(R.id.rb_unsignin);
        rb_signin.setOnClickListener(this);
        rb_leave.setOnClickListener(this);
        rb_unsignin.setOnClickListener(this);
        //setLongClickable是必须的
        tv.setLongClickable(true);
        tv.setOnTouchListener(new MyGestureListener(this));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rb_signin:
                current = 0;
                translationX(0);
                break;
            case R.id.rb_leave:
                current = 1;
                translationX(dp2px(getResources(),100));
                break;
            case R.id.rb_unsignin:
                current = 2;
                translationX(dp2px(getResources(),100)*2);
                break;
        }
    }

    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return  dp * scale + 0.5f;
    }

    /**
     * 继承GestureListener，重写left和right方法
     */
    private class MyGestureListener extends GestureListener {
        public MyGestureListener(Context context) {
            super(context);
        }

        @Override
        public boolean left() {
            Log.e("test", "向左滑");
            switch (current){
                case 0:
                    break;
                case 1:
                    current = 0;
                    translationX(0);
                    break;
                case 2:
                    current = 1;
                    translationX(dp2px(getResources(),100));
                    break;
            }
            return super.left();
        }

        @Override
        public boolean right() {
            Log.e("test", "向右滑");
            switch (current){
                case 0:
                    current = 1;
                    translationX(dp2px(getResources(),100));
                    break;
                case 1:
                    current = 2;
                    translationX(dp2px(getResources(),100)*2);
                    break;
                case 2:

                    break;
            }
            return super.right();
        }
    }

    private void translationX(float nextTranslationX){
        float curTranslationX = tv.getTranslationX();
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "translationX", curTranslationX, nextTranslationX);
        animator.setDuration(100);
        animator.start();
    }
}
