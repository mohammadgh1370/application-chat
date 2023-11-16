package com.buytick.chatapplication.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import com.buytick.chatapplication.service.DoInBackgroundService;

public class NetworkReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (ConnectionStatus(context)){
            Toast.makeText(context, "start", Toast.LENGTH_SHORT).show();
            context.startService(new Intent(context, DoInBackgroundService.class));
        }else {
            Toast.makeText(context, "stop", Toast.LENGTH_SHORT).show();
            context.stopService(new Intent(context, DoInBackgroundService.class));
        }

    }

    private Boolean ConnectionStatus(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm != null ? cm.getActiveNetworkInfo() : null;
        if (null != activeNetwork) {
            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return true;

            return activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE;
        }
        return false;
    }
}
