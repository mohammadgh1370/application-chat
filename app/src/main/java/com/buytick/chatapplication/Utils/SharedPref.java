package com.buytick.chatapplication.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.buytick.chatapplication.Models.Message;
import com.google.gson.Gson;

public class SharedPref {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Gson gson;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "androidhive-welcome";

    private static final String IS_LOGIN = "IsLogin";

    private static final String User = "User";

    public SharedPref(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
        gson = new Gson();
    }

    public void Login(){
        editor.putBoolean(IS_LOGIN,true);
        editor.apply();
    }

    public boolean isLogin(){
        return pref.getBoolean(IS_LOGIN, false);
    }

    public void setCurrentUser(Message.Sender sender) {
        editor.putString(User, gson.toJson(sender));
        editor.apply();
    }

    public Message.Sender getCurrentUser() {
        return gson.fromJson(pref.getString(User,""), Message.Sender.class);
    }

}
