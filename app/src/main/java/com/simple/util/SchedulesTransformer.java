package com.simple.util;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by qijie07 on 2016/11/21.
 * 统一订阅，设置Scheduler
 */
public class SchedulesTransformer<T> implements Observable.Transformer<T,T> {

    @Override
    public Observable<T> call(Observable<T> tObservable) {
        return tObservable.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
