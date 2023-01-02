package ru.fithub.snakes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020:H\u0002J\b\u0010>\u001a\u00020:H\u0002J\b\u0010?\u001a\u00020:H\u0002J\b\u0010@\u001a\u00020:H\u0002J\u0010\u0010A\u001a\u00020:2\u0006\u00103\u001a\u000204H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006B"}, d2 = {"Lru/fithub/snakes/SnakesApplication;", "Ljavafx/application/Application;", "Lru/fithub/snakes/scenes/ScenePresenter;", "()V", "announcementView", "Ljavafx/scene/Scene;", "announcementViewController", "Lru/fithub/snakes/scenes/AnnouncementViewController;", "getAnnouncementViewController", "()Lru/fithub/snakes/scenes/AnnouncementViewController;", "setAnnouncementViewController", "(Lru/fithub/snakes/scenes/AnnouncementViewController;)V", "eventConfig", "Lru/fithub/snakes/event/config/EventConfig;", "getEventConfig", "()Lru/fithub/snakes/event/config/EventConfig;", "setEventConfig", "(Lru/fithub/snakes/event/config/EventConfig;)V", "gameView", "gameViewController", "Lru/fithub/snakes/scenes/GameViewController;", "getGameViewController", "()Lru/fithub/snakes/scenes/GameViewController;", "setGameViewController", "(Lru/fithub/snakes/scenes/GameViewController;)V", "joinView", "joinViewController", "Lru/fithub/snakes/scenes/JoinViewController;", "getJoinViewController", "()Lru/fithub/snakes/scenes/JoinViewController;", "setJoinViewController", "(Lru/fithub/snakes/scenes/JoinViewController;)V", "mainMenuController", "Lru/fithub/snakes/scenes/MainMenuController;", "getMainMenuController", "()Lru/fithub/snakes/scenes/MainMenuController;", "setMainMenuController", "(Lru/fithub/snakes/scenes/MainMenuController;)V", "mainMenuView", "netConfig", "Lru/fithub/snakes/net/NetConfig;", "getNetConfig", "()Lru/fithub/snakes/net/NetConfig;", "setNetConfig", "(Lru/fithub/snakes/net/NetConfig;)V", "serviceConfig", "Lru/fithub/snakes/core/config/ServiceConfig;", "getServiceConfig", "()Lru/fithub/snakes/core/config/ServiceConfig;", "setServiceConfig", "(Lru/fithub/snakes/core/config/ServiceConfig;)V", "stage", "Ljavafx/stage/Stage;", "getStage", "()Ljavafx/stage/Stage;", "setStage", "(Ljavafx/stage/Stage;)V", "changeScene", "", "sceneType", "Lru/fithub/snakes/scenes/SceneType;", "configure", "createAllViews", "createStage", "postConfigure", "start", "snakes"})
public final class SnakesApplication extends javafx.application.Application implements ru.fithub.snakes.scenes.ScenePresenter {
    public javafx.stage.Stage stage;
    public ru.fithub.snakes.event.config.EventConfig eventConfig;
    public ru.fithub.snakes.core.config.ServiceConfig serviceConfig;
    public ru.fithub.snakes.net.NetConfig netConfig;
    private javafx.scene.Scene mainMenuView;
    private javafx.scene.Scene gameView;
    private javafx.scene.Scene announcementView;
    private javafx.scene.Scene joinView;
    public ru.fithub.snakes.scenes.MainMenuController mainMenuController;
    public ru.fithub.snakes.scenes.GameViewController gameViewController;
    public ru.fithub.snakes.scenes.AnnouncementViewController announcementViewController;
    public ru.fithub.snakes.scenes.JoinViewController joinViewController;
    
    public SnakesApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.stage.Stage getStage() {
        return null;
    }
    
    public final void setStage(@org.jetbrains.annotations.NotNull
    javafx.stage.Stage p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.config.EventConfig getEventConfig() {
        return null;
    }
    
    public final void setEventConfig(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.config.EventConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.config.ServiceConfig getServiceConfig() {
        return null;
    }
    
    public final void setServiceConfig(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.config.ServiceConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.net.NetConfig getNetConfig() {
        return null;
    }
    
    public final void setNetConfig(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.net.NetConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.scenes.MainMenuController getMainMenuController() {
        return null;
    }
    
    public final void setMainMenuController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.scenes.MainMenuController p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.scenes.GameViewController getGameViewController() {
        return null;
    }
    
    public final void setGameViewController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.scenes.GameViewController p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.scenes.AnnouncementViewController getAnnouncementViewController() {
        return null;
    }
    
    public final void setAnnouncementViewController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.scenes.AnnouncementViewController p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.scenes.JoinViewController getJoinViewController() {
        return null;
    }
    
    public final void setJoinViewController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.scenes.JoinViewController p0) {
    }
    
    @java.lang.Override
    public void start(@org.jetbrains.annotations.NotNull
    javafx.stage.Stage stage) {
    }
    
    private final void postConfigure() {
    }
    
    private final void createAllViews() {
    }
    
    private final void createStage() {
    }
    
    private final void configure() {
    }
    
    @java.lang.Override
    public void changeScene(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.scenes.SceneType sceneType) {
    }
}