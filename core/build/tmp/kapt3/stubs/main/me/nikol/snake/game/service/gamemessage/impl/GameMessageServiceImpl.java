package me.nikol.snake.game.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J:\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lme/nikol/snake/game/service/gamemessage/impl/GameMessageServiceImpl;", "Lme/nikol/snake/game/service/gamemessage/GameMessageService;", "handlers", "", "Lme/nikol/snake/game/service/gamemessage/MessageHandler;", "(Ljava/util/List;)V", "logger", "Lcom/badlogic/gdx/utils/Logger;", "changeBehavior", "", "behavior", "Lme/nikol/snake/game/service/behavior/Behavior;", "handleMessage", "M", "msg", "Lme/nikol/snake/game/model/GameMessage;", "clazz", "Ljava/lang/Class;", "hostAddress", "", "port", "", "core"})
public final class GameMessageServiceImpl implements me.nikol.snake.game.service.gamemessage.GameMessageService {
    private final java.util.List<me.nikol.snake.game.service.gamemessage.MessageHandler> handlers = null;
    private final com.badlogic.gdx.utils.Logger logger = null;
    
    public GameMessageServiceImpl(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.nikol.snake.game.service.gamemessage.MessageHandler> handlers) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handleMessage(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    @java.lang.Override
    public void changeBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.behavior.Behavior behavior) {
    }
}