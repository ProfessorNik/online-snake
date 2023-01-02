package ru.fithub.snakes.core.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0000J\u001a\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u001dJ\b\u0010\u001f\u001a\u00020\u0000H\u0002J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\u0006\u0010$\u001a\u00020%J=\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\b\u0010\'\u001a\u00020\u0000H\u0002J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u0000H\u0002J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0013\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0/2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u0004\u0018\u00010\u00152\u0006\u00101\u001a\u00020\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u00152\u0006\u00103\u001a\u000204J\u0012\u00105\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u00101\u001a\u00020\u0003J\u0010\u00107\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u00108\u001a\u00020\u0003J \u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\u000e\u0010=\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010>\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020\u0003J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010D\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0003J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010F\u001a\u00020\u0006H\u0002J\t\u0010G\u001a\u000204H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0004"}, d2 = {"Lru/fithub/snakes/core/model/GameState;", "", "stateOrder", "", "snakes", "", "Lru/fithub/snakes/core/model/Snake;", "foods", "Lru/fithub/snakes/core/model/Coord;", "players", "Lru/fithub/snakes/core/model/GamePlayers;", "(ILjava/util/List;Ljava/util/List;Lru/fithub/snakes/core/model/GamePlayers;)V", "getFoods", "()Ljava/util/List;", "getPlayers", "()Lru/fithub/snakes/core/model/GamePlayers;", "getSnakes", "getStateOrder", "()I", "addNewPlayer", "player", "Lru/fithub/snakes/core/model/GamePlayer;", "addNewSnake", "newPlayer", "gameConfig", "Lru/fithub/snakes/core/model/GameConfig;", "apply", "changeDirections", "newDirections", "", "Lru/fithub/snakes/core/model/Direction;", "changeToViewers", "component1", "component2", "component3", "component4", "containsDeputy", "", "copy", "countPoints", "countPointsForCrashed", "countPointsForFood", "deleteEatenFood", "deletedCrashedSnakes", "equals", "other", "findPlaceForFood", "Ljava/util/Optional;", "findPlayerById", "playerId", "findPlayerByName", "name", "", "findSnakeByGamePlayer", "findSnakeByGamePlayerId", "generateFood", "generateNewId", "hasSomethingAround", "x", "y", "hashCode", "isValidNewPlayer", "isValidNewSnake", "makeDeputy", "receiverIp", "receiverPort", "makeMove", "moveSnakes", "removePlayer", "snakesWithout", "missing", "toString"})
public final class GameState {
    private final int stateOrder = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<ru.fithub.snakes.core.model.Snake> snakes = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<ru.fithub.snakes.core.model.Coord> foods = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.model.GamePlayers players = null;
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState copy(int stateOrder, @org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.core.model.Snake> snakes, @org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.core.model.Coord> foods, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayers players) {
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
    
    public GameState(int stateOrder, @org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.core.model.Snake> snakes, @org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.core.model.Coord> foods, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayers players) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getStateOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.Snake> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.Snake> getSnakes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.Coord> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ru.fithub.snakes.core.model.Coord> getFoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GamePlayers component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GamePlayers getPlayers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState apply() {
        return null;
    }
    
    /**
     * @param newDirections ( key = playerId, value = newDirection )
     */
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState changeDirections(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Integer, ? extends ru.fithub.snakes.core.model.Direction> newDirections) {
        return null;
    }
    
    public final int generateNewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState makeMove(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState addNewPlayer(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayer player) {
        return null;
    }
    
    public final boolean isValidNewPlayer(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayer player) {
        return false;
    }
    
    private final ru.fithub.snakes.core.model.GameState deletedCrashedSnakes(ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GameState changeToViewers() {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GameState generateFood(ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.Optional<ru.fithub.snakes.core.model.Coord> findPlaceForFood(ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GameState moveSnakes(ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GameState countPoints() {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GamePlayer countPointsForFood(ru.fithub.snakes.core.model.GamePlayer player) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GamePlayer countPointsForCrashed(ru.fithub.snakes.core.model.GamePlayer player, ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final java.util.List<ru.fithub.snakes.core.model.Snake> snakesWithout(ru.fithub.snakes.core.model.Snake missing) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.Snake findSnakeByGamePlayer(ru.fithub.snakes.core.model.GamePlayer player) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.GamePlayer findPlayerById(int playerId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.GamePlayer findPlayerByName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.Snake findSnakeByGamePlayerId(int playerId) {
        return null;
    }
    
    private final ru.fithub.snakes.core.model.GameState deleteEatenFood() {
        return null;
    }
    
    public final boolean isValidNewSnake(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState addNewSnake(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GamePlayer newPlayer, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    private final boolean hasSomethingAround(int x, int y, ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState removePlayer(int playerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.model.GameState makeDeputy(@org.jetbrains.annotations.NotNull
    java.lang.String receiverIp, int receiverPort) {
        return null;
    }
    
    public final boolean containsDeputy() {
        return false;
    }
}