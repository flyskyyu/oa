package com.app.officeautomationapp.activity;


import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    public  static List<Activity> activities=new ArrayList<Activity>();

    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    public static  void removeActivity(Activity activity)
    {
        activities.remove(activity);
        //activity.finish();
    }
    public static  void finishAll()
    {
        for(Activity activity:activities)
        {
            if(!activity.isFinishing())
            {
                activity.finish();
            }
        }
    }

}