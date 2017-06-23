package com.ak93.jobshedulerexample;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/**
 * Created by ak93 on 23.6.2017.
 */

public class Util {
    public static void scheduleJob(Context context){
        ComponentName serviceComponent = new ComponentName(context, NotificationJobService.class);
        JobInfo.Builder builder = new JobInfo.Builder(0, serviceComponent);
        builder.setMinimumLatency(5 * 1000); // wait at least
        builder.setOverrideDeadline(10 * 1000); // maximum delay

        //JobScheduler jobScheduler = context.getSystemService(JobScheduler.class); //23+
        JobScheduler jobScheduler = (JobScheduler)context.getSystemService(Context.JOB_SCHEDULER_SERVICE);
        jobScheduler.schedule(builder.build());
    }
}
