package ru.fithub.snakes.core.repostiory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lru/fithub/snakes/core/repostiory/ServerRepository;", "", "()V", "canJoin", "", "getCanJoin", "()Z", "setCanJoin", "(Z)V", "connections", "", "Lru/fithub/snakes/core/model/Connection;", "getConnections", "()Ljava/util/List;", "joinPlayerDelayedMessages", "Lru/fithub/snakes/core/model/DelayedMessage;", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/core/model/JoinMsg;", "getJoinPlayerDelayedMessages", "getConnectionByIpAndPort", "ipAddress", "", "port", "", "snakes"})
public final class ServerRepository {
    private boolean canJoin = true;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<ru.fithub.snakes.core.model.Connection> connections = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.JoinMsg>>> joinPlayerDelayedMessages = null;
    
    public ServerRepository() {
        super();
    }
    
    public final boolean getCanJoin() {
        return false;
    }
    
    public final void setCanJoin(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.Connection> getConnections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.JoinMsg>>> getJoinPlayerDelayedMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.Connection getConnectionByIpAndPort(@org.jetbrains.annotations.NotNull
    java.lang.String ipAddress, int port) {
        return null;
    }
}