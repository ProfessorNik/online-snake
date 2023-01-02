package ru.fithub.snakes.core.infrastructure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lru/fithub/snakes/core/infrastructure/GameMessageController;", "Lru/fithub/snakes/net/receiver/MulticastController;", "messageService", "Lru/fithub/snakes/core/service/gamemessage/GameMessageService;", "(Lru/fithub/snakes/core/service/gamemessage/GameMessageService;)V", "mapper", "Lru/fithub/snakes/net/sender/Mapper;", "multicastGameMessage", "", "gameMessage", "Lru/fithub/snakes/dto/SnakesProto$GameMessage;", "hostAddress", "", "port", "", "snakes"})
public final class GameMessageController implements ru.fithub.snakes.net.receiver.MulticastController {
    private final ru.fithub.snakes.core.service.gamemessage.GameMessageService messageService = null;
    private final ru.fithub.snakes.net.sender.Mapper mapper = null;
    
    public GameMessageController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.gamemessage.GameMessageService messageService) {
        super();
    }
    
    @java.lang.Override
    public void multicastGameMessage(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage gameMessage, @org.jetbrains.annotations.NotNull
    java.lang.String hostAddress, int port) {
    }
}