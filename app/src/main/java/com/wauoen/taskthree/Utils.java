package com.wauoen.taskthree;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;

import java.util.List;

/**
 * Created by wauoen on 2017/8/17.
 */
public class Utils {

    private void printTaskInfo(Context context) {

        ActivityManager activityManager = (ActivityManager) context.getSystemService(context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> tasks = activityManager.getRunningTasks(1000);
        for (ActivityManager.RunningTaskInfo task: tasks) {

        }
    }

    public static void launchActivity(Context caller, Class target){

        caller.startActivity(new Intent(caller,target));
    }
}
