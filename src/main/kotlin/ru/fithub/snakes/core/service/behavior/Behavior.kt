package ru.fithub.snakes.core.service.behavior

import ru.fithub.snakes.core.infrastructure.GamePlayPresenter
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.service.MessageFormer


interface Behavior {
    var gamePlayPresenter: GamePlayPresenter
    val gameConfig: GameConfig
    val playerId: Int
    val messageFormer: MessageFormer
    fun changeDirection(direction: Direction)
    fun changeGameState(msg: GameMessage<StateMsg>, ipAddress: String, port: Int)
    fun addNewPlayer(msg: GameMessage<JoinMsg>, ipAddress: String, port: Int)
    fun onPing(msg: GameMessage<PingMsg>, ipAddress: String, port: Int)
    fun startGame()
    fun endGame()
    fun changeDirectionByIpAndPort(msg: GameMessage<SteerMsg>, hostAddress: String, port: Int)
    fun updateLastTimeMessage(ipAddress: String, port: Int)
    fun onRoleChange(gameMessage: GameMessage<RoleChangeMsg>, hostAddress: String, port: Int)
}
