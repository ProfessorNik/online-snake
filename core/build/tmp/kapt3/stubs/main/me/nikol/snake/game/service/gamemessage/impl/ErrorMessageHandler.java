package me.nikol.snake.game.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J:\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lme/nikol/snake/game/service/gamemessage/impl/ErrorMessageHandler;", "Lme/nikol/snake/game/service/gamemessage/MessageHandler;", "receivedErrorMessagePublisher", "Lme/nikol/snake/event/basic/EventPublisher;", "Lme/nikol/snake/event/ReceiveEvent;", "Lme/nikol/snake/game/model/ErrorMsg;", "(Lme/nikol/snake/event/basic/EventPublisher;)V", "changeBehavior", "", "behavior", "Lme/nikol/snake/game/service/behavior/Behavior;", "handle", "M", "msg", "Lme/nikol/snake/game/model/GameMessage;", "clazz", "Ljava/lang/Class;", "hostAddress", "", "port", "", "core"})
public final class ErrorMessageHandler implements me.nikol.snake.game.service.gamemessage.MessageHandler {
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> receivedErrorMessagePublisher = null;
    
    public ErrorMessageHandler(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.ReceiveEvent<me.nikol.snake.game.model.ErrorMsg>> receivedErrorMessagePublisher) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    @java.lang.Override
    public void changeBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior behavior) {
    }
}