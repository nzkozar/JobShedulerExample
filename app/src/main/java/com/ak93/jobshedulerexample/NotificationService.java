package com.ak93.jobshedulerexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by ak93 on 23.6.2017.
 */

public class NotificationService extends Service {

    private static final String TAG = "NotificationService";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"Hello world!");
        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
