package com.simple.util;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.simple.mvvm.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qijie07 on 2016/11/9.
 */
public class DataBindingUtils {
    @BindingAdapter({"imageUrl"})
    public static void imageLoader(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).placeholder(R.drawable.holder).error(R.drawable.error).into(imageView);
    }
    @BindingConversion
    public static String convertDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
}
