package com.app.detectscreenlock;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Prefs.Builder().
                setContext(this).
                setMode(Context.MODE_PRIVATE).
                setUseDefaultSharedPreference(true).build();
        Prefs.putString("kaka", "1");

    }
}
