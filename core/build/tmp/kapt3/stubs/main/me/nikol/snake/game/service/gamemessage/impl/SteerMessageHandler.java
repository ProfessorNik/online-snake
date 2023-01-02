package me.nikol.snake.game.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J:\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lme/nikol/snake/game/service/gamemessage/impl/SteerMessageHandler;", "Lme/nikol/snake/game/service/gamemessage/MessageHandler;", "()V", "behavior", "Lme/nikol/snake/game/service/behavior/Behavior;", "changeBehavior", "", "handle", "M", "msg", "Lme/nikol/snake/game/model/GameMessage;", "clazz", "Ljava/lang/Class;", "hostAddress", "", "port", "", "handleSteerMsg", "Lme/nikol/snake/game/model/SteerMsg;", "core"})
public final class SteerMessageHandler implements me.nikol.snake.game.service.gamemessage.MessageHandler {
    private me.nikol.snake.game.service.behavior.Behavior behavior;
    
    public SteerMessageHandler() {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    private final void handleSteerMsg(me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.SteerMsg> msg, java.lang.String hostAddress, int port) {
    }
    
    @java.lang.Override
    public void changeBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior behavior) {
    }
}