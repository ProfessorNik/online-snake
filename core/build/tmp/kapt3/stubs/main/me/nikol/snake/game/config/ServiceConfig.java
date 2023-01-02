package me.nikol.snake.game.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lme/nikol/snake/game/config/ServiceConfig;", "", "eventConfig", "Lme/nikol/snake/event/config/EventConfig;", "presenter", "Lme/nikol/snake/game/infrastructure/AnnouncementPresenter;", "main", "Lme/nikol/snake/game/Main;", "(Lme/nikol/snake/event/config/EventConfig;Lme/nikol/snake/game/infrastructure/AnnouncementPresenter;Lme/nikol/snake/game/Main;)V", "ackMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/AckMessageHandler;", "allMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/AllMessageHandler;", "announcementMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/AnnouncementMessageHandler;", "announcementService", "Lme/nikol/snake/game/service/other/AnnouncementService;", "getAnnouncementService", "()Lme/nikol/snake/game/service/other/AnnouncementService;", "setAnnouncementService", "(Lme/nikol/snake/game/service/other/AnnouncementService;)V", "errorMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/ErrorMessageHandler;", "gameMessageController", "Lme/nikol/snake/game/infrastructure/GameMessageController;", "getGameMessageController", "()Lme/nikol/snake/game/infrastructure/GameMessageController;", "joinMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/JoinMessageHandler;", "joinService", "Lme/nikol/snake/game/service/other/JoinService;", "getJoinService", "()Lme/nikol/snake/game/service/other/JoinService;", "messageService", "Lme/nikol/snake/game/service/gamemessage/GameMessageService;", "getMessageService", "()Lme/nikol/snake/game/service/gamemessage/GameMessageService;", "pingMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/PingMessageHandler;", "roleChangeMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/RoleChangeMessageHandler;", "stateMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/StateMessageHandler;", "steerMessageHandler", "Lme/nikol/snake/game/service/gamemessage/impl/SteerMessageHandler;", "core"})
public final class ServiceConfig {
    @org.jetbrains.annotations.NotNull
    private me.nikol.snake.game.service.other.AnnouncementService announcementService;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.service.other.JoinService joinService = null;
    private final me.nikol.snake.game.service.gamemessage.impl.AllMessageHandler allMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.JoinMessageHandler joinMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.PingMessageHandler pingMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.StateMessageHandler stateMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.SteerMessageHandler steerMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.AnnouncementMessageHandler announcementMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.AckMessageHandler ackMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.ErrorMessageHandler errorMessageHandler = null;
    private final me.nikol.snake.game.service.gamemessage.impl.RoleChangeMessageHandler roleChangeMessageHandler = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.service.gamemessage.GameMessageService messageService = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.infrastructure.GameMessageController gameMessageController = null;
    
    public ServiceConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.config.EventConfig eventConfig, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.infrastructure.AnnouncementPresenter presenter, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.Main main) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.other.AnnouncementService getAnnouncementService() {
        return null;
    }
    
    public final void setAnnouncementService(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.other.AnnouncementService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.other.JoinService getJoinService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.service.gamemessage.GameMessageService getMessageService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.infrastructure.GameMessageController getGameMessageController() {
        return null;
    }
}