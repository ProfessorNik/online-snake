package me.nikol.snake.game.service.behavior.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 X2\u00020\u0001:\u0001XBW\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ&\u0010@\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001eH\u0016J\b\u0010G\u001a\u00020AH\u0002J\u0010\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020JH\u0016J&\u0010K\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050C2\u0006\u0010L\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001eH\u0016J&\u0010M\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020N0C2\u0006\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001eH\u0016J\b\u0010O\u001a\u00020AH\u0016J\b\u0010P\u001a\u00020AH\u0002J&\u0010Q\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070C2\u0006\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001eH\u0016J&\u0010R\u001a\u00020A2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0C2\u0006\u0010L\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001eH\u0016J\b\u0010U\u001a\u00020AH\u0002J\b\u0010V\u001a\u00020AH\u0016J\u0018\u0010W\u001a\u00020A2\u0006\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001eH\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010/\u001a\u000200X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u001eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R\u001a\u0010:\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lme/nikol/snake/game/service/behavior/impl/NormalBehavior;", "Lme/nikol/snake/game/service/behavior/Behavior;", "sendSteerMsgEventPublisher", "Lme/nikol/snake/event/basic/EventPublisher;", "Lme/nikol/snake/event/SendEvent;", "Lme/nikol/snake/game/model/SteerMsg;", "sendPingMsgEventPublisher", "Lme/nikol/snake/game/model/PingMsg;", "sendAckMsgEventPublisher", "Lme/nikol/snake/game/model/AckMsg;", "stopSendMessagesToPlayerEventPublisher", "Lme/nikol/snake/event/StopSendMessagesToPlayerEvent;", "main", "Lme/nikol/snake/game/Main;", "(Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/event/basic/EventPublisher;Lme/nikol/snake/game/Main;)V", "gameConfig", "Lme/nikol/snake/game/model/GameConfig;", "getGameConfig", "()Lme/nikol/snake/game/model/GameConfig;", "setGameConfig", "(Lme/nikol/snake/game/model/GameConfig;)V", "gamePlayPresenter", "Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "getGamePlayPresenter", "()Lme/nikol/snake/game/infrastructure/GamePlayPresenter;", "setGamePlayPresenter", "(Lme/nikol/snake/game/infrastructure/GamePlayPresenter;)V", "gameState", "Lme/nikol/snake/game/model/GameState;", "lastNState", "", "getLastNState", "()I", "setLastNState", "(I)V", "lastTimeMasterMessage", "", "masterIp", "", "masterPingTime", "getMasterPingTime", "()J", "setMasterPingTime", "(J)V", "masterPort", "getMasterPort", "setMasterPort", "messageFormer", "Lme/nikol/snake/game/service/MessageFormer;", "getMessageFormer", "()Lme/nikol/snake/game/service/MessageFormer;", "setMessageFormer", "(Lme/nikol/snake/game/service/MessageFormer;)V", "pingPlayersScheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "playerId", "getPlayerId", "setPlayerId", "role", "Lme/nikol/snake/game/model/NodeRole;", "getRole", "()Lme/nikol/snake/game/model/NodeRole;", "setRole", "(Lme/nikol/snake/game/model/NodeRole;)V", "addNewPlayer", "", "msg", "Lme/nikol/snake/game/model/GameMessage;", "Lme/nikol/snake/game/model/JoinMsg;", "ipAddress", "port", "becomeAMaster", "changeDirection", "direction", "Lme/nikol/snake/game/model/Direction;", "changeDirectionByIpAndPort", "hostAddress", "changeGameState", "Lme/nikol/snake/game/model/StateMsg;", "endGame", "findNewMaster", "onPing", "onRoleChange", "gameMessage", "Lme/nikol/snake/game/model/RoleChangeMsg;", "pingMaster", "startGame", "updateLastTimeMessage", "Companion", "core"})
public final class NormalBehavior implements me.nikol.snake.game.service.behavior.Behavior {
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.SteerMsg>> sendSteerMsgEventPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.PingMsg>> sendPingMsgEventPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.AckMsg>> sendAckMsgEventPublisher = null;
    private final me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher = null;
    private final me.nikol.snake.game.Main main = null;
    private final java.util.concurrent.ScheduledExecutorService pingPlayersScheduler = null;
    @org.jetbrains.annotations.NotNull
    public static final me.nikol.snake.game.service.behavior.impl.NormalBehavior.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final me.nikol.snake.game.config.GameProperties properties = null;
    public static final int UNFILLING = -1;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PLAYER_NAME = null;
    private static final long PING_SCHEDULE_MS = 0L;
    private static final long PING_EXPIRATION_TIME = 0L;
    private static final long PING_DISCONNECTED_TIME = 0L;
    @org.jetbrains.annotations.NotNull
    private me.nikol.snake.game.model.NodeRole role = me.nikol.snake.game.model.NodeRole.NORMAL;
    public me.nikol.snake.game.infrastructure.GamePlayPresenter gamePlayPresenter;
    private int playerId = -1;
    private java.lang.String masterIp = "";
    private long lastTimeMasterMessage = -1L;
    private int masterPort = -1;
    private long masterPingTime = -1L;
    private int lastNState = 1;
    private me.nikol.snake.game.model.GameState gameState;
    public me.nikol.snake.game.model.GameConfig gameConfig;
    @org.jetbrains.annotations.NotNull
    private me.nikol.snake.game.service.MessageFormer messageFormer;
    
