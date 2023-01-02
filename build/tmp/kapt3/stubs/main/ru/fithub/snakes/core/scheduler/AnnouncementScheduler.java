package ru.fithub.snakes.core.scheduler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lru/fithub/snakes/core/scheduler/AnnouncementScheduler;", "", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "serverRepository", "Lru/fithub/snakes/core/repostiory/ServerRepository;", "announcementPublisher", "Lru/fithub/snakes/event/basic/EventPublisher;", "Lru/fithub/snakes/event/SendAnnouncementMsgEvent;", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;Lru/fithub/snakes/core/repostiory/ServerRepository;Lru/fithub/snakes/event/basic/EventPublisher;Lru/fithub/snakes/core/service/MessageFormer;)V", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "createMessage", "Lru/fithub/snakes/core/model/GameAnnouncement;", "isStopped", "", "notifyAllAboutGame", "", "start", "stop", "snakes"})
public final class AnnouncementScheduler {
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    private final ru.fithub.snakes.core.repostiory.ServerRepository serverRepository = null;
    private final ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendAnnouncementMsgEvent> announcementPublisher = null;
    private final ru.fithub.snakes.core.service.MessageFormer messageFormer = null;
    private java.util.concurrent.ScheduledExecutorService scheduler;
    
    public AnnouncementScheduler(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ServerRepository serverRepository, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventPublisher<ru.fithub.snakes.event.SendAnnouncementMsgEvent> announcementPublisher, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.MessageFormer messageFormer) {
        super();
    }
    
    private final void notifyAllAboutGame() {
    }
    
    private final ru.fithub.snakes.core.model.GameAnnouncement createMessage() {
        return null;
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final boolean isStopped() {
        return false;
    }
}