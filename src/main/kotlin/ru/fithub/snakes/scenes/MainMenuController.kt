package ru.fithub.snakes.scenes

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.service.other.ApplicationStateService

class MainMenuController(
    val applicationStateService: ApplicationStateService
) {
    @FXML
    lateinit var joinGameButton: Button

    @FXML
    lateinit var newGameButton: Button

    @FXML
    fun newGame(event: MouseEvent?) {
        applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.MASTER)
    }

    @FXML
    fun joinGame(event: MouseEvent?) {
        applicationStateService.changeState(ApplicationStateType.GAME_SELECTION, null)
    }

}