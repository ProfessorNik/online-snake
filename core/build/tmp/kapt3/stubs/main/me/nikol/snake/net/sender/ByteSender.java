package me.nikol.snake.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010J\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lme/nikol/snake/net/sender/ByteSender;", "", "datagramSocket", "Ljava/net/DatagramSocket;", "(Ljava/net/DatagramSocket;)V", "safeSend", "", "hostname", "", "port", "", "bytes", "", "msgSeq", "", "ackMsgPublisher", "Lme/nikol/snake/event/basic/EventPublisher;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/AckMsg;", "errorMsgPublisher", "Lme/nikol/snake/game/model/ErrorMsg;", "send", "core"})
public final class ByteSender {
    private final java.net.DatagramSocket datagramSocket = null;
    
    public ByteSender(@org.jetbrains.annotations.NotNull
    java.net.DatagramSocket datagramSocket) {
        super();
    }
    
    public final void send(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port, @org.jetbrains.annotations.NotNull
    byte[] bytes) {
    }
    
    public final void safeSend(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port, @org.jetbrains.annotations.NotNull
    byte[] bytes, long msgSeq, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg>> ackMsgPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> errorMsgPublisher) {
    }
}