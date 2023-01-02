package me.nikol.snake.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0000J\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u001dJ\b\u0010\u001f\u001a\u00020\u0000H\u0002J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J=\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0000H\u0002J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u00101\u001a\u00020\u0003J \u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\u000e\u00106\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00107\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u00109\u001a\u00020\u0006H\u0002J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010;\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003J\t\u0010>\u001a\u00020?H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006@"}, d2 = {"Lme/nikol/snake/game/model/GameState;", "", "stateOrder", "", "snakes", "", "Lme/nikol/snake/game/model/Snake;", "foods", "Lme/nikol/snake/game/model/Coord;", "players", "Lme/nikol/snake/game/model/GamePlayers;", "(ILjava/util/List;Ljava/util/List;Lme/nikol/snake/game/model/GamePlayers;)V", "getFoods", "()Ljava/util/List;", "getPlayers", "()Lme/nikol/snake/game/model/GamePlayers;", "getSnakes", "getStateOrder", "()I", "addNewPlayer", "player", "Lme/nikol/snake/game/model/GamePlayer;", "addNewSnake", "newPlayer", "gameConfig", "Lme/nikol/snake/game/model/GameConfig;", "apply", "changeDirections", "newDirections", "", "Lme/nikol/snake/game/model/Direction;", "changeToViewers", "component1", "component2", "component3", "component4", "copy", "countPoints", "countPointsForCrashed", "countPointsForFood", "deleteEatenFood", "deletedCrashedSnakes", "equals", "", "other", "findPlaceForFood", "Ljava/util/Optional;", "findSnakeByGamePlayer", "generateFood", "generateNewId", "hasSomethingAround", "x", "y", "hashCode", "isValidNewPlayer", "isValidNewSnake", "listSnakeWithout", "missing", "makeMove", "moveSnakes", "removePlayer", "playerId", "toString", "", "core"})
public final class GameState {
    private final int stateOrder = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<me.nikol.snake.game.model.Snake> snakes = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<me.nikol.snake.game.model.Coord> foods = null;
    @org.jetbrains.annotations.NotNull
    private final me.nikol.snake.game.model.GamePlayers players = null;
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "state_order")
    int stateOrder, @org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Snake> snakes, @org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Coord> foods, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayers players) {
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
    
    public GameState(@com.fasterxml.jackson.annotation.JsonProperty(value = "state_order")
    int stateOrder, @org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Snake> snakes, @org.jetbrains.annotations.NotNull
    java.util.List<me.nikol.snake.game.model.Coord> foods, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayers players) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getStateOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Snake> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Snake> getSnakes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Coord> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<me.nikol.snake.game.model.Coord> getFoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GamePlayers component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GamePlayers getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState apply() {
        return null;
    }
    
    /**
     * @param newDirections ( key = playerId, value = newDirection )
     */
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState changeDirections(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Integer, ? extends me.nikol.snake.game.model.Direction> newDirections) {
        return null;
    }
    
    public final int generateNewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState makeMove(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState addNewPlayer(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayer player) {
        return null;
    }
    
    public final boolean isValidNewPlayer(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayer player) {
        return false;
    }
    
    private final me.nikol.snake.game.model.GameState deletedCrashedSnakes(me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final me.nikol.snake.game.model.GameState changeToViewers() {
        return null;
    }
    
    private final me.nikol.snake.game.model.GameState generateFood(me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.Optional<me.nikol.snake.game.model.Coord> findPlaceForFood(me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final me.nikol.snake.game.model.GameState moveSnakes(me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final me.nikol.snake.game.model.GameState countPoints(me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final me.nikol.snake.game.model.GamePlayer countPointsForFood(me.nikol.snake.game.model.GamePlayer player) {
        return null;
    }
    
    private final me.nikol.snake.game.model.GamePlayer countPointsForCrashed(me.nikol.snake.game.model.GamePlayer player, me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.List<me.nikol.snake.game.model.Snake> listSnakeWithout(me.nikol.snake.game.model.Snake missing) {
        return null;
    }
    
    private final me.nikol.snake.game.model.Snake findSnakeByGamePlayer(me.nikol.snake.game.model.GamePlayer player) {
        return null;
    }
    
    private final me.nikol.snake.game.model.GameState deleteEatenFood() {
        return null;
    }
    
    public final boolean isValidNewSnake(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState addNewSnake(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GamePlayer newPlayer, @org.jetbrains.annotations.NotNull
    me.nikol.snake.game.model.GameConfig gameConfig) {
        return null;
    }
    
    private final boolean hasSomethingAround(int x, int y, me.nikol.snake.game.model.GameConfig gameConfig) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.nikol.snake.game.model.GameState removePlayer(int playerId) {
        return null;
    }
}