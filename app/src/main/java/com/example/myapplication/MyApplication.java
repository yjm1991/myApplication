package com.example.myapplication;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * User: yongjiaming
 * Email:yongjiaming@meizu.com
 * Date: 2016-02-24
 * Time: 20:18
 * Description:
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
