package com.sasha.khyzhun.runtracker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.util.Log;

public class TrackingLocationReceiver extends LocationReceiver {

    private static final String TAG = "TrackingLocationReceiver";

    @SuppressLint("LongLogTag")
    @Override
    protected void onLocationReceived(Context context, Location location) {
        Log.i(TAG, "Insert location into database!");
        RunManager.get(context).insertLocation(location);
    }

}