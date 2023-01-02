package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ:\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J4\u0010\u001a\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/FilterOnAnsweredMessages;", "Lru/fithub/snakes/core/service/gamemessage/MessageFilter;", "ackPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "errorPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "(Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/core/service/other/ApplicationStateService;)V", "filter", "", "M", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "clazz", "Ljava/lang/Class;", "ipAddress", "", "port", "", "filterAndSend", "connection", "Lru/fithub/snakes/core/model/Connection;", "snakes"})
public final class FilterOnAnsweredMessages implements ru.fithub.snakes.core.service.gamemessage.MessageFilter {
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> ackPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorPublisher = null;
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    
    public FilterOnAnsweredMessages(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> ackPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>boolean filter(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
        return false;
    }
    
    private final <M extends java.lang.Object>boolean filterAndSend(ru.fithub.snakes.core.model.Connection connection, ru.fithub.snakes.core.model.GameMessage<M> msg, java.lang.String ipAddress, int port) {
        return false;
    }
}