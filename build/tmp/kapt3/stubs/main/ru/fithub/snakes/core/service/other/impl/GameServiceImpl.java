package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 :2\u00020\u0001:\u0001:B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\u0002\u0010\u000eJ\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010\'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\"H\u0016J\b\u00103\u001a\u00020)H\u0016J\b\u00104\u001a\u00020\"H\u0016J\b\u00105\u001a\u00020\"H\u0016J\b\u00106\u001a\u00020\"H\u0016J\b\u00107\u001a\u00020\"H\u0016J\b\u00108\u001a\u00020\"H\u0016J\b\u00109\u001a\u00020)H\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/GameServiceImpl;", "Lru/fithub/snakes/core/service/other/GameService;", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "clientRepository", "Lru/fithub/snakes/core/repostiory/ClientRepository;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "roleChangeMsgEventPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ClientRepository;Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/core/service/MessageFormer;Lru/fithub/snakes/event/basic/EventPublisher;)V", "announcementGameStepScheduler", "Lru/fithub/snakes/core/scheduler/AnnouncementScheduler;", "getAnnouncementGameStepScheduler", "()Lru/fithub/snakes/core/scheduler/AnnouncementScheduler;", "setAnnouncementGameStepScheduler", "(Lru/fithub/snakes/core/scheduler/AnnouncementScheduler;)V", "clientScheduler", "Lru/fithub/snakes/core/scheduler/ClientScheduler;", "getClientScheduler", "()Lru/fithub/snakes/core/scheduler/ClientScheduler;", "setClientScheduler", "(Lru/fithub/snakes/core/scheduler/ClientScheduler;)V", "serverGameStepScheduler", "Lru/fithub/snakes/core/scheduler/ServerGameStepScheduler;", "getServerGameStepScheduler", "()Lru/fithub/snakes/core/scheduler/ServerGameStepScheduler;", "setServerGameStepScheduler", "(Lru/fithub/snakes/core/scheduler/ServerGameStepScheduler;)V", "clearAll", "", "clearClientRepository", "clearGeneralRepository", "clearMasterRepository", "clientToViewer", "deputyToMaster", "hasDeputy", "", "prepareClientGame", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "gameName", "", "masterIpAddress", "masterPort", "", "prepareServerGame", "serverSchedulersIsWorking", "setDeputyAsNewMaster", "startClientSchedulers", "startServerSchedulers", "stopClientSchedulers", "stopServerSchedulers", "wasServer", "Companion", "snakes"})
public final class GameServiceImpl implements ru.fithub.snakes.core.service.other.GameService {
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ClientRepository clientRepository = null;
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.RoleChangeMsg>> roleChangeMsgEventPublisher = null;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.core.service.other.impl.GameServiceImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final ru.fithub.snakes.core.config.GameFactory gameFactory = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PLAYER_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String GAME_NAME = null;
    public static final int PLAYER_ID = 1;
    public ru.fithub.snakes.core.scheduler.ClientScheduler clientScheduler;
    public ru.fithub.snakes.core.scheduler.ServerGameStepScheduler serverGameStepScheduler;
    public ru.fithub.snakes.core.scheduler.AnnouncementScheduler announcementGameStepScheduler;
    
    public GameServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ClientRepository clientRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.RoleChangeMsg>> roleChangeMsgEventPublisher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.scheduler.ClientScheduler getClientScheduler() {
        return null;
    }
    
    public final void setClientScheduler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.scheduler.ClientScheduler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.scheduler.ServerGameStepScheduler getServerGameStepScheduler() {
        return null;
    }
    
    public final void setServerGameStepScheduler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.scheduler.ServerGameStepScheduler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.scheduler.AnnouncementScheduler getAnnouncementGameStepScheduler() {
        return null;
    }
    
    public final void setAnnouncementGameStepScheduler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.scheduler.AnnouncementScheduler p0) {
    }
    
    @java.lang.Override
    public void prepareServerGame() {
    }
    
    @java.lang.Override
    public void startServerSchedulers() {
    }
    
    @java.lang.Override
    public void stopServerSchedulers() {
    }
    
    @java.lang.Override
    public void startClientSchedulers() {
    }
    
    @java.lang.Override
    public void stopClientSchedulers() {
    }
    
    @java.lang.Override
    public void prepareClientGame(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig, @org.jetbrains.annotations.NotNull
    java.lang.String gameName, @org.jetbrains.annotations.NotNull
    java.lang.String masterIpAddress, int masterPort) {
    }
    
    @java.lang.Override
    public void deputyToMaster() {
    }
    
    @java.lang.Override
    public void setDeputyAsNewMaster() {
    }
    
    @java.lang.Override
    public void clientToViewer() {
    }
    
    @java.lang.Override
    public boolean wasServer() {
        return false;
    }
    
    @java.lang.Override
    public boolean serverSchedulersIsWorking() {
        return false;
    }
    
    @java.lang.Override
    public boolean hasDeputy() {
        return false;
    }
    
    @java.lang.Override
    public void clearAll() {
    }
    
    private final void clearGeneralRepository() {
    }
    
    private final void clearClientRepository() {
    }
    
    private final void clearMasterRepository() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/GameServiceImpl$Companion;", "", "()V", "GAME_NAME", "", "getGAME_NAME", "()Ljava/lang/String;", "PLAYER_ID", "", "PLAYER_NAME", "getPLAYER_NAME", "gameFactory", "Lru/fithub/snakes/core/config/GameFactory;", "getGameFactory", "()Lru/fithub/snakes/core/config/GameFactory;", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final ru.fithub.snakes.core.config.GameFactory getGameFactory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPLAYER_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getGAME_NAME() {
            return null;
        }
    }
}