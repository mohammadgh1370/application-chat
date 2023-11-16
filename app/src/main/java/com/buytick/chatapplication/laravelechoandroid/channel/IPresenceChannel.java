/*
 * IPresenceChannel.java
 * MrBin99 © 2018
 */
package com.buytick.chatapplication.laravelechoandroid.channel;


import com.buytick.chatapplication.laravelechoandroid.EchoCallback;

/**
 * This interface represents a presence channel.
 */
public interface IPresenceChannel {

    /**
     * Register a callback to be called anytime the member list changes.
     *
     * @param callback callback
     * @return the channel
     */
    IPresenceChannel here(EchoCallback callback);

    /**
     * Listen for someone joining the channel.
     *
     * @param callback callback
     * @return the channel
     */
    IPresenceChannel joining(EchoCallback callback);

    /**
     * Listen for someone leaving the channel.
     *
     * @param callback callback
     * @return the channel
     */
    IPresenceChannel leaving(EchoCallback callback);
}
