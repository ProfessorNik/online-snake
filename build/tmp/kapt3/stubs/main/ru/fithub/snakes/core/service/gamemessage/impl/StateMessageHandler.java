package ru.fithub.snakes.core.service.gamemessage.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J:\u0010\u0017\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J&\u0010\u001f\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J/\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u00a2\u0006\u0002\u0010$R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lru/fithub/snakes/core/service/gamemessage/impl/StateMessageHandler;", "Lru/fithub/snakes/core/service/gamemessage/MessageHandler;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "sendAckMessageEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/AckMsg;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "gamePlayPresenter", "Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/core/service/MessageFormer;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;)V", "fillMasterId", "", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/StateMsg;", "fillPlayerId", "handle", "M", "clazz", "Ljava/lang/Class;", "ipAddress", "", "port", "", "handleStateMessage", "replyWithAckMessage", "msgSeq", "", "receiverId", "(JLjava/lang/Integer;Ljava/lang/String;I)V", "snakes"})
public final class StateMessageHandler implements ru.fithub.snakes.core.service.gamemessage.MessageHandler {
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> sendAckMessageEventPublisher = null;
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.core.infrastructure.GamePlayPresenter gamePlayPresenter = null;
    
    public StateMessageHandler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> sendAckMessageEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.infrastructure.GamePlayPresenter gamePlayPresenter) {
        super();
    }
    
    @java.lang.Override
    public <M extends java.lang.Object>void handle(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<M> msg, @org.jetbrains.annotations.NotNull
    java.lang.Class<M> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    private final void handleStateMessage(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg, java.lang.String ipAddress, int port) {
    }
    
    private final void fillMasterId(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg) {
    }
    
    private final void fillPlayerId(ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg) {
    }
    
    private final void replyWithAckMessage(long msgSeq, java.lang.Integer receiverId, java.lang.String ipAddress, int port) {
    }
}