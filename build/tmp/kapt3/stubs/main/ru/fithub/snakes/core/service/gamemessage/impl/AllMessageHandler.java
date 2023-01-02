package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J:\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/AllMessageHandler;", "Lru/fithub/snakes/core/service/gamemessage/MessageHandler;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "(Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/core/service/other/ApplicationStateService;)V", "continueConnection", "", "connection", "Lru/fithub/snakes/core/model/Connection;", "handle", "M", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "clazz", "Ljava/lang/Class;", "ipAddress", "", "port", "", "snakes"})
public final class AllMessageHandler implements ru.fithub.snakes.core.service.gamemessage.MessageHandler {
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    
    public AllMessageHandler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    private final void continueConnection(ru.fithub.snakes.core.model.Connection connection) {
    }
}