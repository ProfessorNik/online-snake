package me.nikol.snake.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lme/nikol/snake/game/model/RoleChangeMsg;", "", "senderRole", "Lme/nikol/snake/game/model/NodeRole;", "receiverRole", "(Lme/nikol/snake/game/model/NodeRole;Lme/nikol/snake/game/model/NodeRole;)V", "getReceiverRole", "()Lme/nikol/snake/game/model/NodeRole;", "getSenderRole", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"})
@com.fasterxml.jackson.annotation.JsonRootName(value = "role_change")
public final class RoleChangeMsg {
    @org.jetbrains.annotations.Nullable
    private final me.nikol.snake.game.model.NodeRole senderRole = null;
    @org.jetbrains.annotations.Nullable
    private final me.nikol.snake.game.model.NodeRole receiverRole = null;
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.RoleChangeMsg copy(@org.jetbrains.annotations.Nullable
    me.nikol.snake.game.model.NodeRole senderRole, @org.jetbrains.annotations.Nullable
    me.nikol.snake.game.model.NodeRole receiverRole) {
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
    
    public RoleChangeMsg(@org.jetbrains.annotations.Nullable
    me.nikol.snake.game.model.NodeRole senderRole, @org.jetbrains.annotations.Nullable
    me.nikol.snake.game.model.NodeRole receiverRole) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final me.nikol.snake.game.model.NodeRole component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final me.nikol.snake.game.model.NodeRole getSenderRole() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final me.nikol.snake.game.model.NodeRole component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final me.nikol.snake.game.model.NodeRole getReceiverRole() {
        return null;
    }
}