package ru.fithub.snakes.event.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\b\u00a8\u0006)"}, d2 = {"Lru/fithub/snakes/event/config/EventConfig;", "", "()V", "receiveAckMsgEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "getReceiveAckMsgEventPublisher", "()Lru/fithub/snakes/event/basic/EventPublisher;", "receiveErrorMsgEventPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "getReceiveErrorMsgEventPublisher", "sendAckMsgEventPublisher", "Lru/fithub/snakes/event/SendEvent;", "getSendAckMsgEventPublisher", "sendAnnouncementMsgEventPublisher", "Lru/fithub/snakes/event/SendAnnouncementMsgEvent;", "getSendAnnouncementMsgEventPublisher", "sendDiscoverMsgEventPublisher", "Lru/fithub/snakes/core/model/DiscoverMsg;", "getSendDiscoverMsgEventPublisher", "sendErrorMsgEventPublisher", "getSendErrorMsgEventPublisher", "sendJoinMsgEventPublisher", "Lru/fithub/snakes/core/model/JoinMsg;", "getSendJoinMsgEventPublisher", "sendPingMsgEventPublisher", "Lru/fithub/snakes/core/model/PingMsg;", "getSendPingMsgEventPublisher", "sendRoleChangeMsgEventPublisher", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "getSendRoleChangeMsgEventPublisher", "sendStateMsgEventPublisher", "Lru/fithub/snakes/core/model/StateMsg;", "getSendStateMsgEventPublisher", "sendSteerMsgEventPublisher", "Lru/fithub/snakes/core/model/SteerMsg;", "getSendSteerMsgEventPublisher", "stopSendMessagesToPlayerEventPublisher", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "getStopSendMessagesToPlayerEventPublisher", "snakes"})
public final class EventConfig {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendAnnouncementMsgEvent> sendAnnouncementMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> sendAckMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.SteerMsg>> sendSteerMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.JoinMsg>> sendJoinMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> receiveAckMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> receiveErrorMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.DiscoverMsg>> sendDiscoverMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> sendErrorMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.PingMsg>> sendPingMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.RoleChangeMsg>> sendRoleChangeMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.StateMsg>> sendStateMsgEventPublisher = null;
    
    public EventConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendAnnouncementMsgEvent> getSendAnnouncementMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> getSendAckMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.SteerMsg>> getSendSteerMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.JoinMsg>> getSendJoinMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> getReceiveAckMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> getReceiveErrorMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.DiscoverMsg>> getSendDiscoverMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> getStopSendMessagesToPlayerEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> getSendErrorMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.PingMsg>> getSendPingMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.RoleChangeMsg>> getSendRoleChangeMsgEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.StateMsg>> getSendStateMsgEventPublisher() {
        return null;
    }
}