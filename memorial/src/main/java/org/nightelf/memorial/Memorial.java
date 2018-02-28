package org.nightelf.memorial;

import android.app.Application;
import android.util.Log;

/**
 * Memorial Application
 */
public class Memorial extends Application {
    private static final String TAG = "Memorial";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Application Created");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "Application Terminated");
    }
}
