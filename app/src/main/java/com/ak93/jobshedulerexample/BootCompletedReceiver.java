package com.ak93.jobshedulerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ak93 on 23.6.2017.
 */

public class BootCompletedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //TODO start job service here
        Util.scheduleJob(context);
    }
}
