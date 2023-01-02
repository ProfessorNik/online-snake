package me.nikol.snake.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b\u00a8\u0006-"}, d2 = {"Lme/nikol/snake/net/NetConfig;", "", "eventConfig", "Lme/nikol/snake/event/config/EventConfig;", "serviceConfig", "Lme/nikol/snake/game/config/ServiceConfig;", "(Lme/nikol/snake/event/config/EventConfig;Lme/nikol/snake/game/config/ServiceConfig;)V", "ackSender", "Lme/nikol/snake/net/sender/UnsafeMsgSender;", "Lme/nikol/snake/game/model/AckMsg;", "getAckSender", "()Lme/nikol/snake/net/sender/UnsafeMsgSender;", "announcementSender", "Lme/nikol/snake/net/sender/AnnouncementSender;", "getAnnouncementSender", "()Lme/nikol/snake/net/sender/AnnouncementSender;", "byteSender", "Lme/nikol/snake/net/sender/ByteSender;", "datagramSocket", "Ljava/net/DatagramSocket;", "errorSender", "Lme/nikol/snake/game/model/ErrorMsg;", "getErrorSender", "joinMsgSender", "Lme/nikol/snake/net/sender/SafeMsgSender;", "Lme/nikol/snake/game/model/JoinMsg;", "getJoinMsgSender", "()Lme/nikol/snake/net/sender/SafeMsgSender;", "multicastReceiver", "Lme/nikol/snake/net/receiver/MulticastReceiver;", "pingSender", "Lme/nikol/snake/game/model/PingMsg;", "getPingSender", "receiver", "Lme/nikol/snake/net/receiver/Receiver;", "roleChangeMsgSender", "Lme/nikol/snake/game/model/RoleChangeMsg;", "getRoleChangeMsgSender", "stateMsgSender", "Lme/nikol/snake/game/model/StateMsg;", "getStateMsgSender", "steerMsgSender", "Lme/nikol/snake/game/model/SteerMsg;", "getSteerMsgSender", "Companion", "core"})
public final class NetConfig {
    private final me.nikol.snake.event.config.EventConfig eventConfig = null;
    @org.jetbrains.annotations.NotNull
    public static final me.nikol.snake.net.NetConfig.Companion Companion = null;
    private static final me.nikol.snake.game.config.GameProperties properties = null;
    private static final int PORT = 0;
    private final java.net.DatagramSocket datagramSocket = null;
    private final me.nikol.snake.net.sender.ByteSender byteSender = null;
    private final me.nikol.snake.net.receiver.MulticastReceiver multicastReceiver = null;
    private final me.nikol.snake.net.receiver.Receiver receiver = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.AnnouncementSender announcementSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.UnsafeMsgSender<me.nikol.snake.game.model.AckMsg> ackSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.UnsafeMsgSender<me.nikol.snake.game.model.ErrorMsg> errorSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.PingMsg> pingSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.JoinMsg> joinMsgSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.SteerMsg> steerMsgSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.RoleChangeMsg> roleChangeMsgSender = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.StateMsg> stateMsgSender = null;
    
    public NetConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.config.EventConfig eventConfig, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.config.ServiceConfig serviceConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.AnnouncementSender getAnnouncementSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.UnsafeMsgSender<me.nikol.snake.game.model.AckMsg> getAckSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.UnsafeMsgSender<me.nikol.snake.game.model.ErrorMsg> getErrorSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.PingMsg> getPingSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.JoinMsg> getJoinMsgSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.SteerMsg> getSteerMsgSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.RoleChangeMsg> getRoleChangeMsgSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.net.sender.SafeMsgSender<me.nikol.snake.game.model.StateMsg> getStateMsgSender() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lme/nikol/snake/net/NetConfig$Companion;", "", "()V", "PORT", "", "properties", "Lme/nikol/snake/game/config/GameProperties;", "core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}