package com.buytick.chatapplication.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.buytick.chatapplication.App;
import com.buytick.chatapplication.Models.Message;
import com.buytick.chatapplication.laravelechoandroid.Echo;
import com.buytick.chatapplication.laravelechoandroid.EchoCallback;

public class DoInBackgroundService extends Service{

    public Echo echo;
    public Message.Sender currentUser = new Message.Sender();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        Log.i("pusher Service","DoInBackgroundService is run");

        echo.connect(new EchoCallback() {
            @Override
            public void call(Object... args) {

            }
        }, new EchoCallback() {
            @Override
            public void call(Object... args) {

            }
        });

        echo.channel("notification-"+ currentUser.getId())
                .listen("notify" , new EchoCallback() {
                    @Override
                    public void call(Object... args) {

                    }
                });

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        echo.disconnect();
//        PusherOdk.getInstance().PusherApp.unsubscribe(App.CHANNEL_PRECENSE_NAME);
    }

}
