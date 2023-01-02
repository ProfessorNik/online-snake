package ru.fithub.snakes.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0012\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\t\u0010<\u001a\u00020\u000fH\u00c6\u0003J\u001b\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u00c6\u0003J\u001b\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0012H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010A\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010C\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010D\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\t\u0010F\u001a\u00020\u000fH\u00c6\u0003J\u00ba\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u000f2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\t\u0010L\u001a\u00020\u0005H\u00d6\u0001R#\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-\u00a8\u0006M"}, d2 = {"Lru/fithub/snakes/core/model/Connection;", "", "playerId", "", "ipAddress", "", "port", "newDirection", "Lru/fithub/snakes/core/model/Direction;", "lastSeqMessage", "", "lastMessageTime", "pingTime", "lastStateOrder", "leftGame", "", "becomeViewer", "answeredAckMessages", "", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/AckMsg;", "answeredErrorMessages", "Lru/fithub/snakes/core/model/ErrorMsg;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/fithub/snakes/core/model/Direction;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;ZZLjava/util/Map;Ljava/util/Map;)V", "getAnsweredAckMessages", "()Ljava/util/Map;", "getAnsweredErrorMessages", "getBecomeViewer", "()Z", "setBecomeViewer", "(Z)V", "getIpAddress", "()Ljava/lang/String;", "setIpAddress", "(Ljava/lang/String;)V", "getLastMessageTime", "()Ljava/lang/Long;", "setLastMessageTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLastSeqMessage", "setLastSeqMessage", "getLastStateOrder", "()Ljava/lang/Integer;", "setLastStateOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLeftGame", "setLeftGame", "getNewDirection", "()Lru/fithub/snakes/core/model/Direction;", "setNewDirection", "(Lru/fithub/snakes/core/model/Direction;)V", "getPingTime", "setPingTime", "getPlayerId", "setPlayerId", "getPort", "setPort", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lru/fithub/snakes/core/model/Direction;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;ZZLjava/util/Map;Ljava/util/Map;)Lru/fithub/snakes/core/model/Connection;", "equals", "other", "hashCode", "toString", "snakes"})
public final class Connection {
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer playerId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ipAddress;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer port;
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.core.model.Direction newDirection;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long lastSeqMessage;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long lastMessageTime;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long pingTime;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer lastStateOrder;
    private boolean leftGame;
    private boolean becomeViewer;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg>> answeredAckMessages = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.ErrorMsg>> answeredErrorMessages = null;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.Connection copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer playerId, @org.jetbrains.annotations.Nullable
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable
    java.lang.Integer port, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.Direction newDirection, @org.jetbrains.annotations.Nullable
    java.lang.Long lastSeqMessage, @org.jetbrains.annotations.Nullable
    java.lang.Long lastMessageTime, @org.jetbrains.annotations.Nullable
    java.lang.Long pingTime, @org.jetbrains.annotations.Nullable
    java.lang.Integer lastStateOrder, boolean leftGame, boolean becomeViewer, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg>> answeredAckMessages, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.ErrorMsg>> answeredErrorMessages) {
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
    
    public Connection() {
        super();
    }
    
    public Connection(@org.jetbrains.annotations.Nullable
    java.lang.Integer playerId, @org.jetbrains.annotations.Nullable
    java.lang.String ipAddress, @org.jetbrains.annotations.Nullable
    java.lang.Integer port, @org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.Direction newDirection, @org.jetbrains.annotations.Nullable
    java.lang.Long lastSeqMessage, @org.jetbrains.annotations.Nullable
    java.lang.Long lastMessageTime, @org.jetbrains.annotations.Nullable
    java.lang.Long pingTime, @org.jetbrains.annotations.Nullable
    java.lang.Integer lastStateOrder, boolean leftGame, boolean becomeViewer, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg>> answeredAckMessages, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.ErrorMsg>> answeredErrorMessages) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPlayerId() {
        return null;
    }
    
    public final void setPlayerId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIpAddress() {
        return null;
    }
    
    public final void setIpAddress(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPort() {
        return null;
    }
    
    public final void setPort(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.Direction component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.Direction getNewDirection() {
        return null;
    }
    
    public final void setNewDirection(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.Direction p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastSeqMessage() {
        return null;
    }
    
    public final void setLastSeqMessage(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getLastMessageTime() {
        return null;
    }
    
    public final void setLastMessageTime(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getPingTime() {
        return null;
    }
    
    public final void setPingTime(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getLastStateOrder() {
        return null;
    }
    
    public final void setLastStateOrder(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getLeftGame() {
        return false;
    }
    
    public final void setLeftGame(boolean p0) {
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getBecomeViewer() {
        return false;
    }
    
    public final void setBecomeViewer(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg>> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.AckMsg>> getAnsweredAckMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.ErrorMsg>> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Long, ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.ErrorMsg>> getAnsweredErrorMessages() {
        return null;
    }
}