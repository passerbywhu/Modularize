package com.passerbywhu.common;

import android.app.Application;

public class IPlugin extends BaseIPlugin {
    @Override
    public void dependency() {
    }

    @Override
    public void configure() {

    }

    @Override
    public void execute(Application application) {
        if (application instanceof MyApplication) {
            ((MyApplication) application).init(application);
        } else {
            MyApplication myapp = new MyApplication();
            myapp.init(application);
        }
    }

    public static void init(Application application) {
        IPlugin plugin = new IPlugin();
        plugin.doInit(application);
    }

}
