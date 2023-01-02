package me.nikol.snake.event.basic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0014\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0013\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lme/nikol/snake/event/basic/EventPublisher;", "T", "", "()V", "listeners", "", "Lme/nikol/snake/event/basic/EventListener;", "getListeners", "()Ljava/util/List;", "addListener", "", "listener", "deleteListener", "publishEvent", "event", "(Ljava/lang/Object;)V", "core"})
public final class EventPublisher<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<me.nikol.snake.event.basic.EventListener<T>> listeners = null;
    
    public EventPublisher() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.event.basic.EventListener<T>> getListeners() {
        return null;
    }
    
    public final void addListener(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventListener<T> listener) {
    }
    
    public final void deleteListener(@org.jetbrains.annotations.NotNull
    me.nikol.snake.event.basic.EventListener<T> listener) {
    }
    
    public final void publishEvent(T event) {
    }
}