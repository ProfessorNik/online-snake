package me.nikol.snake.game.model

import com.fasterxml.jackson.annotation.JsonProperty
import me.nikol.snake.game.exceptions.CantAddException
import java.util.*

data class GameState(
    @JsonProperty("state_order")
    val stateOrder: Int,
    val snakes: List<Snake>,
    val foods: List<Coord>,
    val players: GamePlayers
) {

    fun apply(): GameState {
        return copy(stateOrder = stateOrder + 1)
    }

    /**
     * @param newDirections ( key = playerId, value = newDirection )
     */
    fun changeDirections(newDirections: Map<Int, Direction>): GameState {
        return copy(
            snakes = snakes.map {
                it.copy(direction = newDirections.getOrDefault(it.playerId, it.direction))
            }
        )
    }

    fun generateNewId(): Int {
        return players.players.maxOf { it.id } + 1
    }

    fun makeMove(gameConfig: GameConfig): GameState {
        return moveSnakes(gameConfig)
            .countPoints(gameConfig)
            .deleteEatenFood()
            .generateFood(gameConfig)
            .deletedCrashedSnakes(gameConfig)
            .changeToViewers()
    }

    fun addNewPlayer(player: GamePlayer): GameState {
        return copy(players = GamePlayers(players.players + listOf(player)))
    }

    fun isValidNewPlayer(player: GamePlayer): Boolean {
        val usedNames = players.players.map { it.name }
        if (usedNames.contains(player.name)) {
            return false
        }
        return true
    }

    private fun deletedCrashedSnakes(gameConfig: GameConfig): GameState {
        return copy(snakes = snakes.fold(listOf()) { survivorsSnakes, snake ->
            if (snake.crashed(snakes, gameConfig)) {
                survivorsSnakes
            } else {
                survivorsSnakes + snake
            }
        })
    }

    private fun changeToViewers(): GameState {
        val snakesIds = snakes.map { it.playerId }
        return copy(players = GamePlayers(players.players.map { player ->
            if (snakesIds.contains(player.id))
                player
            else
                player.copy(role = NodeRole.VIEWER)
        }))
    }

    private fun generateFood(gameConfig: GameConfig): GameState {
        val mustBeFood = gameConfig.foodStatic + snakes.size
        val lackOfFood = mustBeFood - foods.size

        return (1..lackOfFood).fold(this) { gameState, _ ->
            val coordOpt = gameState.findPlaceForFood(gameConfig)
            if (coordOpt.isPresent) {
                gameState.copy(foods = gameState.foods + coordOpt.get())
            } else {
                gameState
            }
        }
    }

    private fun findPlaceForFood(gameConfig: GameConfig): Optional<Coord> {
        buildList<Coord> {
            for (x in 0 until gameConfig.width)
                for (y in 0 until gameConfig.height)
                    return@buildList
        }

        val occupiedCellsBySnakes = snakes.flatMap { it.alignPoints(gameConfig) }
        val occupiedCells = occupiedCellsBySnakes + foods

        return Optional.ofNullable((0 until gameConfig.width).fold(listOf<Coord>()) { acc, x ->
            (0 until gameConfig.height).fold(acc) { emptyPoints, y ->
                if (occupiedCells.contains(Coord(x, y)))
                    emptyPoints
                else
                    emptyPoints + listOf(Coord(x, y))
            }
        }.randomOrNull())
    }

    private fun moveSnakes(gameConfig: GameConfig): GameState {
        return copy(snakes = snakes.map { it.move(foods, gameConfig) })
    }

    private fun countPoints(gameConfig: GameConfig): GameState {
        return copy(
            players =
            players.copy(
                players = players.players
                    .map { countPointsForFood(it) }
                    .map { countPointsForCrashed(it, gameConfig) }
            )
        )
    }

    private fun countPointsForFood(player: GamePlayer): GamePlayer {
        val playerSnake = findSnakeByGamePlayer(player)
        if (playerSnake != null) {
            if (foods.contains(playerSnake.head())) {
                return player.copy(score = player.score + 1)
            }
        }
        return player
    }

    private fun countPointsForCrashed(player: GamePlayer, gameConfig: GameConfig): GamePlayer {
        val playerSnake = findSnakeByGamePlayer(player)
        if (playerSnake != null) {
            return player.copy(score = player.score + listSnakeWithout(playerSnake).fold(0) { acc, snake ->
                if (snake.crashed(playerSnake, gameConfig)) acc + 1 else acc
            })
        }
        return player
    }

    private fun listSnakeWithout(missing: Snake): List<Snake> {
        return snakes.fold(listOf()) { acc, snake -> if (snake == missing) acc else acc + listOf(snake) }
    }

    private fun findSnakeByGamePlayer(player: GamePlayer): Snake? {
        return snakes.find { it.playerId == player.id }
    }

    private fun deleteEatenFood(): GameState {
        val heads = snakes.map { it.head() }

        return copy(foods = foods.fold(listOf()) { acc, food ->
            if (heads.contains(food)) acc
            else acc + listOf(food)
        })
    }

    fun isValidNewSnake(gameConfig: GameConfig): Boolean {
        (0 until gameConfig.width).forEach { x ->
            (0 until gameConfig.width).forEach { y ->
                if (x in 2 until gameConfig.width - 2) {
                    if (y in 2 until gameConfig.height - 2) {
                        if (!hasSomethingAround(x, y, gameConfig)) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    fun addNewSnake(newPlayer: GamePlayer, gameConfig: GameConfig): GameState {
        val coords: MutableList<Coord> = mutableListOf()
        var direction: Direction = Direction.UP
        run br@{
            (0 until gameConfig.width).forEach { x ->
                (0 until gameConfig.width).forEach { y ->
                    if (x in 2 until gameConfig.width - 2) {
                        if (y in 2 until gameConfig.height - 2) {
                            if (!hasSomethingAround(x, y, gameConfig)) {
                                direction = Direction.getByValue((1..4).random())
                                coords.add(Coord(x, y))
                                when (direction) {
                                    Direction.UP -> coords.add(Coord(0, 1))
                                    Direction.DOWN -> coords.add(Coord(0, -1))
                                    Direction.LEFT -> coords.add(Coord(1, 0))
                                    Direction.RIGHT -> coords.add(Coord(-1, 0))
                                }
                                return@br
                            }
                        }
                    }
                }
            }
        }
        if (coords.isNotEmpty()) {
            return copy(snakes = snakes + Snake(newPlayer.id, coords, SnakeState.ALIVE, direction))
        }
        throw CantAddException()
    }

    private fun hasSomethingAround(x: Int, y: Int, gameConfig: GameConfig): Boolean {
        val occupiedCellsBySnakes = snakes.flatMap { it.alignPoints(gameConfig) }
        val occupiedCells = occupiedCellsBySnakes + foods

        (-2..2).forEach { dx ->
            (-2..2).forEach { dy ->
                val place = Coord(x + dx, y + dy)
                if ((dx != 0 && dy != 0) && occupiedCells.contains(place)) {
                    return false
                }
            }
        }
        return true
    }

    fun removePlayer(playerId: Int): GameState {
        return copy(players = GamePlayers(players.players.filter { it.id != playerId }),
            snakes = snakes.map { if (it.playerId == playerId) it.copy(state = SnakeState.ZOMBIE) else it })
    }

}

data class Snake(
    @JsonProperty("player_id")
    val playerId: Int,
    val points: List<Coord>,
    val state: SnakeState = SnakeState.ALIVE,
    @JsonProperty("head_direction")
    val direction: Direction
) {
    fun move(foods: List<Coord>, gameConfig: GameConfig): Snake {
        return copy(points = moveHeadAndPrevPoint(foods, gameConfig) + dropRedundantPoints(foods, gameConfig))
    }

    private fun moveHeadAndPrevPoint(foods: List<Coord>, gameConfig: GameConfig): List<Coord> {
        val prevHead = head()
        val newHead = moveHead(prevHead, direction)
        val alignNewHead = gameConfig.alignPoint(newHead)
        val shiftBeforeHead = shiftBeforeHead(newHead, prevHead)

        return if (points.size == 1 && !foods.contains(alignNewHead))
            listOf(alignNewHead)
        else
            listOf(alignNewHead, shiftBeforeHead)
    }

    private fun dropRedundantPoints(foods: List<Coord>, gameConfig: GameConfig): List<Coord> {
        val alignNewHead = gameConfig.alignPoint(moveHead(head(), direction))
        return if (foods.contains(alignNewHead)) points.drop(1) else points.dropLast(1).drop(1)
    }

    private fun moveHead(head: Coord, direction: Direction): Coord {
        return when (direction) {
            Direction.UP -> head.copy(y = head.y - 1)
            Direction.DOWN -> head.copy(y = head.y + 1)
            Direction.LEFT -> head.copy(x = head.x - 1)
            Direction.RIGHT -> head.copy(x = head.x + 1)
        }
    }

    private fun shiftBeforeHead(newHead: Coord, prevHead: Coord): Coord {
        return Coord(prevHead.x - newHead.x, prevHead.y - newHead.y)
    }

    fun head(): Coord {
        return points.first()
    }

    fun isLegalDirection(newDirection: Direction): Boolean {
        return when (direction) {
            Direction.UP -> newDirection != Direction.DOWN
            Direction.DOWN -> newDirection != Direction.UP
            Direction.RIGHT -> newDirection != Direction.LEFT
            Direction.LEFT -> newDirection != Direction.RIGHT
        }
    }

    fun alignPoints(gameConfig: GameConfig): List<Coord> {
        return points.foldIndexed(listOf()) { index, alignPoints, point ->
            if (index == 0) {
                return@foldIndexed alignPoints + listOf(point)
            } else {
                val prevPoint = alignPoints.last()
                val xMoved = prevPoint.x + point.x
                val yMoved = prevPoint.y + point.y
                return@foldIndexed alignPoints + listOf(gameConfig.alignPoint(prevPoint.copy(x = xMoved, y = yMoved)))
            }
        }
    }

    private fun alignPointsWithoutHead(gameConfig: GameConfig): List<Coord> {
        return alignPoints(gameConfig).foldIndexed(listOf()) { index, alignPoints, point ->
            if (index == 0)
                alignPoints
            else
                alignPoints + listOf(point)
        }
    }

    fun crashed(snakes: List<Snake>, gameConfig: GameConfig): Boolean {
        return snakes.fold(false) { isCrashed, enemySnake ->
            if (crashed(enemySnake, gameConfig))
                true
            else isCrashed
        }
    }

    /**
     * this.snake crashed about playerSnake
     */
    fun crashed(enemySnake: Snake, gameConfig: GameConfig): Boolean {
        return if (enemySnake == this) {
            alignPointsWithoutHead(gameConfig).contains(head())
        } else {
            enemySnake.alignPoints(gameConfig).contains(head())
        }
    }
}

enum class Direction(val n: Int) {
    UP(1),
    DOWN(2),
    LEFT(3),
    RIGHT(4);

    companion object {
        private val VALUES = values()
        fun getByValue(value: Int) = VALUES.first { it.n == value }
    }
}

data class Coord(val x: Int, val y: Int)

enum class SnakeState(n: Int) {
    ALIVE(0),
    ZOMBIE(1)
}