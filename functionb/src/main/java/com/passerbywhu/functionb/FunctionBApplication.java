package com.passerbywhu.functionb;

import android.app.Application;
import android.util.Log;

import com.passerbywhu.common.IApplicationInterface;

/**
 * Created by hzwuwenchao on 2018/1/23.
 */

public class FunctionBApplication extends Application implements IApplicationInterface {
    @Override
    public void onCreate() {
        super.onCreate();
        IPlugin.init(this);
    }

    @Override
    public void init(Application application) {
        Log.d("module", "functionb application inited");
    }
}
