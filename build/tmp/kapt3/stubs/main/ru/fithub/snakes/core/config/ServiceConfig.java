package ru.fithub.snakes.core.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u00101\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u00107\u001a\u000208\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020<X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lru/fithub/snakes/core/config/ServiceConfig;", "", "eventConfig", "Lru/fithub/snakes/event/config/EventConfig;", "snakesApplication", "Lru/fithub/snakes/SnakesApplication;", "(Lru/fithub/snakes/event/config/EventConfig;Lru/fithub/snakes/SnakesApplication;)V", "ackMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/AckMessageHandler;", "allMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/AllMessageHandler;", "announcementMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/AnnouncementMessageHandler;", "announcementPresenter", "Lru/fithub/snakes/core/infrastructure/AnnouncementPresenter;", "getAnnouncementPresenter", "()Lru/fithub/snakes/core/infrastructure/AnnouncementPresenter;", "announcementScheduler", "Lru/fithub/snakes/core/scheduler/AnnouncementScheduler;", "announcementService", "Lru/fithub/snakes/core/service/other/AnnouncementService;", "applicationStateRepository", "Lru/fithub/snakes/core/repostiory/ApplicationStateRepository;", "applicationStateService", "Lru/fithub/snakes/core/service/other/impl/ApplicationStateServiceImpl;", "getApplicationStateService", "()Lru/fithub/snakes/core/service/other/impl/ApplicationStateServiceImpl;", "changeDirectionService", "Lru/fithub/snakes/core/service/other/impl/ChangeDirectionServiceImpl;", "getChangeDirectionService", "()Lru/fithub/snakes/core/service/other/impl/ChangeDirectionServiceImpl;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "clientScheduler", "Lru/fithub/snakes/core/scheduler/ClientScheduler;", "errorMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/ErrorMessageHandler;", "filterOnAnsweredMessages", "Lru/fithub/snakes/core/service/gamemessage/impl/FilterOnAnsweredMessages;", "gameMessageController", "Lru/fithub/snakes/core/infrastructure/GameMessageController;", "getGameMessageController", "()Lru/fithub/snakes/core/infrastructure/GameMessageController;", "gamePlayPresenter", "Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;", "getGamePlayPresenter", "()Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;", "gameService", "Lru/fithub/snakes/core/service/other/impl/GameServiceImpl;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "getGeneralRepository", "()Lru/fithub/snakes/core/repostiory/GeneralRepository;", "joinMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/JoinMessageHandler;", "joinService", "Lru/fithub/snakes/core/service/other/JoinService;", "getJoinService", "()Lru/fithub/snakes/core/service/other/JoinService;", "makeDeputyService", "Lru/fithub/snakes/core/service/other/impl/MakeDeputyServiceImpl;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "messageService", "Lru/fithub/snakes/core/service/gamemessage/GameMessageService;", "messagesRegistrar", "Lru/fithub/snakes/core/service/other/impl/MessagesRegistrarImpl;", "pingMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/PingMessageHandler;", "roleChangeMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/RoleChangeMessageHandler;", "serverGameStepScheduler", "Lru/fithub/snakes/core/scheduler/ServerGameStepScheduler;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "stateMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/StateMessageHandler;", "steerMessageHandler", "Lru/fithub/snakes/core/service/gamemessage/impl/SteerMessageHandler;", "snakes"})
public final class ServiceConfig {
    private final ru.fithub.snakes.core.repostiory.ApplicationStateRepository applicationStateRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.infrastructure.AnnouncementPresenter announcementPresenter = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.infrastructure.GamePlayPresenter gamePlayPresenter = null;
    private final ru.fithub.snakes.core.service.other.impl.MakeDeputyServiceImpl makeDeputyService = null;
    private final ru.fithub.snakes.core.service.other.impl.GameServiceImpl gameService = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.impl.ApplicationStateServiceImpl applicationStateService = null;
    private final ru.fithub.snakes.core.scheduler.ServerGameStepScheduler serverGameStepScheduler = null;
    private final ru.fithub.snakes.core.scheduler.AnnouncementScheduler announcementScheduler = null;
    private final ru.fithub.snakes.core.scheduler.ClientScheduler clientScheduler = null;
    private final ru.fithub.snakes.core.service.other.AnnouncementService announcementService = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.impl.ChangeDirectionServiceImpl changeDirectionService = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.JoinService joinService = null;
    private final ru.fithub.snakes.core.service.other.impl.MessagesRegistrarImpl messagesRegistrar = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.FilterOnAnsweredMessages filterOnAnsweredMessages = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.AllMessageHandler allMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.JoinMessageHandler joinMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.PingMessageHandler pingMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.StateMessageHandler stateMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.SteerMessageHandler steerMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.AnnouncementMessageHandler announcementMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.AckMessageHandler ackMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.ErrorMessageHandler errorMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.impl.RoleChangeMessageHandler roleChangeMessageHandler = null;
    private final ru.fithub.snakes.core.service.gamemessage.GameMessageService messageService = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.infrastructure.GameMessageController gameMessageController = null;
    
    public ServiceConfig(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.config.EventConfig eventConfig, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.SnakesApplication snakesApplication) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.GeneralRepository getGeneralRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.infrastructure.AnnouncementPresenter getAnnouncementPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.infrastructure.GamePlayPresenter getGamePlayPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.ApplicationStateServiceImpl getApplicationStateService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.ChangeDirectionServiceImpl getChangeDirectionService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.JoinService getJoinService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.infrastructure.GameMessageController getGameMessageController() {
        return null;
    }
}