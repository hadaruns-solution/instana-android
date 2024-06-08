package com.example.myapplication;

import android.app.Application;
import com.instana.android.Instana;
import com.instana.android.core.InstanaConfig;

import java.util.regex.Pattern;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        InstanaConfig config = new InstanaConfig(
                "SwROmilkRZe3uuBFAZY1cw",
                "https://eum-green-saas.instana.io/mobile"
        );
        config.setAutoCaptureScreenNames(true);
        config.setEnableCrashReporting(true);
        Instana.getCaptureHeaders().add(Pattern.compile(".*"));
        Instana.setup(this, config);
    }
}
