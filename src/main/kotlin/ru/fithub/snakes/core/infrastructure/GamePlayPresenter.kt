package ru.fithub.snakes.core.infrastructure

import ru.fithub.snakes.core.graphic.FiledItemType
import ru.fithub.snakes.core.model.GameState
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.service.behavior.Behavior
import ru.fithub.snakes.scenes.GameViewController

class GamePlayPresenter(
    val generalRepository: GeneralRepository
){
    lateinit var gameViewController: GameViewController

    fun updateField(gameState: GameState) {
        val map: MutableMap<Pair<Int, Int>, FiledItemType> = HashMap()

        gameState.snakes.forEach { snake ->
            if (snake.playerId == generalRepository.playerId)
                snake.alignPoints(generalRepository.gameConfig!!).forEach {
                    map[Pair(it.x, it.y)] = FiledItemType.FRIENDLY_SNAKE
                }
            else
                snake.alignPoints(generalRepository.gameConfig!!).forEach {
                    map[Pair(it.x, it.y)] = FiledItemType.ENEMY_SNAKE
                }
        }

        gameState.foods.forEach {
            map[Pair(it.x, it.y)] = FiledItemType.FOOD
        }


        gameViewController.update(
            generalRepository.gameConfig!!,
            map,
            gameState.players.players.associate {
                if (it.id == generalRepository.playerId) it to true else it to false
            })
    }
}