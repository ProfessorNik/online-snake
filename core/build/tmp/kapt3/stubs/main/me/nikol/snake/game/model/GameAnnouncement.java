package me.nikol.snake.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lme/nikol/snake/game/model/GameAnnouncement;", "", "players", "Lme/nikol/snake/game/model/GamePlayers;", "config", "Lme/nikol/snake/game/model/GameConfig;", "canJoin", "", "gameName", "", "(Lme/nikol/snake/game/model/GamePlayers;Lme/nikol/snake/game/model/GameConfig;ZLjava/lang/String;)V", "getCanJoin", "()Z", "getConfig", "()Lme/nikol/snake/game/model/GameConfig;", "getGameName", "()Ljava/lang/String;", "getPlayers", "()Lme/nikol/snake/game/model/GamePlayers;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core"})
public final class GameAnnouncement {
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.model.GamePlayers players = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.model.GameConfig config = null;
    private final boolean canJoin = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gameName = null;
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameAnnouncement copy(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayers players, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig config, @com.fasterxml.jackson.annotation.JsonProperty(value = "can_join")
    boolean canJoin, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "game_name")
    java.lang.String gameName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GameAnnouncement(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayers players, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig config, @com.fasterxml.jackson.annotation.JsonProperty(value = "can_join")
    boolean canJoin, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "game_name")
    java.lang.String gameName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GamePlayers component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GamePlayers getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameConfig component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameConfig getConfig() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getCanJoin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGameName() {
        return null;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
}