package ru.fithub.snakes.core.repostiory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010,\u001a\u0004\u0018\u00010#2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020#\u00a2\u0006\u0002\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010)\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000e\u00a8\u00060"}, d2 = {"Lru/fithub/snakes/core/repostiory/GeneralRepository;", "", "()V", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "getGameConfig", "()Lru/fithub/snakes/core/model/GameConfig;", "setGameConfig", "(Lru/fithub/snakes/core/model/GameConfig;)V", "gameName", "", "getGameName", "()Ljava/lang/String;", "setGameName", "(Ljava/lang/String;)V", "gameState", "Lru/fithub/snakes/core/model/GameState;", "getGameState", "()Lru/fithub/snakes/core/model/GameState;", "setGameState", "(Lru/fithub/snakes/core/model/GameState;)V", "msgSeq", "", "getMsgSeq", "()Ljava/lang/Long;", "setMsgSeq", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "newDirection", "Lru/fithub/snakes/core/model/Direction;", "getNewDirection", "()Lru/fithub/snakes/core/model/Direction;", "setNewDirection", "(Lru/fithub/snakes/core/model/Direction;)V", "playerId", "", "getPlayerId", "()Ljava/lang/Integer;", "setPlayerId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "playerName", "getPlayerName", "setPlayerName", "findPlayerIdByIpAndPort", "ipAddress", "port", "(Ljava/lang/String;I)Ljava/lang/Integer;", "snakes"})
public final class GeneralRepository {
    @org.jetbrains.annotations.Nullable
    private java.lang.Long msgSeq;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer playerId;
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.core.model.Direction newDirection;
    @org.jetbrains.annotations.Nullable
    private java.lang.String playerName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String gameName;
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.core.model.GameState gameState;
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.core.model.GameConfig gameConfig;
    
    public GeneralRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getMsgSeq() {
        return null;
    }
    
    public final void setMsgSeq(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPlayerId() {
        return null;
    }
    
    public final void setPlayerId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.Direction getNewDirection() {
        return null;
    }
    
    public final void setNewDirection(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.Direction p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlayerName() {
        return null;
    }
    
    public final void setPlayerName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGameName() {
        return null;
    }
    
    public final void setGameName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.GameState getGameState() {
        return null;
    }
    
    public final void setGameState(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.GameState p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.GameConfig getGameConfig() {
        return null;
    }
    
    public final void setGameConfig(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.GameConfig p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer findPlayerIdByIpAndPort(@org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
        return null;
    }
}