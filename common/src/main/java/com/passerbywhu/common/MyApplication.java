package com.passerbywhu.common;

import android.util.Log;

/**
 * Created by passe on 2017/5/23.
 */

public class MyApplication extends android.app.Application implements IApplicationInterface {
    private static MyApplication instance;
    private static android.app.Application mRealApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        IPlugin.init(this);
    }

    @Override
    public void init(android.app.Application application) {
        mRealApplication = application;
        instance = this;
        Log.d("module", "common application inited");
    }

    public static android.app.Application getRealApplication() {
        return mRealApplication;
    }

    public static MyApplication getInstance() {
        return instance;
    }
}
