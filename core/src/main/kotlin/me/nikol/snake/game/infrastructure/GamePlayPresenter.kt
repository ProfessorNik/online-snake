package me.nikol.snake.game.infrastructure

import me.nikol.snake.game.graphic.Field
import me.nikol.snake.game.graphic.FiledItemType
import me.nikol.snake.game.graphic.ScoreTable
import me.nikol.snake.game.model.GameState
import me.nikol.snake.game.service.behavior.Behavior

class GamePlayPresenter(
    val scoreTable: ScoreTable,
    val field: Field,
    val behavior: Behavior
) {
    fun updateField(gameState: GameState) {
        val map: MutableMap<Pair<Int, Int>, FiledItemType> = HashMap()

        gameState.snakes.forEach { snake ->
            if(snake.playerId == behavior.playerId)
                snake.alignPoints(behavior.gameConfig).forEach {
                    map[Pair(it.x, behavior.gameConfig.height - it.y - 1)] = FiledItemType.FRIENDLY_SNAKE
                }
            else
                snake.alignPoints(behavior.gameConfig).forEach {
                    map[Pair(it.x, behavior.gameConfig.height - it.y - 1)] = FiledItemType.ENEMY_SNAKE
                }
        }

        gameState.foods.forEach{
            map[Pair(it.x, behavior.gameConfig.height - it.y - 1)] = FiledItemType.FOOD
        }

        field.mapCells = map
        scoreTable.change(gameState.players.players.associate { if (it.id == behavior.playerId) it to true else it to false })
    }
}