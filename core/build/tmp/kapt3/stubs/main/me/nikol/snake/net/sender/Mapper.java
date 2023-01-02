package me.nikol.snake.net.sender;

import java.lang.System;

@org.mapstruct.Mapper(nullValueCheckStrategy = org.mapstruct.NullValueCheckStrategy.ALWAYS)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u000eH&J\u000e\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0010J\u0010\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\u000e\u0010\u0003\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0010\u0010\u0003\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\'J\u0010\u0010\u0003\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020)H&J\u0010\u0010\u0003\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020+H\'J\u0010\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\rH&J\u000e\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000fJ\u0010\u0010\u0003\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020(H&J\u0010\u0010\u0003\u001a\u00020,2\u0006\u0010-\u001a\u00020.H&J\u0010\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0003\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\u0003\u001a\u00020\f\"\u0004\b\u0000\u0010/2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H/0\nJ\u0010\u0010\u0003\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH&J\u000e\u0010\u0003\u001a\u00020$2\u0006\u0010#\u001a\u00020\"J\u000e\u0010\u0003\u001a\u00020\'2\u0006\u0010&\u001a\u00020%J\u0010\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0019H&J\u000e\u0010\u0003\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020*J\u0010\u0010\u0003\u001a\u0002002\u0006\u0010\u000b\u001a\u000201H&J\u0010\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001dH&J\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020(032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020)03J\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020)032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020(03\u00a8\u00065"}, d2 = {"Lme/nikol/snake/net/sender/Mapper;", "", "()V", "map", "Lme/nikol/snake/game/model/GameAnnouncement;", "announcement", "Lme/nikol/snake/dto/SnakesProto$GameAnnouncement;", "Lme/nikol/snake/game/model/GameConfig;", "gameConfig", "Lme/nikol/snake/dto/SnakesProto$GameConfig;", "Lme/nikol/snake/game/model/GameMessage;", "msg", "Lme/nikol/snake/dto/SnakesProto$GameMessage;", "Lme/nikol/snake/game/model/AckMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$AckMsg;", "Lme/nikol/snake/game/model/AnnouncementMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$AnnouncementMsg;", "Lme/nikol/snake/game/model/DiscoverMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$DiscoverMsg;", "Lme/nikol/snake/game/model/ErrorMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$ErrorMsg;", "Lme/nikol/snake/game/model/JoinMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$JoinMsg;", "Lme/nikol/snake/game/model/PingMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$PingMsg;", "Lme/nikol/snake/game/model/RoleChangeMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$RoleChangeMsg;", "Lme/nikol/snake/game/model/StateMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$StateMsg;", "Lme/nikol/snake/game/model/SteerMsg;", "Lme/nikol/snake/dto/SnakesProto$GameMessage$SteerMsg;", "Lme/nikol/snake/game/model/GamePlayer;", "player", "Lme/nikol/snake/dto/SnakesProto$GamePlayer;", "Lme/nikol/snake/game/model/GamePlayers;", "players", "Lme/nikol/snake/dto/SnakesProto$GamePlayers;", "Lme/nikol/snake/game/model/GameState;", "state", "Lme/nikol/snake/dto/SnakesProto$GameState;", "Lme/nikol/snake/game/model/Coord;", "Lme/nikol/snake/dto/SnakesProto$GameState$Coord;", "Lme/nikol/snake/game/model/Snake;", "Lme/nikol/snake/dto/SnakesProto$GameState$Snake;", "Lme/nikol/snake/dto/SnakesProto$Direction;", "direction", "Lme/nikol/snake/game/model/Direction;", "T", "Lme/nikol/snake/dto/SnakesProto$GameState$Snake$SnakeState;", "Lme/nikol/snake/game/model/SnakeState;", "mapFrom", "", "mapTo", "core"})
public abstract class Mapper {
    
    public Mapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>me.nikol.snake.dto.SnakesProto.GameMessage map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameMessage<T> msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.RoleChangeMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.RoleChangeMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.ErrorMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.ErrorMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.DiscoverMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.DiscoverMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.StateMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.StateMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.dto.SnakesProto.GameState map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameState state) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.AckMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.AckMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.SteerMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.SteerMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.PingMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.PingMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameMessage.JoinMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.JoinMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.dto.SnakesProto.GameMessage.AnnouncementMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.AnnouncementMsg msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.dto.SnakesProto.GamePlayers map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayers players) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GamePlayer map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayer player);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameConfig map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameAnnouncement map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameAnnouncement announcement);
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.AnnouncementMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.AnnouncementMsg msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.AckMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.AckMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.GamePlayer map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GamePlayer player);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "foodStatic", source = "foodStatic")
    @org.mapstruct.Mapping(target = "stateDelayMs", source = "stateDelayMs")
    @org.mapstruct.Mapping(target = "height", source = "height")
    @org.mapstruct.Mapping(target = "width", source = "width")
    public abstract me.nikol.snake.game.model.GameConfig map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameConfig gameConfig);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.GameAnnouncement map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameAnnouncement announcement);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.DiscoverMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.DiscoverMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.ErrorMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.ErrorMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.StateMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.StateMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.JoinMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.JoinMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.RoleChangeMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.RoleChangeMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.PingMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.PingMsg msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.SteerMsg map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage.SteerMsg msg);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "direction", source = "headDirection")
    @org.mapstruct.Mapping(target = "points", source = "pointsList")
    public abstract me.nikol.snake.game.model.Snake map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameState.Snake msg);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "foods", source = "foodsList")
    @org.mapstruct.Mapping(target = "snakes", source = "snakesList")
    public abstract me.nikol.snake.game.model.GameState map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameState state);
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Coord> mapFrom(@org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.dto.SnakesProto.GameState.Coord> msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.dto.SnakesProto.GameState.Coord> mapTo(@org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Coord> msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.model.Coord map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameState.Coord msg);
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.dto.SnakesProto.GameState.Snake map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Snake msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameState.Coord map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Coord msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.GameState.Snake.SnakeState map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.SnakeState msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.dto.SnakesProto.Direction map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Direction direction);
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GamePlayers map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GamePlayers players) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameMessage<?> map(@org.jetbrains.annotations.NotNull
    me.nikol.snake.dto.SnakesProto.GameMessage msg) {
        return null;
    }
}