    public NormalBehavior(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.SteerMsg>> sendSteerMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.PingMsg>> sendPingMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.SendEvent<me.nikol.snake.game.model.AckMsg>> sendAckMsgEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventPublisher<me.nikol.snake.event.StopSendMessagesToPlayerEvent> stopSendMessagesToPlayerEventPublisher, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.Main main) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.NodeRole getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.NodeRole p0) {
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
    public int getPlayerId() {
        return 0;
    }
    
    public void setPlayerId(int p0) {
    }
    
    public final int getMasterPort() {
        return 0;
    }
    
    public final void setMasterPort(int p0) {
    }
    
    public final long getMasterPingTime() {
        return 0L;
    }
    
    public final void setMasterPingTime(long p0) {
    }
    
    public final int getLastNState() {
        return 0;
    }
    
    public final void setLastNState(int p0) {
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
    public me.nikol.snake.game.service.MessageFormer getMessageFormer() {
        return null;
    }
    
    public void setMessageFormer(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.MessageFormer p0) {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void changeDirection(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Direction direction) {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    public synchronized void changeGameState(@org.jetbrains.annotations.NotNull
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
    public synchronized void startGame() {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void pingMaster() {
    }
    
    private final void becomeAMaster() {
    }
    
    private final void findNewMaster() {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lme/nikol/snake/game/service/behavior/impl/NormalBehavior$Companion;", "", "()V", "PING_DISCONNECTED_TIME", "", "getPING_DISCONNECTED_TIME", "()J", "PING_EXPIRATION_TIME", "getPING_EXPIRATION_TIME", "PING_SCHEDULE_MS", "getPING_SCHEDULE_MS", "PLAYER_NAME", "", "getPLAYER_NAME", "()Ljava/lang/String;", "UNFILLING", "", "properties", "Lme/nikol/snake/game/config/GameProperties;", "getProperties", "()Lme/nikol/snake/game/config/GameProperties;", "core"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.nikol.snake.game.config.GameProperties getProperties() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPLAYER_NAME() {
            return null;
        }
        
        public final long getPING_SCHEDULE_MS() {
            return 0L;
        }
        
        public final long getPING_EXPIRATION_TIME() {
            return 0L;
        }
        
        public final long getPING_DISCONNECTED_TIME() {
            return 0L;
        }
    }
}