package ru.fithub.snakes.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0016\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\b\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lru/fithub/snakes/core/model/GameMessage;", "T", "", "msgSeq", "", "senderId", "", "receiverId", "msg", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;)V", "getMsg", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsgSeq", "()J", "getReceiverId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSenderId", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;)Lru/fithub/snakes/core/model/GameMessage;", "equals", "", "other", "hashCode", "toString", "", "snakes"})
public final class GameMessage<T extends java.lang.Object> {
    private final long msgSeq = 0L;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer senderId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer receiverId = null;
    private final T msg = null;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<T> copy(long msgSeq, @org.jetbrains.annotations.Nullable
    java.lang.Integer senderId, @org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, T msg) {
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
    
    public GameMessage(long msgSeq, @org.jetbrains.annotations.Nullable
    java.lang.Integer senderId, @org.jetbrains.annotations.Nullable
    java.lang.Integer receiverId, T msg) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getMsgSeq() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSenderId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getReceiverId() {
        return null;
    }
    
    public final T component4() {
        return null;
    }
    
    public final T getMsg() {
        return null;
    }
}