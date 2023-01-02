package me.nikol.snake.game.service.behavior.impl

import me.nikol.snake.game.infrastructure.GamePlayPresenter
import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.MessageFormer
import me.nikol.snake.game.service.behavior.Behavior

class NothingBehavior: Behavior {
    override lateinit var gamePlayPresenter: GamePlayPresenter
    override lateinit var gameConfig: GameConfig
    override var playerId: Int = 0
    override lateinit var messageFormer: MessageFormer

    override fun changeDirection(direction: Direction) {
    }

    override fun changeGameState(msg: GameMessage<StateMsg>, ipAddress: String, port: Int) {
    }

    override fun addNewPlayer(msg: GameMessage<JoinMsg>, ipAddress: String, port: Int) {
    }

    override fun onPing(msg: GameMessage<PingMsg>, ipAddress: String, port: Int) {
    }

    override fun startGame() {
    }

    override fun endGame() {
    }

    override fun changeDirectionByIpAndPort(msg: GameMessage<SteerMsg>, hostAddress: String, port: Int) {
    }

    override fun updateLastTimeMessage(ipAddress: String, port: Int) {
    }

    override fun onRoleChange(gameMessage: GameMessage<RoleChangeMsg>, hostAddress: String, port: Int) {

    }
}