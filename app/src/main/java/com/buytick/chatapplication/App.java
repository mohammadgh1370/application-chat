package com.buytick.chatapplication;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.buytick.chatapplication.Models.Message;
import com.buytick.chatapplication.Utils.SharedPref;
import com.buytick.chatapplication.laravelechoandroid.Echo;
import com.buytick.chatapplication.laravelechoandroid.EchoCallback;
import com.buytick.chatapplication.laravelechoandroid.EchoOptions;
import com.buytick.chatapplication.service.DoInBackgroundService;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class App extends Application {

    @SuppressLint("StaticFieldLeak")
    public static App Instance = null;

    @SuppressLint("StaticFieldLeak")
    public static Context applicationContext;

    @SuppressLint("StaticFieldLeak")
    public static volatile Handler applicationHandler;

    public static final String CHANNEL_NAME = "chat";
    public static final String EVENT_NAME = "App\\Events\\MessageCreated";

    public static final String BASE_URL = "http://172.17.100.2:8000/";
    public static final String PRESENCE_AUTH = BASE_URL+"api/presenceAuth";
    public static final String SOCKET_BASE_URL = "http://172.17.100.2:6001/";

    @Override
    public void onCreate() {
        super.onCreate();

        Instance = this;
        applicationContext = getApplicationContext();
        applicationHandler = new Handler(applicationContext.getMainLooper());

//        if (!App.isServiceRunning(DoInBackgroundService.class)) {
//            App.startPusherService();
//        }
    }

    public static boolean isServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) applicationContext.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static void startPusherService() {
        applicationContext.startService(new Intent(applicationContext, DoInBackgroundService.class));
    }

    public static void stopPusherService() {
        applicationContext.stopService(new Intent(applicationContext, DoInBackgroundService.class));
    }

    private Socket mSocket;
    {
        try {
            mSocket = IO.socket(SOCKET_BASE_URL);
            mSocket.connect();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }

    public static SharedPref pref(){
        return new SharedPref(applicationContext);
    }

}
