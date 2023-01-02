package me.nikol.snake.game.infrastructure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lme/nikol/snake/game/infrastructure/GameMessageController;", "Lme/nikol/snake/net/receiver/MulticastController;", "messageService", "Lme/nikol/snake/game/service/gamemessage/GameMessageService;", "(Lme/nikol/snake/game/service/gamemessage/GameMessageService;)V", "mapper", "Lme/nikol/snake/net/sender/Mapper;", "multicastGameMessage", "", "gameMessage", "Lme/nikol/snake/dto/SnakesProto$GameMessage;", "hostAddress", "", "port", "", "core"})
public final class GameMessageController implements me.nikol.snake.net.receiver.MulticastController {
    private final me.nikol.snake.game.service.gamemessage.GameMessageService messageService = null;
    private final me.nikol.snake.net.sender.Mapper mapper = null;
    
    public GameMessageController(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.service.gamemessage.GameMessageService messageService) {
        super();
    }
    
    @java.lang.Override
    public void multicastGameMessage(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage gameMessage, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
}