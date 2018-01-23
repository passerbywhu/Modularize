package com.passerbywhu.modularize;

import android.app.Application;

import com.passerbywhu.common.BaseIPlugin;
import com.passerbywhu.common.Plugins;

public class IPlugin extends BaseIPlugin {
    @Override
    public void dependency() {
        dependsOn(Plugins.PLUGIN_B);
        dependsOn(Plugins.PLUGIN_COMMON);
    }

    @Override
    public void configure() {

    }

    @Override
    public void execute(Application application) {
        ((MyApplication) application).init(application);
    }

    public static void init(Application application) {
        IPlugin plugin = new IPlugin();
        plugin.doInit(application);
    }
}
