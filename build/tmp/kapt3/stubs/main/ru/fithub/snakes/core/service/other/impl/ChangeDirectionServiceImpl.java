package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/ChangeDirectionServiceImpl;", "Lru/fithub/snakes/core/service/other/ChangeDirectionService;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "sendSteerMessageEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/SteerMsg;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "repository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "(Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/service/MessageFormer;Lru/fithub/snakes/core/repostiory/GeneralRepository;)V", "getApplicationStateService", "()Lru/fithub/snakes/core/service/other/ApplicationStateService;", "getClientRepository", "()Lru/fithub/snakes/core/repostiory/ClientRepository;", "getMessageFormer", "()Lru/fithub/snakes/core/service/MessageFormer;", "getRepository", "()Lru/fithub/snakes/core/repostiory/GeneralRepository;", "getSendSteerMessageEventPublisher", "()Lru/fithub/snakes/event/basic/EventPublisher;", "changeDirection", "", "direction", "Lru/fithub/snakes/core/model/Direction;", "snakes"})
public final class ChangeDirectionServiceImpl implements ru.fithub.snakes.core.service.other.ChangeDirectionService {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.SteerMsg>> sendSteerMessageEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.GeneralRepository repository = null;
    
    public ChangeDirectionServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.SteerMsg>> sendSteerMessageEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.ApplicationStateService getApplicationStateService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.ClientRepository getClientRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.SteerMsg>> getSendSteerMessageEventPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.MessageFormer getMessageFormer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.GeneralRepository getRepository() {
        return null;
    }
    
    @java.lang.Override
    public void changeDirection(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.Direction direction) {
    }
}