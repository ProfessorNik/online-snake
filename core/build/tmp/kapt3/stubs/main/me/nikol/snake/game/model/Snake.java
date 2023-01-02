package me.nikol.snake.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nH\u00c6\u0001J\u001c\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0013\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010&\u001a\u00020\u0006J\u000e\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\nJ\u001c\u0010)\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J\t\u0010/\u001a\u000200H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00061"}, d2 = {"Lme/nikol/snake/game/model/Snake;", "", "playerId", "", "points", "", "Lme/nikol/snake/game/model/Coord;", "state", "Lme/nikol/snake/game/model/SnakeState;", "direction", "Lme/nikol/snake/game/model/Direction;", "(ILjava/util/List;Lme/nikol/snake/game/model/SnakeState;Lme/nikol/snake/game/model/Direction;)V", "getDirection", "()Lme/nikol/snake/game/model/Direction;", "getPlayerId", "()I", "getPoints", "()Ljava/util/List;", "getState", "()Lme/nikol/snake/game/model/SnakeState;", "alignPoints", "gameConfig", "Lme/nikol/snake/game/model/GameConfig;", "alignPointsWithoutHead", "component1", "component2", "component3", "component4", "copy", "crashed", "", "snakes", "enemySnake", "dropRedundantPoints", "foods", "equals", "other", "hashCode", "head", "isLegalDirection", "newDirection", "move", "moveHead", "moveHeadAndPrevPoint", "shiftBeforeHead", "newHead", "prevHead", "toString", "", "core"})
public final class Snake {
    private final int playerId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<me.nikol.snake.game.model.Coord> points = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.model.SnakeState state = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.model.Direction direction = null;
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.Snake copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "player_id")
    int playerId, @org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Coord> points, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.SnakeState state, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "head_direction")
    me.nikol.snake.game.model.Direction direction) {
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
    
    public Snake(@com.fasterxml.jackson.annotation.JsonProperty(value = "player_id")
    int playerId, @org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Coord> points, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.SnakeState state, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "head_direction")
    me.nikol.snake.game.model.Direction direction) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPlayerId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Coord> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Coord> getPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.SnakeState component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.SnakeState getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.Direction component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.Direction getDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.Snake move(@org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Coord> foods, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.List<me.nikol.snake.game.model.Coord> moveHeadAndPrevPoint(java.util.List<me.nikol.snake.game.model.Coord> foods, me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.List<me.nikol.snake.game.model.Coord> dropRedundantPoints(java.util.List<me.nikol.snake.game.model.Coord> foods, me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final me.nikol.snake.game.model.Coord moveHead(me.nikol.snake.game.model.Coord head, me.nikol.snake.game.model.Direction direction) {
        return null;
    }
    
    private final me.nikol.snake.game.model.Coord shiftBeforeHead(me.nikol.snake.game.model.Coord newHead, me.nikol.snake.game.model.Coord prevHead) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.Coord head() {
        return null;
    }
    
    public final boolean isLegalDirection(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Direction newDirection) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Coord> alignPoints(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.List<me.nikol.snake.game.model.Coord> alignPointsWithoutHead(me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    public final boolean crashed(@org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Snake> snakes, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return false;
    }
    
    /**
     * this.snake crashed about playerSnake
     */
    public final boolean crashed(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.Snake enemySnake, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return false;
    }
}