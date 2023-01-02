package ru.fithub.snakes

import javafx.application.Application
import javafx.application.Platform
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.stage.Stage
import ru.fithub.snakes.core.config.ServiceConfig
import ru.fithub.snakes.core.model.Direction
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.event.config.EventConfig
import ru.fithub.snakes.net.NetConfig
import ru.fithub.snakes.scenes.*

class SnakesApplication : Application(), ScenePresenter {
    lateinit var stage: Stage

    lateinit var eventConfig: EventConfig
    lateinit var serviceConfig: ServiceConfig
    lateinit var netConfig: NetConfig

    private lateinit var mainMenuView: Scene
    private lateinit var gameView: Scene
    private lateinit var announcementView: Scene
    private lateinit var joinView: Scene

    lateinit var mainMenuController: MainMenuController
    lateinit var gameViewController: GameViewController
    lateinit var announcementViewController: AnnouncementViewController
    lateinit var joinViewController: JoinViewController

    override fun start(stage: Stage) {
        this.stage = stage
        configure()
        createAllViews()
        createStage()
        postConfigure()
    }

    private fun postConfigure() {
        serviceConfig.announcementPresenter.announcementViewController = announcementViewController
        serviceConfig.gamePlayPresenter.gameViewController = gameViewController
    }

    private fun createAllViews() {
        val mainMenuViewFxml = FXMLLoader(SnakesApplication::class.java.getResource("scenes/main-menu.fxml"))
        mainMenuViewFxml.setControllerFactory {
            MainMenuController(serviceConfig.applicationStateService)
        }

        val joinViewFxml = FXMLLoader(SnakesApplication::class.java.getResource("scenes/join-view.fxml"))
        joinViewFxml.setControllerFactory {
            JoinViewController(serviceConfig.applicationStateService)
        }

        val announcementViewFxml = FXMLLoader(SnakesApplication::class.java.getResource("scenes/select-game-view.fxml"))
        announcementViewFxml.setControllerFactory {
            AnnouncementViewController(serviceConfig.applicationStateService as ApplicationStateService, serviceConfig.joinService)
        }

        val gameViewFxml = FXMLLoader(SnakesApplication::class.java.getResource("scenes/game-view.fxml"))
        gameViewFxml.setControllerFactory {
            GameViewController(serviceConfig.applicationStateService as ApplicationStateService)
        }


        mainMenuView = Scene(mainMenuViewFxml.load(), 640.0, 480.0)
        announcementView = Scene(announcementViewFxml.load(), 640.0, 480.0)
        joinView = Scene(joinViewFxml.load(), 640.0, 480.0)
        gameView = Scene(gameViewFxml.load(), 640.0, 480.0).apply {
            setOnKeyPressed { keyEvent ->
                when (keyEvent.code) {
                    KeyCode.W -> serviceConfig.changeDirectionService.changeDirection(Direction.UP)
                    KeyCode.A -> serviceConfig.changeDirectionService.changeDirection(Direction.LEFT)
                    KeyCode.D -> serviceConfig.changeDirectionService.changeDirection(Direction.RIGHT)
                    KeyCode.S -> serviceConfig.changeDirectionService.changeDirection(Direction.DOWN)
                    else -> {}
                }
            }
        }

        mainMenuController = mainMenuViewFxml.getController()
        announcementViewController = announcementViewFxml.getController()
        gameViewController = gameViewFxml.getController()
        //joinViewController = joinViewFxml.getController()
    }

    private fun createStage() {
        stage.title = "Snakes online!"
        stage.isResizable = false
        stage.scene = mainMenuView
        stage.show()
    }

    private fun configure() {
        eventConfig = EventConfig()
        serviceConfig = ServiceConfig(eventConfig, this)
        netConfig = NetConfig(eventConfig, serviceConfig)
    }

    override fun changeScene(sceneType: SceneType) {
        Platform.runLater {
            stage.scene = when (sceneType) {
                SceneType.MAIN_MENU -> mainMenuView
                SceneType.JOIN -> joinView
                SceneType.GAME_SELECTION -> announcementView
                SceneType.GAME -> gameView
            }
        }
    }
}

fun main() {
    Application.launch(SnakesApplication::class.java)
}