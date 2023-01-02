package ru.fithub.snakes.core.service.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lru/fithub/snakes/core/service/other/ApplicationStateService;", "", "applicationStateType", "Lru/fithub/snakes/core/model/ApplicationStateType;", "getApplicationStateType", "()Lru/fithub/snakes/core/model/ApplicationStateType;", "setApplicationStateType", "(Lru/fithub/snakes/core/model/ApplicationStateType;)V", "nodeRole", "Lru/fithub/snakes/core/model/NodeRole;", "getNodeRole", "()Lru/fithub/snakes/core/model/NodeRole;", "setNodeRole", "(Lru/fithub/snakes/core/model/NodeRole;)V", "changeState", "", "newState", "newBehavior", "snakes"})
public abstract interface ApplicationStateService {
    
    @org.jetbrains.annotations.Nullable
    public abstract ru.fithub.snakes.core.model.ApplicationStateType getApplicationStateType();
    
    public abstract void setApplicationStateType(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.ApplicationStateType p0);
    
    @org.jetbrains.annotations.Nullable
    public abstract ru.fithub.snakes.core.model.NodeRole getNodeRole();
    
    public abstract void setNodeRole(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.NodeRole p0);
    
    public abstract void changeState(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.ApplicationStateType newState, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.NodeRole newBehavior);
}