package ru.fithub.snakes.net.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00040123B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010)\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010,\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010-\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u001b\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u00064"}, d2 = {"Lru/fithub/snakes/net/sender/SafeByteSender;", "", "msgSeq", "", "datagramSocket", "Ljava/net/DatagramSocket;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "(JLjava/net/DatagramSocket;Lru/fithub/snakes/core/repostiory/GeneralRepository;)V", "getGeneralRepository", "()Lru/fithub/snakes/core/repostiory/GeneralRepository;", "hostname", "", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "getMsgSeq", "()J", "port", "", "getPort", "()I", "setPort", "(I)V", "scheduledMs", "getScheduledMs", "send", "", "stopper1", "Lru/fithub/snakes/net/sender/SafeByteSender$Stopper1;", "getStopper1", "()Lru/fithub/snakes/net/sender/SafeByteSender$Stopper1;", "stopper2", "Lru/fithub/snakes/net/sender/SafeByteSender$Stopper2;", "getStopper2", "()Lru/fithub/snakes/net/sender/SafeByteSender$Stopper2;", "stopper3", "Lru/fithub/snakes/net/sender/SafeByteSender$Stopper3;", "getStopper3", "()Lru/fithub/snakes/net/sender/SafeByteSender$Stopper3;", "changeIpAndPort", "", "isMsgSeq", "isReceiver", "isSendingMessage", "bytes", "", "Companion", "Stopper1", "Stopper2", "Stopper3", "snakes"})
public final class SafeByteSender {
    private final long msgSeq = 0L;
    private final java.net.DatagramSocket datagramSocket = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private boolean send = true;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeByteSender.Stopper1 stopper1 = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeByteSender.Stopper2 stopper2 = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeByteSender.Stopper3 stopper3 = null;
    public java.lang.String hostname;
    private int port = 0;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.net.sender.SafeByteSender.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final ru.fithub.snakes.core.config.GameProperties properties = null;
    private static final long sMs = 0L;
    
    public SafeByteSender(long msgSeq, @org.jetbrains.annotations.NotNull
    java.net.DatagramSocket datagramSocket, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository) {
        super();
    }
    
    public final long getMsgSeq() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.GeneralRepository getGeneralRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeByteSender.Stopper1 getStopper1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeByteSender.Stopper2 getStopper2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeByteSender.Stopper3 getStopper3() {
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
    
    private final long getScheduledMs() {
        return 0L;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/net/sender/SafeByteSender$Stopper1;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "safeByteSender", "Lru/fithub/snakes/net/sender/SafeByteSender;", "(Lru/fithub/snakes/net/sender/SafeByteSender;)V", "handle", "", "event", "snakes"})
    public static final class Stopper1 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> {
        private final ru.fithub.snakes.net.sender.SafeByteSender safeByteSender = null;
        
        public Stopper1(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.net.sender.SafeByteSender safeByteSender) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/net/sender/SafeByteSender$Stopper2;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/ErrorMsg;", "safeByteSender", "Lru/fithub/snakes/net/sender/SafeByteSender;", "(Lru/fithub/snakes/net/sender/SafeByteSender;)V", "handle", "", "event", "snakes"})
    public static final class Stopper2 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> {
        private final ru.fithub.snakes.net.sender.SafeByteSender safeByteSender = null;
        
        public Stopper2(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.net.sender.SafeByteSender safeByteSender) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/fithub/snakes/net/sender/SafeByteSender$Stopper3;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "safeByteSender", "Lru/fithub/snakes/net/sender/SafeByteSender;", "(Lru/fithub/snakes/net/sender/SafeByteSender;)V", "handle", "", "event", "snakes"})
    public static final class Stopper3 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> {
        private final ru.fithub.snakes.net.sender.SafeByteSender safeByteSender = null;
        
        public Stopper3(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.net.sender.SafeByteSender safeByteSender) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.StopSendMessagesToPlayerEvent event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lru/fithub/snakes/net/sender/SafeByteSender$Companion;", "", "()V", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "getProperties", "()Lru/fithub/snakes/core/config/GameProperties;", "sMs", "", "getSMs", "()J", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final ru.fithub.snakes.core.config.GameProperties getProperties() {
            return null;
        }
        
        public final long getSMs() {
            return 0L;
        }
    }
}