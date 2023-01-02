package ru.fithub.snakes.scenes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lru/fithub/snakes/scenes/AnnouncementViewController;", "", "applicationStateService", "Lru/fithub/snakes/core/service/other/ApplicationStateService;", "joinService", "Lru/fithub/snakes/core/service/other/JoinService;", "(Lru/fithub/snakes/core/service/other/ApplicationStateService;Lru/fithub/snakes/core/service/other/JoinService;)V", "announcementsView", "Ljavafx/scene/control/ListView;", "", "getAnnouncementsView", "()Ljavafx/scene/control/ListView;", "setAnnouncementsView", "(Ljavafx/scene/control/ListView;)V", "getApplicationStateService", "()Lru/fithub/snakes/core/service/other/ApplicationStateService;", "getJoinService", "()Lru/fithub/snakes/core/service/other/JoinService;", "oldActiveGames", "", "Lru/fithub/snakes/core/model/AvailableGame;", "change", "", "newActiveGames", "", "onPlay", "mouseEvent", "Ljavafx/scene/input/MouseEvent;", "onWatch", "snakes"})
public final class AnnouncementViewController {
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService = null;
    @org.jetbrains.annotations.NotNull
    private final ru.fithub.snakes.core.service.other.JoinService joinService = null;
    @javafx.fxml.FXML
    public javafx.scene.control.ListView<java.lang.String> announcementsView;
    private final java.util.List<ru.fithub.snakes.core.model.AvailableGame> oldActiveGames = null;
    
    public AnnouncementViewController(@org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.ApplicationStateService applicationStateService, @org.jetbrains.annotations.NotNull
    ru.fithub.snakes.core.service.other.JoinService joinService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.ApplicationStateService getApplicationStateService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ru.fithub.snakes.core.service.other.JoinService getJoinService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final javafx.scene.control.ListView<java.lang.String> getAnnouncementsView() {
        return null;
    }
    
    public final void setAnnouncementsView(@org.jetbrains.annotations.NotNull
    javafx.scene.control.ListView<java.lang.String> p0) {
    }
    
    public final void change(@org.jetbrains.annotations.NotNull
    java.util.List<ru.fithub.snakes.core.model.AvailableGame> newActiveGames) {
    }
    
    @javafx.fxml.FXML
    public final void onWatch(@org.jetbrains.annotations.Nullable
    javafx.scene.input.MouseEvent mouseEvent) {
    }
    
    @javafx.fxml.FXML
    public final void onPlay(@org.jetbrains.annotations.Nullable
    javafx.scene.input.MouseEvent mouseEvent) {
    }
}