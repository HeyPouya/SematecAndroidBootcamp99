package com.sematec.bootcamp99;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TestService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        showToast();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    private void showToast() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(TestService.this, "Some toast", Toast.LENGTH_SHORT).show();
                showToast();
            }
        },3000);
    }
}
