package com.example.apiapplication.test;

import android.app.Application;
import android.os.StrictMode;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Разрешение операций ввода-вывода в строгом режиме
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }
}
