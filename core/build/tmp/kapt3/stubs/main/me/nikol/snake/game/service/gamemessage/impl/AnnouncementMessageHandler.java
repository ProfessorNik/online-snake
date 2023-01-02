package me.nikol.snake.game.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J:\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lme/nikol/snake/game/service/gamemessage/impl/AnnouncementMessageHandler;", "Lme/nikol/snake/game/service/gamemessage/MessageHandler;", "announcementService", "Lme/nikol/snake/game/service/other/AnnouncementService;", "(Lme/nikol/snake/game/service/other/AnnouncementService;)V", "getAnnouncementService", "()Lme/nikol/snake/game/service/other/AnnouncementService;", "changeBehavior", "", "behavior", "Lme/nikol/snake/game/service/behavior/Behavior;", "handle", "M", "msg", "Lme/nikol/snake/game/model/GameMessage;", "clazz", "Ljava/lang/Class;", "hostAddress", "", "port", "", "handleAnnouncementMsg", "Lme/nikol/snake/game/model/AnnouncementMsg;", "core"})
public final class AnnouncementMessageHandler implements me.nikol.snake.game.service.gamemessage.MessageHandler {
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.service.other.AnnouncementService announcementService = null;
    
    public AnnouncementMessageHandler(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.other.AnnouncementService announcementService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.other.AnnouncementService getAnnouncementService() {
        return null;
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
    
    private final void handleAnnouncementMsg(me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.AnnouncementMsg> msg, java.lang.String hostAddress, int port) {
    }
}