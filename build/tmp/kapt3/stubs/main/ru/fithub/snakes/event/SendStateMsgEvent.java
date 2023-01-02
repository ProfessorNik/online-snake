package ru.fithub.snakes.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lru/fithub/snakes/event/SendStateMsgEvent;", "Lru/fithub/snakes/event/SendEvent;", "Lru/fithub/snakes/core/model/StateMsg;", "msg", "Lru/fithub/snakes/core/model/GameMessage;", "hostAddress", "", "port", "", "(Lru/fithub/snakes/core/model/GameMessage;Ljava/lang/String;I)V", "getHostAddress", "()Ljava/lang/String;", "getMsg", "()Lru/fithub/snakes/core/model/GameMessage;", "getPort", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "snakes"})
public final class SendStateMsgEvent implements ru.fithub.snakes.event.SendEvent<ru.fithub.snakes.core.model.StateMsg> {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String hostAddress = null;
    private final int port = 0;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.event.SendStateMsgEvent copy(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
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
    
    public SendStateMsgEvent(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> msg, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public ru.fithub.snakes.core.model.GameMessage<ru.fithub.snakes.core.model.StateMsg> getMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getHostAddress() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @java.lang.Override
    public int getPort() {
        return 0;
    }
}