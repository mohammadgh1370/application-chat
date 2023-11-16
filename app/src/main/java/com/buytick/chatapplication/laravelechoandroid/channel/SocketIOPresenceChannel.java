/*
 * SocketIOPresenceChannel.java
 * MrBin99 © 2018
 */
package com.buytick.chatapplication.laravelechoandroid.channel;


import com.buytick.chatapplication.laravelechoandroid.EchoCallback;
import com.buytick.chatapplication.laravelechoandroid.EchoOptions;
import com.github.nkzawa.socketio.client.Socket;

/**
 * This class represents a Socket.io presence channel.
 */
public class SocketIOPresenceChannel extends SocketIOPrivateChannel implements IPresenceChannel {

    /**
     * Create a new Socket.IO presence channel.
     *
     * @param socket  the socket
     * @param name    channel name
     * @param options Echo options
     */
    public SocketIOPresenceChannel(Socket socket, String name, EchoOptions options) {
        super(socket, name, options);
    }

    @Override
    public IPresenceChannel here(EchoCallback callback) {
        on("presence:joining", callback);

        return this;
    }

    @Override
    public IPresenceChannel joining(EchoCallback callback) {
        on("presence:subscribed", callback);

        return this;
    }

    @Override
    public IPresenceChannel leaving(EchoCallback callback) {
        on("presence:leaving", callback);

        return this;
    }
}
