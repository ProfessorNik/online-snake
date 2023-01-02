package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/AnnouncementMessageHandler;", "Lru/fithub/snakes/core/service/gamemessage/MessageHandler;", "announcementService", "Lru/fithub/snakes/core/service/other/AnnouncementService;", "(Lru/fithub/snakes/core/service/other/AnnouncementService;)V", "handle", "", "M", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "clazz", "Ljava/lang/Class;", "ipAddress", "", "port", "", "handleAnnouncementMsg", "Lru/fithub/snakes/core/model/AnnouncementMsg;", "hostAddress", "snakes"})
public final class AnnouncementMessageHandler implements ru.fithub.snakes.core.service.gamemessage.MessageHandler {
    private final ru.fithub.snakes.core.service.other.AnnouncementService announcementService = null;
    
    public AnnouncementMessageHandler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.AnnouncementService announcementService) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    private final void handleAnnouncementMsg(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AnnouncementMsg> msg, java.lang.String hostAddress, int port) {
    }
}