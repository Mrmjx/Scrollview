package com.mo.text.myapplication;

import android.app.Application;

/**
 * Created by mjx on 2017/10/25.
 */

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //基础版适配
// client_id即你在有赞申请的客户端标识（⽼⽤户⽤UA)接⼊流程7
// 若⽤原⽣版将第三个参数替换成 new YouzanHybridSDKAdapter();
    }

}
