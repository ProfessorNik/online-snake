package ru.fithub.snakes.core.scheduler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Lru/fithub/snakes/core/scheduler/ClientScheduler;", "", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "pingMsgEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/PingMsg;", "stopSendMessagesToPlayerEventPublisher", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/service/MessageFormer;)V", "pingDisconnectedTime", "", "getPingDisconnectedTime", "()I", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "timeToPing", "", "getTimeToPing", "()D", "isStopped", "", "masterLeft", "", "pingMaster", "start", "stop", "snakes"})
public final class ClientScheduler {
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.PingMsg>> pingMsgEventPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher = null;
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    private java.util.concurrent.ScheduledExecutorService scheduler;
    
    public ClientScheduler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.PingMsg>> pingMsgEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer) {
        super();
    }
    
    private final int getPingDisconnectedTime() {
        return 0;
    }
    
    private final double getTimeToPing() {
        return 0.0;
    }
    
    private final void pingMaster() {
    }
    
    private final void masterLeft() {
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final boolean isStopped() {
        return false;
    }
}