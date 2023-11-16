/*
 * EchoCallback.java
 * MrBin99 © 2018
 */
package com.buytick.chatapplication.laravelechoandroid;


import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.Ack;

/**
 * Echo callback.
 */
public interface EchoCallback extends Emitter.Listener, Ack {
}
