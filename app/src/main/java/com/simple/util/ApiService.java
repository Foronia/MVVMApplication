package com.simple.util;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * Created by qijie07 on 2016/11/17.
 */
public class ApiService {

    private APIUtils.ApiInterface mApiInterface;

    private ApiService() {

        //HTTP client

        Retrofit mRetrofit = new Retrofit.Builder()

                .addConverterFactory(GsonConverterFactory.create())

                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())

                .baseUrl(StringUtil.BASEURL)

                .build();

        //Http interface

        mApiInterface = mRetrofit.create(APIUtils.ApiInterface.class);
    }

    //Singletonprivate
    private static class SingletonHolder {
        private static final ApiService INSTANCE = new ApiService();
    }
    //Instancepublic
    public static ApiService getApiService() {
        return SingletonHolder.INSTANCE;
    }

    public <T>Observable<T> get_weather(Map<String, String> maps) {
        return mApiInterface.getdata(maps)
                .compose(new SchedulesTransformer())
                .observeOn(AndroidSchedulers.mainThread());
//                .map(new HttpResultFunc<>())
    }

    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
     *
     * @param <T> Subscriber真正需要的数据类型，也就是Data部分的数据类型
     */
    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

        @Override
        public T call(HttpResult<T> httpResult) {
//            if (!httpResult.status.equals("1")) {
//                if (StringUtil.checkStr(httpResult.errcode)) {
//                    if (httpResult.errcode.equals(Constants.SESSION_EXPIRE)) {
//                        EventBus.getDefault().post(new SessionExpireEvent());
//                    }
//                }
//                throw new RuntimeException(httpResult.errmsg);
//            }
            return httpResult.dataresult;
        }
    }

}
