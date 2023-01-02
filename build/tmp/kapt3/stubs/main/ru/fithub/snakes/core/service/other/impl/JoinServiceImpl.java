package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002+,BQ\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u0005\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0003H\u0016J\u001e\u0010(\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u0006\u0010*\u001a\u00020 H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006-"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl;", "Lru/fithub/snakes/core/service/other/JoinService;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveAckMsgEvent;", "joinPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/JoinMsg;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "gameService", "Lru/fithub/snakes/core/service/other/GameService;", "ackMsgEventPublisher", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "errorMsgEventPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "(Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/service/other/GameService;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;)V", "joinMsgSeq", "", "joinNodeRole", "Lru/fithub/snakes/core/model/NodeRole;", "getJoinNodeRole", "()Lru/fithub/snakes/core/model/NodeRole;", "setJoinNodeRole", "(Lru/fithub/snakes/core/model/NodeRole;)V", "listener1", "Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl$Listener1;", "listener2", "Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl$Listener2;", "masterMsg", "Lru/fithub/snakes/core/model/DelayedMessage;", "Lru/fithub/snakes/core/model/GameAnnouncement;", "getMasterMsg", "()Lru/fithub/snakes/core/model/DelayedMessage;", "setMasterMsg", "(Lru/fithub/snakes/core/model/DelayedMessage;)V", "handle", "", "event", "join", "msg", "parentMsg", "Listener1", "Listener2", "snakes"})
public final class JoinServiceImpl implements ru.fithub.snakes.core.service.other.JoinService, ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveAckMsgEvent> {
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.JoinMsg>> joinPublisher = null;
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.core.service.other.GameService gameService = null;
    private final ru.fithub.snakes.core.service.other.impl.JoinServiceImpl.Listener1 listener1 = null;
    private final ru.fithub.snakes.core.service.other.impl.JoinServiceImpl.Listener2 listener2 = null;
    private final long joinMsgSeq = 1L;
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.GameAnnouncement> masterMsg;
    public ru.fithub.snakes.core.model.NodeRole joinNodeRole;
    
    public JoinServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.JoinMsg>> joinPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.GameService gameService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgEventPublisher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.GameAnnouncement> getMasterMsg() {
        return null;
    }
    
    public final void setMasterMsg(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.GameAnnouncement> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.NodeRole getJoinNodeRole() {
        return null;
    }
    
    public final void setJoinNodeRole(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.NodeRole p0) {
    }
    
    @java.lang.Override
    public void join(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg> msg, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameAnnouncement parentMsg) {
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.ReceiveAckMsgEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl$Listener1;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "joinService", "Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl;", "(Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl;)V", "handle", "", "event", "snakes"})
    public static final class Listener1 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg>> {
        private final ru.fithub.snakes.core.service.other.impl.JoinServiceImpl joinService = null;
        
        public Listener1(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.JoinServiceImpl joinService) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.AckMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl$Listener2;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/ReceiveEvent;", "Lru/fithub/snakes/core/model/ErrorMsg;", "joinService", "Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl;", "(Lru/fithub/snakes/core/service/other/impl/JoinServiceImpl;)V", "handle", "", "event", "snakes"})
    public static final class Listener2 implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg>> {
        private final ru.fithub.snakes.core.service.other.impl.JoinServiceImpl joinService = null;
        
        public Listener2(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.JoinServiceImpl joinService) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.ReceiveEvent<ru.fithub.snakes.core.model.ErrorMsg> event) {
        }
    }
}