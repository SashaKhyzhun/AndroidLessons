package sasha.khyzhun.com.photogallery;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Sasha on 25.09.2015.
 */
public class NotificationReceiver extends BroadcastReceiver {
    public static final String TAG = "NotificationReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "received result : " + getResultCode());
        if (getResultCode() != Activity.RESULT_OK){
            return;
        }
        int requestCode = intent.getIntExtra("REQUEST_CODE", 0);
        Notification notification = (Notification)intent.getParcelableExtra("NOTIFICATION");
        NotificationManager notificationManager = (NotificationManager)context
                .getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(requestCode, notification);

    }
}