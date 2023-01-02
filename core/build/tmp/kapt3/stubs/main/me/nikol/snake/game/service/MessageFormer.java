package me.nikol.snake.game.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001fJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010%J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010(\u001a\u00020)\u00a2\u0006\u0002\u0010*J#\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020.\u00a2\u0006\u0002\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u00020\t8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u00060"}, d2 = {"Lme/nikol/snake/game/service/MessageFormer;", "", "senderId", "", "(I)V", "getSenderId", "()I", "setSenderId", "seq", "", "getSeq", "()J", "setSeq", "(J)V", "ackMsg", "Lme/nikol/snake/game/model/GameMessage;", "Lme/nikol/snake/game/model/AckMsg;", "receiverId", "(JLjava/lang/Integer;)Lme/nikol/snake/game/model/GameMessage;", "announcementMsg", "Lme/nikol/snake/game/model/AnnouncementMsg;", "announcement", "Lme/nikol/snake/game/model/GameAnnouncement;", "(Ljava/lang/Integer;Lme/nikol/snake/game/model/GameAnnouncement;)Lme/nikol/snake/game/model/GameMessage;", "errorMsg", "Lme/nikol/snake/game/model/ErrorMsg;", "error", "", "(JLjava/lang/Integer;Ljava/lang/String;)Lme/nikol/snake/game/model/GameMessage;", "pingMsg", "Lme/nikol/snake/game/model/PingMsg;", "(Ljava/lang/Integer;)Lme/nikol/snake/game/model/GameMessage;", "roleChangeMsg", "Lme/nikol/snake/game/model/RoleChangeMsg;", "senderRole", "Lme/nikol/snake/game/model/NodeRole;", "receiverRole", "(Ljava/lang/Integer;Lme/nikol/snake/game/model/NodeRole;Lme/nikol/snake/game/model/NodeRole;)Lme/nikol/snake/game/model/GameMessage;", "stateMsg", "Lme/nikol/snake/game/model/StateMsg;", "gameState", "Lme/nikol/snake/game/model/GameState;", "(Ljava/lang/Integer;Lme/nikol/snake/game/model/GameState;)Lme/nikol/snake/game/model/GameMessage;", "steerMsg", "Lme/nikol/snake/game/model/SteerMsg;", "direction", "Lme/nikol/snake/game/model/Direction;", "(Ljava/lang/Integer;Lme/nikol/snake/game/model/Direction;)Lme/nikol/snake/game/model/GameMessage;", "core"})
public final class MessageFormer {
    private int senderId;
    private long seq = 11L;
    
    public MessageFormer(int senderId) {
        super();
    }
    
    public final int getSenderId() {
        return 0;
    }
    
    public final void setSenderId(int p0) {
    }
    
    public final void setSeq(long p0) {
    }
    
    public final long getSeq() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.AnnouncementMsg> announcementMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameAnnouncement announcement) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.AckMsg> ackMsg(long seq, @org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.SteerMsg> steerMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Direction direction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.ErrorMsg> errorMsg(long seq, @org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.RoleChangeMsg> roleChangeMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.Nullable
    me.nikol.snake.game.model.NodeRole senderRole, @org.jetbrains.annotations.Nullable
    me.nikol.snake.game.model.NodeRole receiverRole) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.StateMsg> stateMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameState gameState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<me.nikol.snake.game.model.PingMsg> pingMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId) {
        return null;
    }
}