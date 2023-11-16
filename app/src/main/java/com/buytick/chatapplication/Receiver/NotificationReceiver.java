package com.buytick.chatapplication.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.buytick.chatapplication.service.NotificationService;

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        String data = "";
        if (bundle != null) {
            data = bundle.getString("data");
        }
        Intent intent1 = new Intent(context,NotificationService.class);
        intent1.putExtra("data",data);
        context.startService(intent1);
    }
}
