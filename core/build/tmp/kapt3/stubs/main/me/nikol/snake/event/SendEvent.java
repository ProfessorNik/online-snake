package me.nikol.snake.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lme/nikol/snake/event/SendEvent;", "T", "", "hostAddress", "", "getHostAddress", "()Ljava/lang/String;", "msg", "Lme/nikol/snake/game/model/GameMessage;", "getMsg", "()Lme/nikol/snake/game/model/GameMessage;", "port", "", "getPort", "()I", "core"})
public abstract interface SendEvent<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.GameMessage<T> getMsg();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getHostAddress();
    
    public abstract int getPort();
}