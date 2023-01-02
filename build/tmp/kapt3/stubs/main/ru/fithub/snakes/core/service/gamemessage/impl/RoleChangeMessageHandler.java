package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001b\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001c\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J:\u0010\u001d\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u001e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010!\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\"\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/RoleChangeMessageHandler;", "Lru/fithub/snakes/core/service/gamemessage/MessageHandler;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "sendAckMessageEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "(Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/core/service/MessageFormer;Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/event/basic/EventPublisher;)V", "appointmentAsDeputy", "", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "ipAddress", "", "port", "", "appointmentAsMaster", "clientBecomeViewer", "deputyBecameMaster", "handle", "M", "clazz", "Ljava/lang/Class;", "handleRoleChangeMessage", "playerDead", "replyWithAckMessage", "msgSeq", "", "receiverId", "snakes"})
public final class RoleChangeMessageHandler implements ru.fithub.snakes.core.service.gamemessage.MessageHandler {
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> sendAckMessageEventPublisher = null;
    
    public RoleChangeMessageHandler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> sendAckMessageEventPublisher) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    private final void handleRoleChangeMessage(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void deputyBecameMaster(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void clientBecomeViewer(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void playerDead(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void appointmentAsMaster(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void appointmentAsDeputy(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void replyWithAckMessage(long msgSeq, int receiverId, java.lang.String ipAddress, int port) {
    }
}