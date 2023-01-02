package ru.fithub.snakes.scenes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 H2\u00020\u0001:\u0001HB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u00106\u001a\u00020\u00112\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020#H\u0002J\b\u0010;\u001a\u00020<H\u0007J\u0012\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010@\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007JB\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020#2\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080E\u0012\u0004\u0012\u00020F0D2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006I"}, d2 = {"Lru/fithub/snakes/scenes/GameViewController;", "", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "(Lru/fithub/snakes/core/service/other/ApplicationStateService;)V", "getApplicationStateService", "()Lru/fithub/snakes/core/service/other/ApplicationStateService;", "cells", "", "Ljavafx/scene/control/Label;", "getCells", "()Ljava/util/List;", "setCells", "(Ljava/util/List;)V", "colName", "Ljavafx/scene/control/TableColumn;", "Lru/fithub/snakes/scenes/viewmodel/ScoresViewModel;", "", "getColName", "()Ljavafx/scene/control/TableColumn;", "setColName", "(Ljavafx/scene/control/TableColumn;)V", "colRole", "getColRole", "setColRole", "colScores", "getColScores", "setColScores", "fieldGrid", "Ljavafx/scene/layout/GridPane;", "getFieldGrid", "()Ljavafx/scene/layout/GridPane;", "setFieldGrid", "(Ljavafx/scene/layout/GridPane;)V", "oldConfig", "Lru/fithub/snakes/core/model/GameConfig;", "getOldConfig", "()Lru/fithub/snakes/core/model/GameConfig;", "setOldConfig", "(Lru/fithub/snakes/core/model/GameConfig;)V", "oldScores", "", "Lru/fithub/snakes/core/model/GamePlayer;", "", "getOldScores", "()Ljava/util/Map;", "setOldScores", "(Ljava/util/Map;)V", "scoresTable", "Ljavafx/scene/control/TableView;", "getScoresTable", "()Ljavafx/scene/control/TableView;", "setScoresTable", "(Ljavafx/scene/control/TableView;)V", "fillGrass", "x", "", "y", "gameConfig", "initialize", "", "onExit", "event", "Ljavafx/scene/input/MouseEvent;", "onView", "update", "newConfig", "map", "", "Lkotlin/Pair;", "Lru/fithub/snakes/core/graphic/FiledItemType;", "newScores", "Companion", "snakes"})
public final class GameViewController {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    @org.jetbrains.annotations.NotNull
    public static final ru.fithub.snakes.scenes.GameViewController.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PEACEFUL_SNAKE_COLOR = "-fx-background-color: blue;";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENEMY_SNAKE_COLOR = "-fx-background-color: red;";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRASS_1_COLOR = "-fx-background-color: green;";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GRASS_2_COLOR = "-fx-background-color: yellow;";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FOOD_COLOR = "-fx-background-color: violet;";
    @javafx.fxml.FXML
    public javafx.scene.layout.GridPane fieldGrid;
    @javafx.fxml.FXML
    public javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> colName;
    @javafx.fxml.FXML
    public javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> colRole;
    @javafx.fxml.FXML
    public javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> colScores;
    @javafx.fxml.FXML
    public javafx.scene.control.TableView<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel> scoresTable;
    public java.util.List<? extends java.util.List<? extends javafx.scene.control.Label>> cells;
    @org.jetbrains.annotations.Nullable
    private java.util.Map<ru.fithub.snakes.core.model.GamePlayer, java.lang.Boolean> oldScores;
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.core.model.GameConfig oldConfig;
    
    public GameViewController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.ApplicationStateService getApplicationStateService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.scene.layout.GridPane getFieldGrid() {
        return null;
    }
    
    public final void setFieldGrid(@org.jetbrains.annotations.NotNull
    javafx.scene.layout.GridPane p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> getColName() {
        return null;
    }
    
    public final void setColName(@org.jetbrains.annotations.NotNull
    javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> getColRole() {
        return null;
    }
    
    public final void setColRole(@org.jetbrains.annotations.NotNull
    javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> getColScores() {
        return null;
    }
    
    public final void setColScores(@org.jetbrains.annotations.NotNull
    javafx.scene.control.TableColumn<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.scene.control.TableView<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel> getScoresTable() {
        return null;
    }
    
    public final void setScoresTable(@org.jetbrains.annotations.NotNull
    javafx.scene.control.TableView<ru.fithub.snakes.scenes.viewmodel.ScoresViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.List<javafx.scene.control.Label>> getCells() {
        return null;
    }
    
    public final void setCells(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.List<? extends javafx.scene.control.Label>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Map<ru.fithub.snakes.core.model.GamePlayer, java.lang.Boolean> getOldScores() {
        return null;
    }
    
    public final void setOldScores(@org.jetbrains.annotations.Nullable
    java.util.Map<ru.fithub.snakes.core.model.GamePlayer, java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.core.model.GameConfig getOldConfig() {
        return null;
    }
    
    public final void setOldConfig(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.core.model.GameConfig p0) {
    }
    
    @javafx.fxml.FXML
    public final void initialize() {
    }
    
    @javafx.fxml.FXML
    public final void onExit(@org.jetbrains.annotations.Nullable
    javafx.scene.input.MouseEvent event) {
    }
    
    @javafx.fxml.FXML
    public final void onView(@org.jetbrains.annotations.Nullable
    javafx.scene.input.MouseEvent event) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.model.GameConfig newConfig, @org.jetbrains.annotations.NotNull
    java.util.Map<kotlin.Pair<java.lang.Integer, java.lang.Integer>, ru.fithub.snakes.core.graphic.FiledItemType> map, @org.jetbrains.annotations.NotNull
    java.util.Map<ru.fithub.snakes.core.model.GamePlayer, java.lang.Boolean> newScores) {
    }
    
    private final java.lang.String fillGrass(int x, int y, ru.fithub.snakes.core.model.GameConfig gameConfig) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/fithub/snakes/scenes/GameViewController$Companion;", "", "()V", "ENEMY_SNAKE_COLOR", "", "FOOD_COLOR", "GRASS_1_COLOR", "GRASS_2_COLOR", "PEACEFUL_SNAKE_COLOR", "snakes"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}