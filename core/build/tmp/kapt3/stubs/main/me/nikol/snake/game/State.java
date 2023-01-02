package me.nikol.snake.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lme/nikol/snake/game/State;", "", "changeState", "newStateType", "Lme/nikol/snake/game/StateType;", "core"})
public abstract interface State {
    
    @org.jetbrains.annotations.NotNull
    public abstract me.nikol.snake.game.State changeState(@org.jetbrains.annotations.NotNull
    me.nikol.snake.game.StateType newStateType);
}