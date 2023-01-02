package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J:\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/GameMessageServiceImpl;", "Lru/fithub/snakes/core/service/gamemessage/GameMessageService;", "handlers", "", "Lru/fithub/snakes/core/service/gamemessage/MessageHandler;", "messageFilter", "Lru/fithub/snakes/core/service/gamemessage/MessageFilter;", "(Ljava/util/List;Lru/fithub/snakes/core/service/gamemessage/MessageFilter;)V", "getMessageFilter", "()Lru/fithub/snakes/core/service/gamemessage/MessageFilter;", "handleMessage", "", "M", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "clazz", "Ljava/lang/Class;", "ipAddress", "", "port", "", "snakes"})
public final class GameMessageServiceImpl implements ru.fithub.snakes.core.service.gamemessage.GameMessageService {
    private final java.util.List<ru.fithub.snakes.core.service.gamemessage.MessageHandler> handlers = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.gamemessage.MessageFilter messageFilter = null;
    
    public GameMessageServiceImpl(@org.jetbrains.annotations.NotNull
    java.util.List<? extends ru.fithub.snakes.core.service.gamemessage.MessageHandler> handlers, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.gamemessage.MessageFilter messageFilter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.gamemessage.MessageFilter getMessageFilter() {
        return null;
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handleMessage(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
}