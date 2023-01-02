package me.nikol.snake.game.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J:\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lme/nikol/snake/game/service/gamemessage/impl/RoleChangeMessageHandler;", "Lme/nikol/snake/game/service/gamemessage/MessageHandler;", "()V", "behavior", "Lme/nikol/snake/game/service/behavior/Behavior;", "getBehavior", "()Lme/nikol/snake/game/service/behavior/Behavior;", "setBehavior", "(Lme/nikol/snake/game/service/behavior/Behavior;)V", "changeBehavior", "", "handle", "M", "msg", "Lme/nikol/snake/game/model/GameMessage;", "clazz", "Ljava/lang/Class;", "hostAddress", "", "port", "", "handleRoleChangeMessage", "gameMessage", "Lme/nikol/snake/game/model/RoleChangeMsg;", "core"})
public final class RoleChangeMessageHandler implements me.nikol.snake.game.service.gamemessage.MessageHandler {
    @org.jetbrains.annotations.NotNull
    private me.nikol.snake.game.service.behavior.Behavior behavior;
    
    public RoleChangeMessageHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.behavior.Behavior getBehavior() {
        return null;
    }
    
    public final void setBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior p0) {
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    private final void handleRoleChangeMessage(me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.RoleChangeMsg> gameMessage, java.lang.String hostAddress, int port) {
    }
    
    @java.lang.Override
    public void changeBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior behavior) {
    }
}