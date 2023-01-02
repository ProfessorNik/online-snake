//package ru.fithub.snakes.core.graphic
//
//import com.badlogic.gdx.graphics.Color
//import com.badlogic.gdx.graphics.g2d.BitmapFont
//import com.badlogic.gdx.scenes.scene2d.ui.*
//import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle
//import ktx.actors.onClick
//import me.nikol.snake.game.Main
//import me.nikol.snake.game.StateType
//import me.nikol.snake.game.model.GamePlayer
//
//class ScoreTable(textFieldStyle: TextFieldStyle, main: Main) : Table() {
//    private val scorePlace: VerticalGroup = VerticalGroup()
//    private val textButtonStyle: TextButton.TextButtonStyle = TextButton.TextButtonStyle().apply {
//        font = BitmapFont()
//        fontColor = Color.BLACK
//        downFontColor = Color.YELLOW
//    }
//    private val textField: TextField = TextField("Scores", textFieldStyle)
//    private val textFieldEnemyStyle = textFieldStyle
//    private val textFiledFriendlyStyle = TextFieldStyle().apply {
//        font = BitmapFont()
//        fontColor = Color.YELLOW
//    }
//
//    private val exitButton: Button = TextButton("Exit", textButtonStyle).apply {
//        onClick {
//            println("click")
//            main.changeState(StateType.NOTHING)
//        }
//    }
//    private val newGameButton: Button = TextButton("New Game", textButtonStyle).apply {
//        onClick {
//            println("click")
//            main.changeState(StateType.GAME)
//        }
//    }
//
//    init {
//        add(textField).colspan(2).row()
//        add(scorePlace).colspan(2).row()
//        add(exitButton)
//        add(newGameButton)
//        scorePlace.addActor(TextField("1. ", textFieldStyle))
//        scorePlace.addActor(TextField("2. ", textFieldStyle))
//        scorePlace.addActor(TextField("3. ", textFieldStyle))
//    }
//
//    fun change(scores: Map<GamePlayer, Boolean>) {
//        var i = 0
//        scorePlace.clear()
//        scores.forEach { (player, isFriendly) ->
//                i++
//                if (isFriendly)
//                    scorePlace.addActor(TextField("$i.${player.name} ${player.score}", textFiledFriendlyStyle))
//                else
//                    scorePlace.addActor(TextField("$i.${player.name} ${player.score}", textFieldEnemyStyle))
//            }
//    }
//}