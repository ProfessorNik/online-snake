package ru.fithub.snakes.core.service.other.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lru/fithub/snakes/core/service/other/impl/ApplicationStateServiceImpl;", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "gameService", "Lru/fithub/snakes/core/service/other/GameService;", "scenePresenter", "Lru/fithub/snakes/scenes/ScenePresenter;", "applicationStateRepository", "Lru/fithub/snakes/core/repostiory/ApplicationStateRepository;", "(Lru/fithub/snakes/core/service/other/GameService;Lru/fithub/snakes/scenes/ScenePresenter;Lru/fithub/snakes/core/repostiory/ApplicationStateRepository;)V", "applicationState", "Lru/fithub/snakes/core/service/other/impl/ApplicationState;", "getApplicationState", "()Lru/fithub/snakes/core/service/other/impl/ApplicationState;", "setApplicationState", "(Lru/fithub/snakes/core/service/other/impl/ApplicationState;)V", "value", "Lru/fithub/snakes/core/model/ApplicationStateType;", "applicationStateType", "getApplicationStateType", "()Lru/fithub/snakes/core/model/ApplicationStateType;", "setApplicationStateType", "(Lru/fithub/snakes/core/model/ApplicationStateType;)V", "Lru/fithub/snakes/core/model/NodeRole;", "nodeRole", "getNodeRole", "()Lru/fithub/snakes/core/model/NodeRole;", "setNodeRole", "(Lru/fithub/snakes/core/model/NodeRole;)V", "changeState", "", "newState", "newBehavior", "createState", "snakes"})
public final class ApplicationStateServiceImpl implements ru.fithub.snakes.core.service.other.ApplicationStateService {
    private final ru.fithub.snakes.core.service.other.GameService gameService = null;
    private final ru.fithub.snakes.scenes.ScenePresenter scenePresenter = null;
    private final ru.fithub.snakes.core.repostiory.ApplicationStateRepository applicationStateRepository = null;
    @org.jetbrains.annotations.NotNull
    private ru.fithub.snakes.core.service.other.impl.ApplicationState applicationState;
    
    public ApplicationStateServiceImpl(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.GameService gameService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.scenes.ScenePresenter scenePresenter, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.ApplicationStateRepository applicationStateRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public ru.fithub.snakes.core.model.ApplicationStateType getApplicationStateType() {
        return null;
    }
    
    @java.lang.Override
    public void setApplicationStateType(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.ApplicationStateType value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public ru.fithub.snakes.core.model.NodeRole getNodeRole() {
        return null;
    }
    
    @java.lang.Override
    public void setNodeRole(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.NodeRole value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.ApplicationState getApplicationState() {
        return null;
    }
    
    public final void setApplicationState(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.impl.ApplicationState p0) {
    }
    
    @java.lang.Override
    public void changeState(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.ApplicationStateType newState, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.NodeRole newBehavior) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.impl.ApplicationState createState(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.ApplicationStateType applicationStateType) {
        return null;
    }
}