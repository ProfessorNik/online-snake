package me.nikol.snake.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.InputAdapter
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import me.nikol.snake.event.config.EventConfig
import me.nikol.snake.game.config.ServiceConfig
import me.nikol.snake.game.graphic.AnnouncementTable
import me.nikol.snake.game.infrastructure.GamePlayPresenter
import me.nikol.snake.game.graphic.Field
import me.nikol.snake.game.graphic.ScoreTable
import me.nikol.snake.game.infrastructure.AnnouncementPresenter
import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.behavior.Behavior
import me.nikol.snake.game.service.behavior.impl.MasterBehavior
import me.nikol.snake.game.service.behavior.impl.NormalBehavior
import me.nikol.snake.net.NetConfig

class Main : KtxGame<KtxScreen>() {
    lateinit var joinAnnouncement: GameAnnouncement
    lateinit var gameService: Behavior
    lateinit var gamePlayPresenter: GamePlayPresenter
    lateinit var announcementPresenter: AnnouncementPresenter
    lateinit var scoreTable: ScoreTable
    lateinit var announcementTable: AnnouncementTable
    lateinit var field: Field
    lateinit var inputMultiplexer: InputMultiplexer

    lateinit var joinMsg: DelayedMessage<JoinMsg>
    lateinit var eventConfig: EventConfig
    lateinit var serviceConfig: ServiceConfig
    lateinit var netConfig: NetConfig
    lateinit var state: State
    private lateinit var stage: Stage


    fun changeState(newStateType: StateType) {
        state = state.changeState(newStateType)
    }


    override fun create() {
        stage = Stage()
        inputMultiplexer = InputMultiplexer(stage)
        Gdx.input.inputProcessor = inputMultiplexer
        val textFieldStyle: TextFieldStyle = TextFieldStyle().apply {
            font = BitmapFont()
            fontColor = Color.BLACK
        }
        scoreTable = ScoreTable(textFieldStyle, this)
        announcementTable = AnnouncementTable(textFieldStyle, this)
        announcementPresenter = AnnouncementPresenter(announcementTable)
        field = Field(1, 1)

        eventConfig = EventConfig()
        serviceConfig = ServiceConfig(eventConfig, announcementPresenter, this)
        netConfig = NetConfig(eventConfig, serviceConfig)
        state = NothingState(this)

        addScreen(GameScreen(field, scoreTable, announcementTable, stage))
        setScreen<GameScreen>()
    }

    fun startGame(behavior: Behavior) {
        gameService = behavior
        gamePlayPresenter = GamePlayPresenter(
            scoreTable,
            field,
            gameService
        )
        gameService.gamePlayPresenter = gamePlayPresenter
        gameService.startGame()
        serviceConfig.messageService.changeBehavior(gameService)
        inputMultiplexer.addProcessor(object : InputAdapter() {
            override fun keyUp(keycode: Int): Boolean {
                when (keycode) {
                    Input.Keys.W -> gameService.changeDirection(Direction.UP)
                    Input.Keys.S -> gameService.changeDirection(Direction.DOWN)
                    Input.Keys.A -> gameService.changeDirection(Direction.LEFT)
                    Input.Keys.D -> gameService.changeDirection(Direction.RIGHT)
                }
                return true
            }
        })
    }

    fun continueGame(behavior: Behavior){
        gameService = behavior
        gameService.gamePlayPresenter = gamePlayPresenter
        gameService.startGame()
        serviceConfig.messageService.changeBehavior(gameService)
    }

    fun endGame() {
        gameService.endGame()
        field.showPreview()
        inputMultiplexer.removeProcessor(1)
    }

    fun createMasterBehavior(): MasterBehavior {
        return MasterBehavior(
            eventConfig.sendAnnouncementMsgEventPublisher,
            eventConfig.sendErrorMsgEventPublisher,
            eventConfig.sendAckMsgEventPublisher,
            eventConfig.sendRoleChangeMsgEventPublisher,
            eventConfig.sendStateMsgEventPublisher,
            eventConfig.sendPingMsgEventPublisher,
            this
        )
    }

    fun createNormalBehavior(): NormalBehavior {
        return NormalBehavior(eventConfig.sendSteerMsgEventPublisher, eventConfig.sendPingMsgEventPublisher, eventConfig.sendAckMsgEventPublisher, eventConfig.stopSendMessagesToPlayerEventPublisher,this).apply {
            gameConfig = joinAnnouncement.config
        }
    }

    override fun dispose() {
        gameService.endGame()
        super.dispose()
    }

    fun toViewer() {
        val newBehavior = createNormalBehavior()
        newBehavior.playerId = gameService.playerId
        newBehavior.gameConfig = gameService.gameConfig
        newBehavior.messageFormer = gameService.messageFormer
        newBehavior.role = NodeRole.VIEWER
        continueGame(newBehavior)
    }

    fun toMaster() {
        val newBehavior = createMasterBehavior()
        newBehavior.playerId = gameService.playerId
        newBehavior.gameConfig = gameService.gameConfig
        newBehavior.messageFormer = gameService.messageFormer
        continueGame(newBehavior)
    }
}

enum class StateType {
    NOTHING,
    GAME,
    JOIN
}

interface State {
    fun changeState(newStateType: StateType): State
}

class NothingState(val main: Main) : State {
    override fun changeState(newStateType: StateType): State {
        return when (newStateType) {
            StateType.NOTHING -> this
            StateType.GAME -> {
                main.startGame(main.createMasterBehavior())
                InGameState(main)
            }
            StateType.JOIN -> {
                main.serviceConfig.joinService.join(main.joinMsg)
                return JoinState(main)
            }
        }
    }
}


class InGameState(private val main: Main) : State {
    override fun changeState(newStateType: StateType): State {
        return when (newStateType) {
            StateType.NOTHING -> {
                main.endGame()
                NothingState(main)
            }
            StateType.GAME -> this
            StateType.JOIN -> {
                main.endGame()
                main.serviceConfig.joinService.join(main.joinMsg)
                JoinState(main)
            }
        }
    }

}

class JoinState(private val main: Main) : State {
    override fun changeState(newStateType: StateType): State {
        return when (newStateType) {
            StateType.NOTHING -> NothingState(main)
            StateType.JOIN -> this
            StateType.GAME -> {
                main.startGame(main.createNormalBehavior())
                InGameState(main)
            }
        }
    }
}


class GameScreen(field: Field, scoreTable: ScoreTable, announcementTable: AnnouncementTable, private val stage: Stage) :
    KtxScreen {
    private val batch = SpriteBatch()
    private val shapeRenderer = ShapeRenderer()
    private val table: Table = Table()

    init {
        table.debug = true
        table.setFillParent(true)
        scoreTable.debug = true
        table.add(field).size(300f, 300f)
        table.add(VerticalGroup().apply {
            addActor(scoreTable)
            addActor(announcementTable)
        })

        stage.addActor(table)
    }

    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        stage.draw()
    }

    override fun dispose() {
        shapeRenderer.disposeSafely()
        batch.disposeSafely()
    }
}

class JoinScreen(): KtxScreen{
    private val image = Texture("logo.png".toInternalFile(), true).apply { setFilter(Linear, Linear) }
    private val batch = SpriteBatch()

    override fun render(delta: Float){

    }

    override fun dispose() {
        image.disposeSafely()
    }
}