package com.buytick.chatapplication.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.buytick.chatapplication.Adapters.MessageAdapter;
import com.buytick.chatapplication.App;
import com.buytick.chatapplication.Models.Data;
import com.buytick.chatapplication.Models.Message;
import com.buytick.chatapplication.Models.Result;
import com.buytick.chatapplication.R;
import com.buytick.chatapplication.laravelechoandroid.Echo;
import com.buytick.chatapplication.laravelechoandroid.EchoCallback;
import com.buytick.chatapplication.laravelechoandroid.EchoOptions;
import com.buytick.chatapplication.laravelechoandroid.channel.SocketIOPresenceChannel;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    private boolean mTyping = false;

    public Message.Sender currentUser = new Message.Sender();
    public Echo echo;

    private RecyclerView mMessagesRecycler;
    private EditText mInputMessageView;
    private ImageButton sendButton;
    private List<Message> mMessages = new ArrayList<>();
    private MessageAdapter mAdapter;
    private int first = 0;


    Data data = new Data();
    Result result = new Result();
    List<Data> dataList = new ArrayList<>();
    Gson gson = new Gson();
    private String partnerUserId = "";

    @SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_main, container);

        initialize();

//        addMessage("mohammad", "hellokkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", true);
//        addMessage("fafa", "hi", false);

    }

    private void initialize() {
        findViews();
        instance();
        setting();
        echoSocket();
    }

    private void findViews() {
        mMessagesRecycler = (RecyclerView) findViewById(R.id.messages);
        mInputMessageView = (EditText) findViewById(R.id.message_input);
        sendButton = (ImageButton) findViewById(R.id.send_button);
    }

    private void instance() {
        mAdapter = new MessageAdapter(getApplicationContext(), mMessages);
    }

    private void setting() {
        mMessagesRecycler.setLayoutManager(new LinearLayoutManager(this));
        mMessagesRecycler.setAdapter(mAdapter);

        mInputMessageView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int id, KeyEvent event) {
                if (id == R.id.send_button || id == EditorInfo.IME_NULL) {
                    attemptSend();
                    return true;
                }
                return false;
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptSend();
            }
        });
    }

    private void echoSocket() {

        currentUser = App.pref().getCurrentUser();

        EchoOptions options = new EchoOptions();
        options.host = App.SOCKET_BASE_URL;
        options.eventNamespace = "";
        options.headers.put("Authorization", "Bearer " + currentUser.getApi_token());
        options.headers.put("Accept", "application/json");
        options.headers.put("Content-Type", "application/json");
        echo = new Echo(options);
        echo.connect(new EchoCallback() {
            @Override
            public void call(Object... args) {

            }
        }, new EchoCallback() {
            @Override
            public void call(Object... args) {

            }
        });

        echo.channel("chat-" + currentUser.getId())
                .listen(".message_send", new EchoCallback() {
                    @Override
                    public void call(Object... args) {
                        Log.e("message", args[0].toString());
                        JSONObject object = (JSONObject) args[1];
                        result = gson.fromJson(object.toString(), Result.class);
                        Log.e(TAG + " message", result.getMessage().getBody());
                        addMessage(result.getMessage().getSender().getName(),
                                result.getMessage().getBody(),
                                result.getMessage().getSenderId().equals(currentUser.getId()));
                    }
                });


        SocketIOPresenceChannel presenceChannel = echo.presenceChannel("chat");
        presenceChannel.here(new EchoCallback() {
            @Override
            public void call(Object... args) {

//                String data = (String) args[0];
//                Log.e(TAG + " here", data);
                JSONObject object = (JSONObject) args[1];
                data = gson.fromJson(object.toString(), Data.class);
                Log.e(TAG + " here", data.getUserInfo().getName());
                addLog(getResources().getString(R.string.message_user_joined, data.getUserInfo().getName()));
            }
        });
        presenceChannel.joining(new EchoCallback() {
            @Override
            public void call(Object... args) {
//                first parameter give channel name.
//                second parameter give array of users online.
//                String data = (String) args[0];
//                Log.e(TAG + " joining", data);

                JSONArray jsonArray = (JSONArray) args[1];
                for (int i = 0; i < jsonArray.length(); i++) {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        dataList.add(gson.fromJson(jsonObject.toString(), Data.class));
                        if (!dataList.get(i).getUserInfo().getId().equals(currentUser.getId())) {
                            addLog(getResources().getString(R.string.message_user_joined, dataList.get(i).getUserInfo().getName()));
                            Log.e(TAG + " joining", getResources().getString(R.string.message_user_joined, dataList.get(i).getUserInfo().getName()));
                            partnerUserId = dataList.get(i).getUserInfo().getId();
                            if (first == 0) {
                                getMessages();
                                first = 1;
                            }
//                            partnerUser.setName(dataList.get(i).getUserInfo().getName());
//                            partnerUser.setId(dataList.get(i).getUserInfo().getId());
//                            Log.e("partnerUserId", dataList.get(i).getUserInfo().getId());
//                            Log.e("partnerUserId", partnerUser.getId());
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        presenceChannel.leaving(new EchoCallback() {
            @Override
            public void call(Object... args) {
//                first parameter give channel name.
//                second parameter give array of users online.
//                String data = (String) args[0];
//                Log.e(TAG + " leaving", data);
                JSONObject object = (JSONObject) args[1];
                data = gson.fromJson(object.toString(), Data.class);
                Log.e(TAG + " leaving", data.getUserInfo().getName());
                addLog(getResources().getString(R.string.message_user_left, data.getUserInfo().getName()));
            }
        });
    }

    private void getMessages() {
            final HashMap<String, String> map = new HashMap<>();
            map.put("api_token", currentUser.getApi_token());
            map.put("sender_id", partnerUserId);

            Call<List<Message>> call = apiInterface.getMessages(map);

            call.enqueue(new Callback<List<Message>>() {
                @Override
                public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                    if (response.isSuccessful()) {
                        try {
                            for (int i = 0; i < response.body().size(); i++) {
                                Log.e("response", response.body().get(i).getBody());
                                addMessage(response.body().get(i).getSender().getName(),
                                        response.body().get(i).getBody(),
                                        response.body().get(i).isSelfMessage());
                            }
                        } catch (Exception e) {
                        }
                    }
                    Log.e("response", response.code() + "");
                    Log.e("response", response.message());
                    Log.e("response", response.toString());
                }

                @Override
                public void onFailure(Call<List<Message>> call, Throwable t) {
                    Log.e("error", t.getMessage());
                }
            });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        echo.disconnect();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_leave) {
//            leave();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

//    private void leave() {
//        currentUser = null;
//        mSocket.disconnect();
//        mSocket.connect();
//        pref.setCurrentUser(null);
//        startSignIn();
//    }

    private void startSignIn() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    private void attemptSend() {
        if (null == currentUser.getId()) return;

        String message = mInputMessageView.getText().toString().trim();
        if (TextUtils.isEmpty(message)) {
            mInputMessageView.requestFocus();
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("sender_id", currentUser.getId());
        map.put("api_token", currentUser.getApi_token());
        map.put("receiver_id", partnerUserId);
        map.put("body", message);
        Call<Message> call = apiInterface.sendMessage(map);

        call.enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                if (response.isSuccessful()){
                    addMessage(currentUser.getName(), response.body().getBody(), true);
                }
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                Log.e("ret error", t.getMessage());
            }
        });
        mInputMessageView.setText("");
    }

    private void addMessage(String username, String message, boolean selfMessage) {
        int type = 0;
        if (selfMessage)
            type = Message.TYPE_SELF_MESSAGE;
        else
            type = Message.TYPE_OTHER_MESSAGE;
        mMessages.add(new Message.Builder(type)
                .username(username).message(message).selfMessage(selfMessage).build());
        scrollToBottom();
    }

    private void addLog(String message) {
        mMessages.add(new Message.Builder(Message.TYPE_LOG)
                .message(message).build());
        scrollToBottom();
    }

    private void scrollToBottom() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mAdapter.notifyItemInserted(mMessages.size() - 1);
                mMessagesRecycler.scrollToPosition(mAdapter.getItemCount() - 1);
            }
        });
    }

    private void removeTyping(String username) {
        for (int i = mMessages.size() - 1; i >= 0; i--) {
            Message message = mMessages.get(i);
            if (message.getType() == Message.TYPE_ACTION && message.getSender().getName().equals(username)) {
                mMessages.remove(i);
                mAdapter.notifyItemRemoved(i);
            }
        }
    }

//    private void addParticipantsLog(int connectedUsers) {
//        addLog(getResources().getQuantityString(R.plurals.message_participants, connectedUsers, connectedUsers));
//    }

    private void addTyping(String username) {
        mMessages.add(new Message.Builder(Message.TYPE_ACTION)
                .username(username).build());
        mAdapter.notifyItemInserted(mMessages.size() - 1);
        scrollToBottom();
    }

    private Runnable onTypingTimeout = new Runnable() {
        @Override
        public void run() {
            if (!mTyping) return;

            mTyping = false;
//            mSocket.emit("stop typing");
        }
    };

}
