package com.simple.viewModel;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import com.simple.bean.WeatherBean;
import com.simple.util.ApiService;
import com.trello.rxlifecycle.components.RxFragment;

import java.util.HashMap;
import java.util.Map;

import rx.Subscriber;

/**
 * Created by qijie07 on 2016/11/8.
 */
public class PersonViewModel {

    public ObservableField<String> name = new ObservableField<>();

    public ObservableInt age = new ObservableInt();

    public PersonViewModel(final RxFragment mContext,String name, int age) {
        this.name.set(name);
        this.age.set(age);
        Map params = new HashMap();//请求参数
        params.put("cityname", "苏州");//要查询的城市，如：温州、上海、北京
        params.put("key", "e1f1d6a349ef4a7135105a2414fd5939");//应用APPKEY(应用详细页查询)
        params.put("dtype", "");//返回数据的格式,xml或json，默认json
        Subscriber<WeatherBean> subscriber = new Subscriber<WeatherBean>() {
            @Override
            public void onCompleted() {
//                Toast.makeText(mContext, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(WeatherBean bean) {
//                Toast.makeText(mContext, bean.getReason(), Toast.LENGTH_SHORT).show();
            }
        };
        ApiService.getApiService().get_weather(params).compose(((RxFragment)mContext).bindToLifecycle()).subscribe(subscriber);
    }

    public void click(View view) {
        this.age.set(this.age.get() + 1);
    }

}
