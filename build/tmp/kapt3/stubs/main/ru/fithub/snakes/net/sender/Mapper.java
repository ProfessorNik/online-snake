package ru.fithub.snakes.net.sender;

import java.lang.System;

@org.mapstruct.Mapper(nullValueCheckStrategy = org.mapstruct.NullValueCheckStrategy.ALWAYS)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\bJ\u0010\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001a\u0010\u0003\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001aJ\u0010\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u000e\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\u0003\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0010\u0010\u0003\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020%H&J\u0010\u0010\u0003\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\'H&J\u0010\u0010\u0003\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020)H&J\u000e\u0010\u0003\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020+J\u0010\u0010\u0003\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020-H&J\u0010\u0010\u0003\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020/H&J\u0010\u0010\u0003\u001a\u0002002\u0006\u0010\u0005\u001a\u000201H&J\u0010\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\'J\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0005\u001a\u00020\u0018J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0007J\u0010\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010\u0003\u001a\u00020\'2\u0006\u0010\u0005\u001a\u00020&H&J\u0010\u0010\u0003\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020(H&J\u0010\u0010\u0003\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020.H&J\u0010\u0010\u0003\u001a\u0002012\u0006\u0010\u0005\u001a\u000200H&J\u0010\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&J\u000e\u0010\u0003\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010\u0003\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\'J\u0010\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020*H\'J\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\n032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t03J\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\t032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n03\u00a8\u00065"}, d2 = {"Lru/fithub/snakes/net/sender/Mapper;", "", "()V", "map", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$AckMsg;", "msg", "Lru/fithub/snakes/core/model/AckMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$AnnouncementMsg;", "Lru/fithub/snakes/core/model/AnnouncementMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameState$Coord;", "Lru/fithub/snakes/core/model/Coord;", "Lru/fithub/snakes/dto/SnakesProto$Direction;", "direction", "Lru/fithub/snakes/core/model/Direction;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$DiscoverMsg;", "Lru/fithub/snakes/core/model/DiscoverMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$ErrorMsg;", "Lru/fithub/snakes/core/model/ErrorMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameAnnouncement;", "announcement", "Lru/fithub/snakes/core/model/GameAnnouncement;", "Lru/fithub/snakes/dto/SnakesProto$GameConfig;", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage;", "T", "Lru/fithub/snakes/core/model/GameMessage;", "Lru/fithub/snakes/dto/SnakesProto$GamePlayer;", "player", "Lru/fithub/snakes/core/model/GamePlayer;", "Lru/fithub/snakes/dto/SnakesProto$GamePlayers;", "players", "Lru/fithub/snakes/core/model/GamePlayers;", "Lru/fithub/snakes/dto/SnakesProto$GameState;", "state", "Lru/fithub/snakes/core/model/GameState;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$JoinMsg;", "Lru/fithub/snakes/core/model/JoinMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$PingMsg;", "Lru/fithub/snakes/core/model/PingMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$RoleChangeMsg;", "Lru/fithub/snakes/core/model/RoleChangeMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameState$Snake;", "Lru/fithub/snakes/core/model/Snake;", "Lru/fithub/snakes/dto/SnakesProto$GameState$Snake$SnakeState;", "Lru/fithub/snakes/core/model/SnakeState;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$StateMsg;", "Lru/fithub/snakes/core/model/StateMsg;", "Lru/fithub/snakes/dto/SnakesProto$GameMessage$SteerMsg;", "Lru/fithub/snakes/core/model/SteerMsg;", "mapFrom", "", "mapTo", "snakes"})
public abstract class Mapper {
    
    public Mapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>ru.fithub.snakes.dto.SnakesProto.GameMessage map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameMessage<T> msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.RoleChangeMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.RoleChangeMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.ErrorMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.ErrorMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.DiscoverMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.DiscoverMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.StateMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.StateMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.dto.SnakesProto.GameState map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameState state) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.AckMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.AckMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.SteerMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.SteerMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.PingMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.PingMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameMessage.JoinMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.JoinMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.dto.SnakesProto.GameMessage.AnnouncementMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.AnnouncementMsg msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.dto.SnakesProto.GamePlayers map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayers players) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GamePlayer map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayer player);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameConfig map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameAnnouncement map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameAnnouncement announcement);
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.AnnouncementMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.AnnouncementMsg msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.AckMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.AckMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.GamePlayer map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GamePlayer player);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "foodStatic", source = "foodStatic")
    @org.mapstruct.Mapping(target = "stateDelayMs", source = "stateDelayMs")
    @org.mapstruct.Mapping(target = "height", source = "height")
    @org.mapstruct.Mapping(target = "width", source = "width")
    public abstract ru.fithub.snakes.core.model.GameConfig map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameConfig gameConfig);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.GameAnnouncement map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameAnnouncement announcement);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.DiscoverMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.DiscoverMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.ErrorMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.ErrorMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.StateMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.StateMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.JoinMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.JoinMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.RoleChangeMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.RoleChangeMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.PingMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.PingMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.SteerMsg map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage.SteerMsg msg);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "direction", source = "headDirection")
    @org.mapstruct.Mapping(target = "points", source = "pointsList")
    public abstract ru.fithub.snakes.core.model.Snake map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameState.Snake msg);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "foods", source = "foodsList")
    @org.mapstruct.Mapping(target = "snakes", source = "snakesList")
    public abstract ru.fithub.snakes.core.model.GameState map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameState state);
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.Coord> mapFrom(@org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.dto.SnakesProto.GameState.Coord> msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.dto.SnakesProto.GameState.Coord> mapTo(@org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.core.model.Coord> msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.core.model.Coord map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameState.Coord msg);
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.dto.SnakesProto.GameState.Snake map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.Snake msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameState.Coord map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.Coord msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.GameState.Snake.SnakeState map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.SnakeState msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract ru.fithub.snakes.dto.SnakesProto.Direction map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.Direction direction);
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GamePlayers map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GamePlayers players) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameMessage<?> map(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.dto.SnakesProto.GameMessage msg) {
        return null;
    }
}