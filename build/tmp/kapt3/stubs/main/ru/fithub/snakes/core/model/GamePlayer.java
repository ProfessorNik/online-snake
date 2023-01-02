package ru.fithub.snakes.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003JX\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lru/fithub/snakes/core/model/GamePlayer;", "", "name", "", "id", "", "ipAddress", "port", "role", "Lru/fithub/snakes/core/model/NodeRole;", "type", "Lru/fithub/snakes/core/model/PlayerType;", "score", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lru/fithub/snakes/core/model/NodeRole;Lru/fithub/snakes/core/model/PlayerType;I)V", "getId", "()I", "getIpAddress", "()Ljava/lang/String;", "getName", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRole", "()Lru/fithub/snakes/core/model/NodeRole;", "getScore", "getType", "()Lru/fithub/snakes/core/model/PlayerType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lru/fithub/snakes/core/model/NodeRole;Lru/fithub/snakes/core/model/PlayerType;I)Lru/fithub/snakes/core/model/GamePlayer;", "equals", "", "other", "hashCode", "toString", "snakes"})
public final class GamePlayer {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ipAddress = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer port = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.NodeRole role = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.PlayerType type = null;
    private final int score = 0;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GamePlayer copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, int id, @org.jetbrains.annotations.Nullable
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable
    java.lang.Integer port, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.NodeRole role, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.PlayerType type, int score) {
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
    
    public GamePlayer(@org.jetbrains.annotations.NotNull
    java.lang.String name, int id, @org.jetbrains.annotations.Nullable
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable
    java.lang.Integer port, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.NodeRole role, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.PlayerType type, int score) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIpAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.NodeRole component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.NodeRole getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.PlayerType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.PlayerType getType() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getScore() {
        return 0;
    }
}