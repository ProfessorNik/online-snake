package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002JB\u0010\u0017\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00190\u00182\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/AnnouncementServiceImpl;", "Lru/fithub/snakes/core/service/other/AnnouncementService;", "announcementPresenter", "Lru/fithub/snakes/core/infrastructure/AnnouncementPresenter;", "(Lru/fithub/snakes/core/infrastructure/AnnouncementPresenter;)V", "activeGames", "", "Lru/fithub/snakes/core/model/GameAnnouncement;", "Lru/fithub/snakes/core/model/Destination;", "schedulerCollectionGarbageAnnouncement", "Ljava/util/concurrent/ScheduledExecutorService;", "getSchedulerCollectionGarbageAnnouncement", "()Ljava/util/concurrent/ScheduledExecutorService;", "addNewGame", "", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/AnnouncementMsg;", "hostAddress", "", "port", "", "collectionGarbageAnnouncement", "map", "", "Lkotlin/Triple;", "Lru/fithub/snakes/core/model/DelayedMessage;", "Lru/fithub/snakes/core/model/JoinMsg;", "showGames", "Companion", "snakes"})
public final class AnnouncementServiceImpl implements ru.fithub.snakes.core.service.other.AnnouncementService {
    private final ru.fithub.snakes.core.infrastructure.AnnouncementPresenter announcementPresenter = null;
    private final java.util.Map<ru.fithub.snakes.core.model.GameAnnouncement, ru.fithub.snakes.core.model.Destination> activeGames = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ScheduledExecutorService schedulerCollectionGarbageAnnouncement = null;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.core.service.other.impl.AnnouncementServiceImpl.Companion Companion = null;
    private static final ru.fithub.snakes.core.config.GameProperties properties = null;
    private static final java.lang.String PLAYER_NAME = null;
    private static final long ANNOUNCEMENT_EXPIRATION_TIME = 0L;
    private static final long GARBAGE_ANNOUNCEMENT_COLLECTION_TIME = 0L;
    
    public AnnouncementServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.infrastructure.AnnouncementPresenter announcementPresenter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.ScheduledExecutorService getSchedulerCollectionGarbageAnnouncement() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void addNewGame(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AnnouncementMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    private final void showGames() {
    }
    
    private final java.util.List<kotlin.Triple<ru.fithub.snakes.core.model.GameAnnouncement, ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg>, ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg>>> map(java.util.Map<ru.fithub.snakes.core.model.GameAnnouncement, ru.fithub.snakes.core.model.Destination> activeGames) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void collectionGarbageAnnouncement() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/AnnouncementServiceImpl$Companion;", "", "()V", "ANNOUNCEMENT_EXPIRATION_TIME", "", "GARBAGE_ANNOUNCEMENT_COLLECTION_TIME", "PLAYER_NAME", "", "properties", "Lru/fithub/snakes/core/config/GameProperties;", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}