package com.simple.util;

import com.simple.bean.WeatherBean;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by qijie07 on 2016/11/9.
 */
public class APIUtils {

    public interface ApiInterface {
        @GET("query")
        Observable<WeatherBean> getdata(@QueryMap Map<String, String> maps);
    }

}
