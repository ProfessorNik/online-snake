package me.nikol.snake.game.service.behavior.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\'0\u001e2\u0006\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J&\u0010)\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020*0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J&\u0010,\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020-0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J&\u0010.\u001a\u00020\u001c2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001e2\u0006\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\u0018\u00102\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00063"}, d2 = {"Lme/nikol/snake/game/service/behavior/impl/NothingBehavior;", "Lme/nikol/snake/game/service/behavior/Behavior;", "()V", "gameConfig", "Lme/nikol/snake/game/model/GameConfig;", "getGameConfig", "()Lme/nikol/snake/game/model/GameConfig;", "setGameConfig", "(Lme/nikol/snake/game/model/GameConfig;)V", "gamePlayPresenter", "Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "getGamePlayPresenter", "()Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "setGamePlayPresenter", "(Lme/nikol/snake/game/infrastructure/GamePlayPresenter;)V", "messageFormer", "Lme/nikol/snake/game/service/MessageFormer;", "getMessageFormer", "()Lme/nikol/snake/game/service/MessageFormer;", "setMessageFormer", "(Lme/nikol/snake/game/service/MessageFormer;)V", "playerId", "", "getPlayerId", "()I", "setPlayerId", "(I)V", "addNewPlayer", "", "msg", "Lme/nikol/snake/game/model/GameMessage;", "Lme/nikol/snake/game/model/JoinMsg;", "ipAddress", "", "port", "changeDirection", "direction", "Lme/nikol/snake/game/model/Direction;", "changeDirectionByIpAndPort", "Lme/nikol/snake/game/model/SteerMsg;", "hostAddress", "changeGameState", "Lme/nikol/snake/game/model/StateMsg;", "endGame", "onPing", "Lme/nikol/snake/game/model/PingMsg;", "onRoleChange", "gameMessage", "Lme/nikol/snake/game/model/RoleChangeMsg;", "startGame", "updateLastTimeMessage", "core"})
public final class NothingBehavior implements me.nikol.snake.game.service.behavior.Behavior {
    public me.nikol.snake.game.infrastructure.GamePlayPresenter gamePlayPresenter;
    public me.nikol.snake.game.model.GameConfig gameConfig;
    private int playerId = 0;
    public me.nikol.snake.game.service.MessageFormer messageFormer;
    
    public NothingBehavior() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.nikol.snake.game.infrastructure.GamePlayPresenter getGamePlayPresenter() {
        return null;
    }
    
    @java.lang.Override
    public void setGamePlayPresenter(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.infrastructure.GamePlayPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.nikol.snake.game.model.GameConfig getGameConfig() {
        return null;
    }
    
    public void setGameConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig p0) {
    }
    
    @java.lang.Override
    public int getPlayerId() {
        return 0;
    }
    
    public void setPlayerId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.nikol.snake.game.service.MessageFormer getMessageFormer() {
        return null;
    }
    
    public void setMessageFormer(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.MessageFormer p0) {
    }
    
    @java.lang.Override
    public void changeDirection(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Direction direction) {
    }
    
    @java.lang.Override
    public void changeGameState(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.StateMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @java.lang.Override
    public void addNewPlayer(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.JoinMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @java.lang.Override
    public void onPing(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.PingMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @java.lang.Override
    public void startGame() {
    }
    
    @java.lang.Override
    public void endGame() {
    }
    
    @java.lang.Override
    public void changeDirectionByIpAndPort(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.SteerMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    @java.lang.Override
    public void updateLastTimeMessage(@org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @java.lang.Override
    public void onRoleChange(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.RoleChangeMsg> gameMessage, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
}