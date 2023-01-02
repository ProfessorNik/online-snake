package me.nikol.snake.net.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lme/nikol/snake/net/receiver/MulticastController;", "", "multicastGameMessage", "", "gameMessage", "Lme/nikol/snake/dto/SnakesProto$GameMessage;", "hostAddress", "", "port", "", "core"})
public abstract interface MulticastController {
    
    public abstract void multicastGameMessage(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage gameMessage, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port);
}