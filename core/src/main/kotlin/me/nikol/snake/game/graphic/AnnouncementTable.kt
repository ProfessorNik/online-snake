package me.nikol.snake.game.graphic

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.scenes.scene2d.ui.*
import ktx.actors.onClick
import me.nikol.snake.game.Main
import me.nikol.snake.game.StateType
import me.nikol.snake.game.model.*
import java.util.EventListener

class AnnouncementTable(val textFieldStyle: TextField.TextFieldStyle, val main: Main) : Table() {
    private val textButtonStyle: TextButton.TextButtonStyle = TextButton.TextButtonStyle().apply {
        font = BitmapFont()
        fontColor = Color.RED
        downFontColor = Color.YELLOW
    }
    private val textField: TextField = TextField("Connect:", textFieldStyle)

    init { add(textField).colspan(2).row() }

    private fun createButton(buttonName: String, delayed: DelayedMessage<JoinMsg>, gameAnnouncement: GameAnnouncement): Button {
        return TextButton(buttonName, textButtonStyle).apply {
            onClick {
                main.joinAnnouncement = gameAnnouncement
                main.joinMsg = delayed
                main.changeState(StateType.JOIN)
            }
        }
    }

    fun change(scores: List<Triple<GameAnnouncement, DelayedMessage<JoinMsg>, DelayedMessage<JoinMsg>?>>) {
        clear()
        add(textField).row()
        scores.forEach { triple ->
            val master: GamePlayer = triple.first.players.players.find { it.role == NodeRole.MASTER }!!
            add(TextField("${master.name}[${master.ipAddress}] ${triple.first.players.players.size} ${triple.first.config.width}x${triple.first.config.height} ${triple.first.config.foodStatic}+1x", textFieldStyle)).space(5f)
            add(createButton("Watch", triple.second, triple.first)).space(5f)
            triple.third?.let { mayBePlay -> add(createButton("Play", mayBePlay, triple.first)) }
            row()
        }
    }
}