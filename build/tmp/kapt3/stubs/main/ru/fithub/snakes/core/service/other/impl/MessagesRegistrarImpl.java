package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001d\u001eBM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001f"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl;", "", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "ackPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "errorPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;)V", "getApplicationStateService", "()Lru/fithub/snakes/core/service/other/ApplicationStateService;", "getClientRepository", "()Lru/fithub/snakes/core/repostiory/ClientRepository;", "getGeneralRepository", "()Lru/fithub/snakes/core/repostiory/GeneralRepository;", "registrarAck", "Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl$RegistrarAck;", "registrarErr", "Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl$RegistrarErr;", "getServerRepository", "()Lru/fithub/snakes/core/repostiory/ServerRepository;", "RegistrarAck", "RegistrarErr", "snakes"})
public final class MessagesRegistrarImpl {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl.RegistrarAck registrarAck = null;
    private final ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl.RegistrarErr registrarErr = null;
    
    public MessagesRegistrarImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> ackPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorPublisher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.GeneralRepository getGeneralRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.ClientRepository getClientRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.ServerRepository getServerRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.ApplicationStateService getApplicationStateService() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl$RegistrarAck;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "messagesRegistrarImpl", "Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl;", "(Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl;)V", "handle", "", "event", "snakes"})
    public static final class RegistrarAck implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> {
        private final ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl messagesRegistrarImpl = null;
        
        public RegistrarAck(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl messagesRegistrarImpl) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg> event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl$RegistrarErr;", "Lru/fithub/snakes/event/basic/EventListener;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/ErrorMsg;", "messagesRegistrarImpl", "Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl;", "(Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl;)V", "handle", "", "event", "snakes"})
    public static final class RegistrarErr implements ru.fithub.snakes.event.basic.EventListener<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> {
        private final ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl messagesRegistrarImpl = null;
        
        public RegistrarErr(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl messagesRegistrarImpl) {
            super();
        }
        
        @java.lang.Override
        public void handle(@org.jetbrains.annotations.NotNull
        ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg> event) {
        }
    }
}