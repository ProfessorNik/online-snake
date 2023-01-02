package ru.fithub.snakes.event.basic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0013\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lru/fithub/snakes/event/basic/EventPublisher;", "T", "", "()V", "listeners", "", "Lru/fithub/snakes/event/basic/EventListener;", "notAsyncListeners", "getNotAsyncListeners", "()Ljava/util/List;", "addListener", "", "listener", "isAsync", "", "deleteListener", "publishAsyncEvent", "event", "(Ljava/lang/Object;)V", "snakes"})
public final class EventPublisher<T extends java.lang.Object> {
    private final java.util.List<ru.fithub.snakes.event.basic.EventListener<T>> listeners = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<ru.fithub.snakes.event.basic.EventListener<T>> notAsyncListeners = null;
    
    public EventPublisher() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.event.basic.EventListener<T>> getNotAsyncListeners() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void addListener(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventListener<T> listener, boolean isAsync) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void deleteListener(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.event.basic.EventListener<T> listener) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void publishAsyncEvent(T event) {
    }
}