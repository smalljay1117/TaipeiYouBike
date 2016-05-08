package com.example.smalljay1117.taipeiyoubike.myapp;

import android.app.Application;
import android.content.Context;

import com.example.smalljay1117.taipeiyoubike.model.TaipeiYouBikes;

public class MyApp extends Application {

    private static Context context;
    private static TaipeiYouBikes taipeiYouBikes;

    public static Context getContext() {
        return context;
    }

    public static TaipeiYouBikes getTaipeiYouBikes() {
        return taipeiYouBikes;
    }

    public static void setTaipeiYouBikes(TaipeiYouBikes taipeiYouBikes) {
        MyApp.taipeiYouBikes = taipeiYouBikes;
    }

    public MyApp() {
        context = this;
    }
}
