package me.nikol.snake.game.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u001e\u001fBI\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0016\u0010\u001b\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lme/nikol/snake/game/service/other/impl/JoinServiceImpl;", "Lme/nikol/snake/game/service/other/JoinService;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/ReceiveAckMsgEvent;", "joinPublisher", "Lme/nikol/snake/event/basic/EventPublisher;", "Lme/nikol/snake/event/SendEvent;", "Lme/nikol/snake/game/model/JoinMsg;", "main", "Lme/nikol/snake/game/Main;", "ackMsgEventPublisher", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/AckMsg;", "errorMsgEventPublisher", "Lme/nikol/snake/game/model/ErrorMsg;", "(Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/game/Main;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;)V", "listener1", "Lme/nikol/snake/game/service/other/impl/JoinServiceImpl$Listener1;", "getListener1", "()Lme/nikol/snake/game/service/other/impl/JoinServiceImpl$Listener1;", "listener2", "Lme/nikol/snake/game/service/other/impl/JoinServiceImpl$Listener2;", "getListener2", "()Lme/nikol/snake/game/service/other/impl/JoinServiceImpl$Listener2;", "handle", "", "event", "join", "msg", "Lme/nikol/snake/game/model/DelayedMessage;", "Listener1", "Listener2", "core"})
public final class JoinServiceImpl implements me.nikol.snake.game.service.other.JoinService, me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.ReceiveAckMsgEvent> {
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.JoinMsg>> joinPublisher = null;
    private final me.nikol.snake.game.Main main = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.service.other.impl.JoinServiceImpl.Listener1 listener1 = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.service.other.impl.JoinServiceImpl.Listener2 listener2 = null;
    
    public JoinServiceImpl(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.JoinMsg>> joinPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.Main main, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg>> ackMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> errorMsgEventPublisher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.other.impl.JoinServiceImpl.Listener1 getListener1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.other.impl.JoinServiceImpl.Listener2 getListener2() {
        return null;
    }
    
    @java.lang.Override
    public void join(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.JoinMsg> msg) {
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.ReceiveAckMsgEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lme/nikol/snake/game/service/other/impl/JoinServiceImpl$Listener1;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/AckMsg;", "joinService", "Lme/nikol/snake/game/service/other/impl/JoinServiceImpl;", "(Lme/nikol/snake/game/service/other/impl/JoinServiceImpl;)V", "handle", "", "event", "core"})
    public static final class Listener1 implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg>> {
        private final me.nikol.snake.game.service.other.impl.JoinServiceImpl joinService = null;
        
        public Listener1(@org.jetbrains.annotations.NotNull
        me.nikol.snake.game.service.other.impl.JoinServiceImpl joinService) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.AckMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lme/nikol/snake/game/service/other/impl/JoinServiceImpl$Listener2;", "Lme/nikol/snake/event/basic/EventListener;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/ErrorMsg;", "joinService", "Lme/nikol/snake/game/service/other/impl/JoinServiceImpl;", "(Lme/nikol/snake/game/service/other/impl/JoinServiceImpl;)V", "handle", "", "event", "core"})
    public static final class Listener2 implements me.nikol.snake.event.basic.EventListener<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> {
        private final me.nikol.snake.game.service.other.impl.JoinServiceImpl joinService = null;
        
        public Listener2(@org.jetbrains.annotations.NotNull
        me.nikol.snake.game.service.other.impl.JoinServiceImpl joinService) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg> event) {
        }
    }
}