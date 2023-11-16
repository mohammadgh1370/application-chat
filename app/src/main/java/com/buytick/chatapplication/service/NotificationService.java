package com.buytick.chatapplication.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.buytick.chatapplication.Activities.MainActivity;
import com.buytick.chatapplication.App;
import com.buytick.chatapplication.Models.Message;
import com.buytick.chatapplication.R;
import com.google.gson.Gson;

public class NotificationService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        Log.d("pusher", "NotificationService is run");

        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String data = bundle.getString("data");
            if (!data.equals("")) {
                Gson gson = new Gson();
                Message message = gson.fromJson(data, Message.class);
                Log.i("pusher data", message.getBody());

                buildNotification(message);
            }
        }

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void buildNotification(Message message) {

        NotificationManager mNotificationManager =
                (NotificationManager) App.applicationContext.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification.Builder notification = new Notification.Builder(App.applicationContext);

        notification.setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_notifications) // Small Icon required or notification doesn't display
                .setContentTitle("you have a notification from "+message.getSender().getName())
                .setStyle(new Notification.BigTextStyle().bigText(message.getBody()))
                .setContentText(message.getBody())
                .setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE)
                .setTicker(message.getBody())
                .setVibrate(new long[]{0, 100, 0, 100});

        Intent intent1 = new Intent(this.getApplicationContext(),MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(App.applicationContext, 0, intent1, PendingIntent.FLAG_ONE_SHOT);
        notification.setContentIntent(contentIntent);
        mNotificationManager.cancel(1);

        Notification notif = notification.build();
        notif.ledARGB = 0xff00ff00;
        notif.ledOnMS = 1000;
        notif.ledOffMS = 1000;
        notif.flags |= Notification.FLAG_SHOW_LIGHTS;

        try {
            mNotificationManager.notify(1, notif);
        } catch (Exception e) {
        }
    }
}
