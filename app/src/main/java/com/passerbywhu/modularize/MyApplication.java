package com.passerbywhu.modularize;

import android.app.Application;

import com.passerbywhu.common.IApplicationInterface;

/**
 * Created by hzwuwenchao on 2018/1/23.
 */

public class MyApplication extends Application implements IApplicationInterface{
    @Override
    public void onCreate() {
        super.onCreate();
        IPlugin.init(this);
    }

    @Override
    public void init(Application application) {

    }
}
