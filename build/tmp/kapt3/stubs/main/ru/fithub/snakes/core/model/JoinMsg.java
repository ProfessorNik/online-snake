package ru.fithub.snakes.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lru/fithub/snakes/core/model/JoinMsg;", "", "playerType", "Lru/fithub/snakes/core/model/PlayerType;", "playerName", "", "gameName", "requestedRole", "Lru/fithub/snakes/core/model/NodeRole;", "(Lru/fithub/snakes/core/model/PlayerType;Ljava/lang/String;Ljava/lang/String;Lru/fithub/snakes/core/model/NodeRole;)V", "getGameName", "()Ljava/lang/String;", "getPlayerName", "getPlayerType", "()Lru/fithub/snakes/core/model/PlayerType;", "getRequestedRole", "()Lru/fithub/snakes/core/model/NodeRole;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "snakes"})
public final class JoinMsg {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.PlayerType playerType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String playerName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gameName = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.NodeRole requestedRole = null;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.JoinMsg copy(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.PlayerType playerType, @org.jetbrains.annotations.NotNull
    java.lang.String playerName, @org.jetbrains.annotations.NotNull
    java.lang.String gameName, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.NodeRole requestedRole) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public JoinMsg(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.PlayerType playerType, @org.jetbrains.annotations.NotNull
    java.lang.String playerName, @org.jetbrains.annotations.NotNull
    java.lang.String gameName, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.NodeRole requestedRole) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.PlayerType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.PlayerType getPlayerType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlayerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGameName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.NodeRole component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.NodeRole getRequestedRole() {
        return null;
    }
}