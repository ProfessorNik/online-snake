package ru.fithub.snakes.core.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010#J/\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010)J#\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010,\u001a\u00020-\u00a2\u0006\u0002\u0010.J#\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u00101\u001a\u000202\u00a2\u0006\u0002\u00103R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u00064"}, d2 = {"Lru/fithub/snakes/core/service/MessageFormer;", "", "generalRepository", "Lru/fithub/snakes/core/repostiory/GeneralRepository;", "(Lru/fithub/snakes/core/repostiory/GeneralRepository;)V", "getGeneralRepository", "()Lru/fithub/snakes/core/repostiory/GeneralRepository;", "senderId", "", "getSenderId", "()Ljava/lang/Integer;", "value", "", "seq", "getSeq", "()J", "setSeq", "(J)V", "ackMsg", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/AckMsg;", "receiverId", "(Ljava/lang/Integer;J)Lru/fithub/snakes/core/model/GameMessage;", "announcementMsg", "Lru/fithub/snakes/core/model/AnnouncementMsg;", "announcement", "Lru/fithub/snakes/core/model/GameAnnouncement;", "(Ljava/lang/Integer;Lru/fithub/snakes/core/model/GameAnnouncement;)Lru/fithub/snakes/core/model/GameMessage;", "errorMsg", "Lru/fithub/snakes/core/model/ErrorMsg;", "error", "", "(Ljava/lang/Integer;JLjava/lang/String;)Lru/fithub/snakes/core/model/GameMessage;", "pingMsg", "Lru/fithub/snakes/core/model/PingMsg;", "(Ljava/lang/Integer;)Lru/fithub/snakes/core/model/GameMessage;", "roleChangeMsg", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "senderRole", "Lru/fithub/snakes/core/model/NodeRole;", "receiverRole", "(Ljava/lang/Integer;Lru/fithub/snakes/core/model/NodeRole;Lru/fithub/snakes/core/model/NodeRole;)Lru/fithub/snakes/core/model/GameMessage;", "stateMsg", "Lru/fithub/snakes/core/model/StateMsg;", "gameState", "Lru/fithub/snakes/core/model/GameState;", "(Ljava/lang/Integer;Lru/fithub/snakes/core/model/GameState;)Lru/fithub/snakes/core/model/GameMessage;", "steerMsg", "Lru/fithub/snakes/core/model/SteerMsg;", "direction", "Lru/fithub/snakes/core/model/Direction;", "(Ljava/lang/Integer;Lru/fithub/snakes/core/model/Direction;)Lru/fithub/snakes/core/model/GameMessage;", "snakes"})
public final class MessageFormer {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository = null;
    
    public MessageFormer(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.repostiory.GeneralRepository generalRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.repostiory.GeneralRepository getGeneralRepository() {
        return null;
    }
    
    public final long getSeq() {
        return 0L;
    }
    
    public final void setSeq(long value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSenderId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AnnouncementMsg> announcementMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameAnnouncement announcement) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg> ackMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, long seq) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.SteerMsg> steerMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.Direction direction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.ErrorMsg> errorMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, long seq, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.RoleChangeMsg> roleChangeMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.NodeRole senderRole, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.NodeRole receiverRole) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> stateMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameState gameState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.PingMsg> pingMsg(@org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId) {
        return null;
    }
}