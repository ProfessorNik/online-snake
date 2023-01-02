package me.nikol.snake.game.service.behavior.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J&\u0010?\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016J\u0018\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u000208H\u0002J\u0010\u0010E\u001a\u00020@2\u0006\u0010G\u001a\u000208H\u0016J&\u0010H\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020I0+2\u0006\u0010J\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016J&\u0010K\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\r0+2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016J\b\u0010L\u001a\u00020@H\u0016J\b\u0010M\u001a\u00020@H\u0002J\u001f\u0010N\u001a\u0004\u0018\u00010\u00132\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0002\u00a2\u0006\u0002\u0010OJ\b\u0010P\u001a\u00020@H\u0002J$\u0010Q\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0+2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013J&\u0010R\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0+2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016J&\u0010S\u001a\u00020@2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0+2\u0006\u0010J\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016J\b\u0010U\u001a\u00020@H\u0002J\b\u0010V\u001a\u00020@H\u0002J\u0018\u0010W\u001a\u00020@2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0002J\u0010\u0010X\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010Y\u001a\u00020@H\u0016J\b\u0010Z\u001a\u00020@H\u0002J\u0018\u0010[\u001a\u00020@2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000202X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002080.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lme/nikol/snake/game/service/behavior/impl/MasterBehavior;", "Lme/nikol/snake/game/service/behavior/Behavior;", "announcementPublisher", "Lme/nikol/snake/event/basic/EventPublisher;", "Lme/nikol/snake/event/SendAnnouncementMsgEvent;", "errorMsgPublisher", "Lme/nikol/snake/event/SendEvent;", "Lme/nikol/snake/game/model/ErrorMsg;", "ackMsgEventPublisher", "Lme/nikol/snake/game/model/AckMsg;", "roleChangeMsgEventPublisher", "Lme/nikol/snake/game/model/RoleChangeMsg;", "stateMsgEventPublisher", "Lme/nikol/snake/game/model/StateMsg;", "pingMsgEventPublisher", "Lme/nikol/snake/game/model/PingMsg;", "main", "Lme/nikol/snake/game/Main;", "playerId", "", "(Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/game/Main;I)V", "gameAnnouncementScheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "gameConfig", "Lme/nikol/snake/game/model/GameConfig;", "getGameConfig", "()Lme/nikol/snake/game/model/GameConfig;", "setGameConfig", "(Lme/nikol/snake/game/model/GameConfig;)V", "gameFactory", "Lme/nikol/snake/game/config/GameFactory;", "gamePlayPresenter", "Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "getGamePlayPresenter", "()Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "setGamePlayPresenter", "(Lme/nikol/snake/game/infrastructure/GamePlayPresenter;)V", "gameState", "Lme/nikol/snake/game/model/GameState;", "gameStepScheduler", "joinPlayerDelayedMessages", "", "Lme/nikol/snake/game/model/DelayedMessage;", "Lme/nikol/snake/game/model/GameMessage;", "Lme/nikol/snake/game/model/JoinMsg;", "lastNMessage", "", "", "lastTimeMessage", "messageFormer", "Lme/nikol/snake/game/service/MessageFormer;", "getMessageFormer", "()Lme/nikol/snake/game/service/MessageFormer;", "setMessageFormer", "(Lme/nikol/snake/game/service/MessageFormer;)V", "newDirections", "Lme/nikol/snake/game/model/Direction;", "onRemovePlayers", "pingPlayersScheduler", "getPlayerId", "()I", "setPlayerId", "(I)V", "addNewPlayer", "", "msg", "ipAddress", "", "port", "changeDirection", "player_id", "direction", "changeDirectionByIpAndPort", "Lme/nikol/snake/game/model/SteerMsg;", "hostAddress", "changeGameState", "endGame", "exit", "findPlayerIdByIpAndPort", "(Ljava/lang/String;I)Ljava/lang/Integer;", "notifyAllAboutGame", "onAck", "onPing", "onRoleChange", "gameMessage", "pingPlayers", "removeDisconnectedPlayers", "removeFromBlackList", "removePlayer", "startGame", "updateGameState", "updateLastTimeMessage", "core"})
public final class MasterBehavior implements me.nikol.snake.game.service.behavior.Behavior {
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendAnnouncementMsgEvent> announcementPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.ErrorMsg>> errorMsgPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.AckMsg>> ackMsgEventPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.RoleChangeMsg>> roleChangeMsgEventPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.StateMsg>> stateMsgEventPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.PingMsg>> pingMsgEventPublisher = null;
    private final me.nikol.snake.game.Main main = null;
    private int playerId;
    private final java.util.Map<java.lang.Integer, me.nikol.snake.game.model.Direction> newDirections = null;
    private final java.util.Map<java.lang.Integer, java.lang.Long> lastNMessage = null;
    private final java.util.Map<java.lang.Integer, java.lang.Long> lastTimeMessage = null;
    private final java.util.Map<java.lang.Integer, java.lang.Long> onRemovePlayers = null;
    private final me.nikol.snake.game.config.GameFactory gameFactory = null;
    private final java.util.concurrent.ScheduledExecutorService gameStepScheduler = null;
    private final java.util.concurrent.ScheduledExecutorService gameAnnouncementScheduler = null;
    private final java.util.concurrent.ScheduledExecutorService pingPlayersScheduler = null;
    @org.jetbrains.annotations.NotNull
    private me.nikol.snake.game.service.MessageFormer messageFormer;
    @org.jetbrains.annotations.NotNull
    private me.nikol.snake.game.model.GameConfig gameConfig;
    private me.nikol.snake.game.model.GameState gameState;
    private final java.util.List<me.nikol.snake.game.model.DelayedMessage<me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.JoinMsg>>> joinPlayerDelayedMessages = null;
    public me.nikol.snake.game.infrastructure.GamePlayPresenter gamePlayPresenter;
    
    public MasterBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendAnnouncementMsgEvent> announcementPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.ErrorMsg>> errorMsgPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.AckMsg>> ackMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.RoleChangeMsg>> roleChangeMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.StateMsg>> stateMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.PingMsg>> pingMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.Main main, int playerId) {
        super();
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public me.nikol.snake.game.model.GameConfig getGameConfig() {
        return null;
    }
    
    public void setGameConfig(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig p0) {
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
    
    @java.lang.Override
    public void startGame() {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void pingPlayers() {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void updateLastTimeMessage(@org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void onRoleChange(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.RoleChangeMsg> gameMessage, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void onAck(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.AckMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    private final void removeFromBlackList(java.lang.String ipAddress, int port) {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void notifyAllAboutGame() {
    }
    
    private final java.lang.Integer findPlayerIdByIpAndPort(java.lang.String ipAddress, int port) {
        return null;
    }
    
    @java.lang.Override
    public void changeGameState(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.StateMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void addNewPlayer(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.JoinMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void onPing(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.PingMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void changeDirection(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Direction direction) {
    }
    
    private final void changeDirection(int player_id, me.nikol.snake.game.model.Direction direction) {
    }
    
    private final me.nikol.snake.game.model.GameState removePlayer(int playerId) {
        return null;
    }
    
    private final void removeDisconnectedPlayers() {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void updateGameState() {
    }
    
    private final void exit() {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void endGame() {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void changeDirectionByIpAndPort(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.SteerMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
}