package com.passerbywhu.functionb;

import android.app.Application;

import com.passerbywhu.common.BaseIPlugin;
import com.passerbywhu.common.Plugins;

/**
 * Created by hzwuwenchao on 2017/11/14.
 */

public class IPlugin extends BaseIPlugin {
    @Override
    public void dependency() {
        dependsOn(Plugins.PLUGIN_COMMON);
    }

    @Override
    public void configure() {

    }

    @Override
    public void execute(Application application) {
        if (application instanceof FunctionBApplication) {
            ((FunctionBApplication) application).init(application);
        } else {
            FunctionBApplication functionBApplication = new FunctionBApplication();
            functionBApplication.init(application);
        }
    }

    public static void init(Application application) {
        IPlugin plugin = new IPlugin();
        plugin.doInit(application);
    }
}
