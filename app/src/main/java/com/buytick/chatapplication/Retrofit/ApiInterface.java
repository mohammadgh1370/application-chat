package com.buytick.chatapplication.Retrofit;

import com.buytick.chatapplication.Models.Message;

import java.util.HashMap;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("api/V1/message")
    Call<Message> sendMessage(@Body HashMap<String, String> map);

    @POST("api/V1/messages")
    Call<List<Message>> getMessages(@Body HashMap<String, String> map);

    @POST("api/V1/login")
    Call<Message.Sender> login(@Body Message.Sender user);

    @POST("api/V1/register")
    Call<Message.Sender> register(@Body Message.Sender user);

}
