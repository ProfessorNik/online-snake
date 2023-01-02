package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ:\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J&\u0010\u0014\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/JoinMessageHandler;", "Lru/fithub/snakes/core/service/gamemessage/MessageHandler;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "(Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ServerRepository;)V", "handle", "", "M", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "clazz", "Ljava/lang/Class;", "ipAddress", "", "port", "", "handleJoinMessage", "Lru/fithub/snakes/core/model/JoinMsg;", "hostAddress", "snakes"})
public final class JoinMessageHandler implements ru.fithub.snakes.core.service.gamemessage.MessageHandler {
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    
    public JoinMessageHandler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    private final void handleJoinMessage(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.JoinMsg> msg, java.lang.String hostAddress, int port) {
    }
}