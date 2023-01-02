package me.nikol.snake.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0004*+,-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\'\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0015\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006."}, d2 = {"Lme/nikol/snake/net/sender/SafeByteSender;", "", "msgSeq", "", "datagramSocket", "Ljava/net/DatagramSocket;", "(JLjava/net/DatagramSocket;)V", "hostname", "", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "getMsgSeq", "()J", "port", "", "getPort", "()I", "setPort", "(I)V", "send", "", "stopper1", "Lme/nikol/snake/net/sender/SafeByteSender$Stopper1;", "getStopper1", "()Lme/nikol/snake/net/sender/SafeByteSender$Stopper1;", "stopper2", "Lme/nikol/snake/net/sender/SafeByteSender$Stopper2;", "getStopper2", "()Lme/nikol/snake/net/sender/SafeByteSender$Stopper2;", "stopper3", "Lme/nikol/snake/net/sender/SafeByteSender$Stopper3;", "getStopper3", "()Lme/nikol/snake/net/sender/SafeByteSender$Stopper3;", "changeIpAndPort", "", "isMsgSeq", "isReceiver", "isSendingMessage", "bytes", "", "Companion", "Stopper1", "Stopper2", "Stopper3", "core"})
public final class SafeByteSender {
    private final long msgSeq = 0L;
    private final java.net.DatagramSocket datagramSocket = null;
    private boolean send = true;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeByteSender.Stopper1 stopper1 = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeByteSender.Stopper2 stopper2 = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeByteSender.Stopper3 stopper3 = null;
    public java.lang.String hostname;
    private int port = 0;
    @org.jetbrains.annotations.NotNull
    public static final me.nikol.snake.net.sender.SafeByteSender.Companion Companion = null;
    private static final me.nikol.snake.game.config.GameProperties properties = null;
    private static final long SCHEDULED_MS = 0L;
    
    public SafeByteSender(long msgSeq, @org.jetbrains.annotations.NotNull
    java.net.DatagramSocket datagramSocket) {
        super();
    }
    
    public final long getMsgSeq() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeByteSender.Stopper1 getStopper1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeByteSender.Stopper2 getStopper2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeByteSender.Stopper3 getStopper3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHostname() {
        return null;
    }
    
    public final void setHostname(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getPort() {
        return 0;
    }
    
    public final void setPort(int p0) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void send(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port, @org.jetbrains.annotations.NotNull
    byte[] bytes) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void changeIpAndPort(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port) {
    }
    
    public final boolean isReceiver(@org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port) {
        return false;
    }
    
    private final boolean isMsgSeq(long msgSeq) {
        return false;
    }
    
    public final boolean isSendingMessage(long msgSeq, @org.jetbrains.annotations.NotNull
    java.lang.String hostname, int port) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lme/nikol/snake/net/sender/SafeByteSender$Stopper1;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/AckMsg;", "safeByteSender", "Lme/nikol/snake/net/sender/SafeByteSender;", "(Lme/nikol/snake/net/sender/SafeByteSender;)V", "handle", "", "event", "core"})
    public static final class Stopper1 implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg>> {
        private final me.nikol.snake.net.sender.SafeByteSender safeByteSender = null;
        
        public Stopper1(@org.jetbrains.annotations.NotNull
        me.nikol.snake.net.sender.SafeByteSender safeByteSender) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lme/nikol/snake/net/sender/SafeByteSender$Stopper2;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/ErrorMsg;", "safeByteSender", "Lme/nikol/snake/net/sender/SafeByteSender;", "(Lme/nikol/snake/net/sender/SafeByteSender;)V", "handle", "", "event", "core"})
    public static final class Stopper2 implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> {
        private final me.nikol.snake.net.sender.SafeByteSender safeByteSender = null;
        
        public Stopper2(@org.jetbrains.annotations.NotNull
        me.nikol.snake.net.sender.SafeByteSender safeByteSender) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/nikol/snake/net/sender/SafeByteSender$Stopper3;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/StopSendMessagesToPlayerEvent;", "safeByteSender", "Lme/nikol/snake/net/sender/SafeByteSender;", "(Lme/nikol/snake/net/sender/SafeByteSender;)V", "handle", "", "event", "core"})
    public static final class Stopper3 implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.StopSendMessagesToPlayerEvent> {
        private final me.nikol.snake.net.sender.SafeByteSender safeByteSender = null;
        
        public Stopper3(@org.jetbrains.annotations.NotNull
        me.nikol.snake.net.sender.SafeByteSender safeByteSender) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        me.nikol.snake.event.StopSendMessagesToPlayerEvent event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lme/nikol/snake/net/sender/SafeByteSender$Companion;", "", "()V", "SCHEDULED_MS", "", "properties", "Lme/nikol/snake/game/config/GameProperties;", "core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}