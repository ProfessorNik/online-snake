package ru.fithub.snakes.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b\u00a8\u0006-"}, d2 = {"Lru/fithub/snakes/net/NetConfig;", "", "eventConfig", "Lru/fithub/snakes/event/config/EventConfig;", "serviceConfig", "Lru/fithub/snakes/core/config/ServiceConfig;", "(Lru/fithub/snakes/event/config/EventConfig;Lru/fithub/snakes/core/config/ServiceConfig;)V", "ackSender", "Lru/fithub/snakes/net/sender/UnsafeMsgSender;", "Lru/fithub/snakes/core/model/AckMsg;", "getAckSender", "()Lru/fithub/snakes/net/sender/UnsafeMsgSender;", "announcementSender", "Lru/fithub/snakes/net/sender/AnnouncementSender;", "getAnnouncementSender", "()Lru/fithub/snakes/net/sender/AnnouncementSender;", "byteSender", "Lru/fithub/snakes/net/sender/ByteSender;", "datagramSocket", "Ljava/net/DatagramSocket;", "errorSender", "Lru/fithub/snakes/core/model/ErrorMsg;", "getErrorSender", "joinMsgSender", "Lru/fithub/snakes/net/sender/SafeMsgSender;", "Lru/fithub/snakes/core/model/JoinMsg;", "getJoinMsgSender", "()Lru/fithub/snakes/net/sender/SafeMsgSender;", "multicastReceiver", "Lru/fithub/snakes/net/receiver/MulticastReceiver;", "pingSender", "Lru/fithub/snakes/core/model/PingMsg;", "getPingSender", "receiver", "Lru/fithub/snakes/net/receiver/Receiver;", "roleChangeMsgSender", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "getRoleChangeMsgSender", "stateMsgSender", "Lru/fithub/snakes/core/model/StateMsg;", "getStateMsgSender", "steerMsgSender", "Lru/fithub/snakes/core/model/SteerMsg;", "getSteerMsgSender", "Companion", "snakes"})
public final class NetConfig {
    private final ru.fithub.snakes.event.config.EventConfig eventConfig = null;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.net.NetConfig.Companion Companion = null;
    private static final ru.fithub.snakes.core.config.GameProperties properties = null;
    private static final int PORT = 0;
    private final java.net.DatagramSocket datagramSocket = null;
    private final ru.fithub.snakes.net.sender.ByteSender byteSender = null;
    private final ru.fithub.snakes.net.receiver.MulticastReceiver multicastReceiver = null;
    private final ru.fithub.snakes.net.receiver.Receiver receiver = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.AnnouncementSender announcementSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.UnsafeMsgSender<ru.fithub.snakes.core.model.AckMsg> ackSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.UnsafeMsgSender<ru.fithub.snakes.core.model.ErrorMsg> errorSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.PingMsg> pingSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.JoinMsg> joinMsgSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.SteerMsg> steerMsgSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.RoleChangeMsg> roleChangeMsgSender = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.StateMsg> stateMsgSender = null;
    
    public NetConfig(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.config.EventConfig eventConfig, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.config.ServiceConfig serviceConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.AnnouncementSender getAnnouncementSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.UnsafeMsgSender<ru.fithub.snakes.core.model.AckMsg> getAckSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.UnsafeMsgSender<ru.fithub.snakes.core.model.ErrorMsg> getErrorSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.PingMsg> getPingSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.JoinMsg> getJoinMsgSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.SteerMsg> getSteerMsgSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.RoleChangeMsg> getRoleChangeMsgSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.sender.SafeMsgSender<ru.fithub.snakes.core.model.StateMsg> getStateMsgSender() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/fithub/snakes/net/NetConfig$Companion;", "", "()V", "PORT", "", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}