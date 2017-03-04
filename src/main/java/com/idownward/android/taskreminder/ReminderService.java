package com.idownward.android.taskreminder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.util.Log;


public class ReminderService extends WakeReminderIntentService {

    public ReminderService() {
        super("ReminderService");
    }


    @Override
    void doReminderWork(Intent intent) {
        		Log.d("ReminderService", "Doing work.");
        		Long rowId = intent.getExtras().getLong(RemindersDbAdapter.KEY_ROWID);
                		NotificationManager mgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                		Intent notificationIntent = new Intent(this, ReminderEditActivity.class);
        		notificationIntent.putExtra(RemindersDbAdapter.KEY_ROWID, rowId);
                		PendingIntent pi = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_ONE_SHOT);








	}
                		// An issue could occur if user ever enters over 2,147,483,647 tasks. (Max int value).
        		// I highly doubt this will ever happen. But is good to note.

}


