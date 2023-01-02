package ru.fithub.snakes.core.scheduler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u000f\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u000f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f\u00a2\u0006\u0002\u0010\u001aJ\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020(J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0002J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020-0,H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001cH\u0002J\b\u00104\u001a\u00020&H\u0002J\u0006\u00105\u001a\u00020&J\u0006\u00106\u001a\u00020&J\b\u00107\u001a\u00020&H\u0002R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\u00a8\u00068"}, d2 = {"Lru/fithub/snakes/core/scheduler/ServerGameStepScheduler;", "", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "gamePlayPresenter", "Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "makeDeputyService", "Lru/fithub/snakes/core/service/other/MakeDeputyService;", "stateMsgEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/StateMsg;", "errorMsgPublisher", "Lru/fithub/snakes/core/model/ErrorMsg;", "ackMsgEventPublisher", "Lru/fithub/snakes/core/model/AckMsg;", "pingMsgEventPublisher", "Lru/fithub/snakes/core/model/PingMsg;", "stopSendMessagesToPlayerEventPublisher", "Lru/fithub/snakes/event/StopSendMessagesToPlayerEvent;", "(Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;Lru/fithub/snakes/core/service/MessageFormer;Lru/fithub/snakes/core/service/other/MakeDeputyService;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/event/basic/EventPublisher;)V", "disconnectedTime", "", "getDisconnectedTime", "()I", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "timeToPing", "", "getTimeToPing", "()D", "checkOnNewNormalConnection", "", "isStopped", "", "joinPlayers", "maybeBecomeClient", "newDirections", "", "Lru/fithub/snakes/core/model/Direction;", "pingPlayers", "publishNewGameState", "removeDisconnectedPlayers", "removePlayer", "Lru/fithub/snakes/core/model/GameState;", "playerId", "setViewers", "start", "stop", "updateGameState", "snakes"})
public final class ServerGameStepScheduler {
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.core.infrastructure.GamePlayPresenter gamePlayPresenter = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    private final ru.fithub.snakes.core.service.other.MakeDeputyService makeDeputyService = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.StateMsg>> stateMsgEventPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgEventPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.PingMsg>> pingMsgEventPublisher = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher = null;
    private java.util.concurrent.ScheduledExecutorService scheduler;
    
    public ServerGameStepScheduler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.infrastructure.GamePlayPresenter gamePlayPresenter, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.MakeDeputyService makeDeputyService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.StateMsg>> stateMsgEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.ErrorMsg>> errorMsgPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.AckMsg>> ackMsgEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.PingMsg>> pingMsgEventPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher) {
        super();
    }
    
    private final int getDisconnectedTime() {
        return 0;
    }
    
    private final double getTimeToPing() {
        return 0.0;
    }
    
    private final void updateGameState() {
    }
    
    private final void setViewers() {
    }
    
    private final void maybeBecomeClient() {
    }
    
    private final java.util.Map<java.lang.Integer, ru.fithub.snakes.core.model.Direction> newDirections() {
        return null;
    }
    
    private final void publishNewGameState() {
    }
    
    private final void checkOnNewNormalConnection() {
    }
    
    private final void joinPlayers() {
    }
    
    public final void start() {
    }
    
    public final boolean isStopped() {
        return false;
    }
    
    public final void stop() {
    }
    
    private final ru.fithub.snakes.core.model.GameState removePlayer(int playerId) {
        return null;
    }
    
    private final void removeDisconnectedPlayers() {
    }
    
    private final void pingPlayers() {
    }
}