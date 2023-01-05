package ru.fithub.snakes.core.service.other

import ru.fithub.snakes.core.model.GameConfig
import ru.fithub.snakes.core.model.NodeRole

interface GameService {
    fun clearAll()
    fun prepareServerGame()
    fun startServerSchedulers()
    fun stopServerSchedulers()
    fun startClientSchedulers()
    fun stopClientSchedulers()
    fun prepareClientGame(gameConfig: GameConfig, gameName: String, masterIpAddress: String, masterPort: Int)
    fun deputyToMaster()
    fun serverSchedulersIsWorking(): Boolean
    fun hasDeputy(): Boolean
    fun setDeputyAsNewMaster()
    fun clientToViewer()
    fun wasServer(): Boolean
}