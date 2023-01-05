package ru.fithub.snakes.scenes

import javafx.application.Platform
import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.scene.control.ListView
import javafx.scene.input.MouseEvent
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.core.service.other.JoinService

class AnnouncementViewController(val applicationStateService: ApplicationStateService, val joinService: JoinService) {
    @FXML
    lateinit var announcementsView: ListView<String>

    private val oldActiveGames = mutableListOf<AvailableGame>()

    fun change(newActiveGames: List<AvailableGame>) {
        Platform.runLater {
            oldActiveGames.clear()
            oldActiveGames.addAll(newActiveGames)

            val displayedActiveGames = FXCollections.observableArrayList(oldActiveGames.map { it.text })
            announcementsView.items = displayedActiveGames
        }
    }

    @FXML
    fun onWatch(mouseEvent: MouseEvent?) {
        announcementsView.selectionModel.selectedItem?.let { text ->
            val game = oldActiveGames.find { it.text == text }
            if (game!= null) {
                joinService.join(game.messageForViewer, game.announcement)
            }

            applicationStateService.changeState(ApplicationStateType.JOIN, NodeRole.VIEWER)
        }
    }

    @FXML
    fun onPlay(mouseEvent: MouseEvent?) {
        announcementsView.selectionModel.selectedItem?.let { text ->
            val game = oldActiveGames.find { it.text == text }
            if (game?.messageForNormal  != null) {
                joinService.join(game.messageForNormal, game.announcement)
            }
            applicationStateService.changeState(ApplicationStateType.JOIN, NodeRole.NORMAL)
        }
    }
}