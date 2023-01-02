package ru.fithub.snakes.core.infrastructure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J<\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2,\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\r0\nH\u0002J4\u0010\u0011\u001a\u00020\u00122,\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\r0\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lru/fithub/snakes/core/infrastructure/AnnouncementPresenter;", "", "()V", "announcementViewController", "Lru/fithub/snakes/scenes/AnnouncementViewController;", "getAnnouncementViewController", "()Lru/fithub/snakes/scenes/AnnouncementViewController;", "setAnnouncementViewController", "(Lru/fithub/snakes/scenes/AnnouncementViewController;)V", "map", "", "Lru/fithub/snakes/core/model/AvailableGame;", "activeGames", "Lkotlin/Triple;", "Lru/fithub/snakes/core/model/GameAnnouncement;", "Lru/fithub/snakes/core/model/DelayedMessage;", "Lru/fithub/snakes/core/model/JoinMsg;", "showActiveGames", "", "snakes"})
public final class AnnouncementPresenter {
    @org.jetbrains.annotations.Nullable
    private ru.fithub.snakes.scenes.AnnouncementViewController announcementViewController;
    
    public AnnouncementPresenter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final ru.fithub.snakes.scenes.AnnouncementViewController getAnnouncementViewController() {
        return null;
    }
    
    public final void setAnnouncementViewController(@org.jetbrains.annotations.Nullable
    ru.fithub.snakes.scenes.AnnouncementViewController p0) {
    }
    
    public final void showActiveGames(@org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Triple<ru.fithub.snakes.core.model.GameAnnouncement, ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg>, ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg>>> activeGames) {
    }
    
    private final java.util.List<ru.fithub.snakes.core.model.AvailableGame> map(java.util.List<kotlin.Triple<ru.fithub.snakes.core.model.GameAnnouncement, ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg>, ru.fithub.snakes.core.model.DelayedMessage<ru.fithub.snakes.core.model.JoinMsg>>> activeGames) {
        return null;
    }
}