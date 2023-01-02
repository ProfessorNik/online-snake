package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.repostiory.ApplicationStateRepository
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.core.service.other.GameService
import ru.fithub.snakes.scenes.ScenePresenter
import ru.fithub.snakes.scenes.SceneType

class ApplicationStateServiceImpl(
    private val gameService: GameService,
    private val scenePresenter: ScenePresenter,
    private val applicationStateRepository: ApplicationStateRepository
) : ApplicationStateService {
    override var applicationStateType: ApplicationStateType?
        get() {
            return applicationStateRepository.applicationStateType
        }
        set(value) {
            applicationStateRepository.applicationStateType = value
        }

    override var nodeRole: NodeRole?
        get() {
            return applicationStateRepository.behaviorType
        }
        set(value) {
            applicationStateRepository.behaviorType = value
        }

    var applicationState: ApplicationState = createState(ApplicationStateType.MAIN_MENU)

    override fun changeState(newState: ApplicationStateType?, newBehavior: NodeRole?) {
        applicationStateRepository.applicationStateType = newState
        applicationStateRepository.behaviorType = newBehavior
        applicationState = applicationState.changeState()
    }

    fun createState(applicationStateType: ApplicationStateType): ApplicationState {
        return when (applicationStateType) {
            ApplicationStateType.MAIN_MENU -> MainMenuApplicationState(gameService, scenePresenter, this)
            ApplicationStateType.VIEW_GAME -> JoinGameState(
                scenePresenter,
                gameService,
                applicationStateRepository,
                this
            )
            ApplicationStateType.GAME -> GameApplicationState(
                scenePresenter,
                this,
                gameService,
                applicationStateRepository
            )
            ApplicationStateType.GAME_SELECTION -> GameSelectionState(scenePresenter, applicationStateRepository, this)
            ApplicationStateType.JOIN -> JoinGameState(scenePresenter, gameService, applicationStateRepository, this)
        }
    }
}


interface ApplicationState {
    fun changeState(): ApplicationState
}

class MainMenuApplicationState(
    private val gameService: GameService,
    private val scenePresenter: ScenePresenter,
    private val applicationStateServiceImpl: ApplicationStateServiceImpl
) : ApplicationState {
    override fun changeState(): ApplicationState {
        return when (applicationStateServiceImpl.applicationStateType) {
            ApplicationStateType.GAME -> {
                scenePresenter.changeScene(SceneType.GAME)
                gameService.prepareServerGame()
                gameService.startServerSchedulers()
                applicationStateServiceImpl.createState(ApplicationStateType.GAME)
            }
            ApplicationStateType.GAME_SELECTION -> {
                scenePresenter.changeScene(SceneType.GAME_SELECTION)
                applicationStateServiceImpl.createState(ApplicationStateType.GAME_SELECTION)
            }
            else -> {
                throw IllegalStateException()
            }
        }
    }
}

class GameSelectionState(
    private val scenePresenter: ScenePresenter,
    private val applicationStateRepository: ApplicationStateRepository,
    private val applicationStateServiceImpl: ApplicationStateServiceImpl
) : ApplicationState {
    override fun changeState(): ApplicationState {
        return when (applicationStateRepository.applicationStateType) {
            ApplicationStateType.MAIN_MENU -> {
                scenePresenter.changeScene(SceneType.MAIN_MENU)
                applicationStateServiceImpl.createState(ApplicationStateType.GAME)
            }
            ApplicationStateType.JOIN -> {
                scenePresenter.changeScene(SceneType.JOIN)
                applicationStateServiceImpl.createState(ApplicationStateType.JOIN)
            }
            else -> {
                throw IllegalStateException()
            }
        }
    }
}

class JoinGameState(
    private val scenePresenter: ScenePresenter,
    private val gameService: GameService,
    private val applicationStateRepository: ApplicationStateRepository,
    private val applicationStateServiceImpl: ApplicationStateServiceImpl
) : ApplicationState {
    override fun changeState(): ApplicationState {
        return when (applicationStateRepository.applicationStateType) {
            ApplicationStateType.MAIN_MENU -> {
                scenePresenter.changeScene(SceneType.MAIN_MENU)
                applicationStateServiceImpl.createState(ApplicationStateType.MAIN_MENU)
            }
            ApplicationStateType.GAME -> {
                scenePresenter.changeScene(SceneType.GAME)
                gameService.startClientSchedulers()
                applicationStateServiceImpl.createState(ApplicationStateType.GAME)
            }
            else -> {
                throw IllegalStateException()
            }
        }
    }
}

class GameApplicationState(
    private val scenePresenter: ScenePresenter,
    private val applicationStateServiceImpl: ApplicationStateServiceImpl,
    private val gameService: GameService,
    private val applicationStateRepository: ApplicationStateRepository
) : ApplicationState {
    override fun changeState(): ApplicationState {
        when (applicationStateRepository.applicationStateType) {
            ApplicationStateType.MAIN_MENU -> {
                destroyAll()
                scenePresenter.changeScene(SceneType.MAIN_MENU)
                return applicationStateServiceImpl.createState(ApplicationStateType.MAIN_MENU)
            }
            ApplicationStateType.GAME -> {
                return when (applicationStateRepository.behaviorType) {
                    NodeRole.NORMAL -> TODO()
                    NodeRole.MASTER -> {
                        gameService.stopClientSchedulers()
                        gameService.deputyToMaster()
                        gameService.startServerSchedulers()
                        this
                    }
                    NodeRole.DEPUTY -> this
                    NodeRole.VIEWER -> {
                        if(gameService.wasServer()){
                            gameService.stopServerSchedulers()
                            if(gameService.hasDeputy()) {
                                gameService.setDeputyAsNewMaster()
                                gameService.startClientSchedulers()
                                this
                            } else {
                                applicationStateServiceImpl.applicationStateType = ApplicationStateType.MAIN_MENU
                                applicationStateServiceImpl.nodeRole = null
                                destroyAll()
                                scenePresenter.changeScene(SceneType.MAIN_MENU)
                                applicationStateServiceImpl.createState(ApplicationStateType.MAIN_MENU)
                            }
                        } else {
                            gameService.clientToViewer()
                            this
                        }
                    }
                    else -> {
                        TODO()
                    }
                }
            }
            else -> {
                throw IllegalStateException()
            }
        }
    }

    private fun destroyAll() {
        gameService.stopServerSchedulers()
        gameService.stopClientSchedulers()
        gameService.clearAll()
    }
}