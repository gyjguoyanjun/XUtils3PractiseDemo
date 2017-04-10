package com.bwie.test.xutils3practisedemo.application;

import android.app.Application;

import org.xutils.x;

/**
 * Created by tianjieyu on 2017/4/10.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
