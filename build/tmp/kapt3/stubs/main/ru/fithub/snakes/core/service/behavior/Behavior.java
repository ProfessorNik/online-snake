package ru.fithub.snakes.core.service.behavior;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH&J&\u0010\u001f\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H&J&\u0010\"\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H&J\b\u0010$\u001a\u00020\u0015H&J&\u0010%\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020&0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H&J&\u0010\'\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00172\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H&J\b\u0010*\u001a\u00020\u0015H&J\u0018\u0010+\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006,"}, d2 = {"Lru/fithub/snakes/core/service/behavior/Behavior;", "", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "getGameConfig", "()Lru/fithub/snakes/core/model/GameConfig;", "gamePlayPresenter", "Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;", "getGamePlayPresenter", "()Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;", "setGamePlayPresenter", "(Lru/fithub/snakes/core/infrastructure/GamePlayPresenter;)V", "messageFormer", "Lru/fithub/snakes/core/service/MessageFormer;", "getMessageFormer", "()Lru/fithub/snakes/core/service/MessageFormer;", "playerId", "", "getPlayerId", "()I", "addNewPlayer", "", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/JoinMsg;", "ipAddress", "", "port", "changeDirection", "direction", "Lru/fithub/snakes/core/model/Direction;", "changeDirectionByIpAndPort", "Lru/fithub/snakes/core/model/SteerMsg;", "hostAddress", "changeGameState", "Lru/fithub/snakes/core/model/StateMsg;", "endGame", "onPing", "Lru/fithub/snakes/core/model/PingMsg;", "onRoleChange", "gameMessage", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "startGame", "updateLastTimeMessage", "snakes"})
public abstract interface Behavior {
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.infrastructure.GamePlayPresenter getGamePlayPresenter();
    
    public abstract void setGamePlayPresenter(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.infrastructure.GamePlayPresenter p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.GameConfig getGameConfig();
    
    public abstract int getPlayerId();
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.service.MessageFormer getMessageFormer();
    
    public abstract void changeDirection(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.Direction direction);
    
    public abstract void changeGameState(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port);
    
    public abstract void addNewPlayer(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.JoinMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port);
    
    public abstract void onPing(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.PingMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port);
    
    public abstract void startGame();
    
    public abstract void endGame();
    
    public abstract void changeDirectionByIpAndPort(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.SteerMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port);
    
    public abstract void updateLastTimeMessage(@org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port);
    
    public abstract void onRoleChange(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> gameMessage, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port);
}