package ru.fithub.snakes.core.service.other.impl

import ru.fithub.snakes.core.config.GameFactory
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.scheduler.AnnouncementScheduler
import ru.fithub.snakes.core.scheduler.ClientScheduler
import ru.fithub.snakes.core.scheduler.ServerGameStepScheduler
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.other.GameService
import ru.fithub.snakes.event.SendEvent
import ru.fithub.snakes.event.SendRoleChangeMsgEvent
import ru.fithub.snakes.event.basic.EventPublisher

class GameServiceImpl(
    private val generalRepository: GeneralRepository,
    private val clientRepository: ClientRepository,
    private val serverRepository: ServerRepository,
    private val messageFormer: MessageFormer,
    private val roleChangeMsgEventPublisher: EventPublisher<SendEvent<RoleChangeMsg>>
) : GameService {
    companion object {
        val gameFactory = GameFactory()
        val PLAYER_NAME = gameFactory.properties().getProperty("player.name")
        val GAME_NAME = gameFactory.properties().getProperty("game.name")
        const val PLAYER_ID = 1
    }

    lateinit var clientScheduler: ClientScheduler
    lateinit var serverGameStepScheduler: ServerGameStepScheduler
    lateinit var announcementGameStepScheduler: AnnouncementScheduler

    override fun prepareServerGame() {
        generalRepository.gameConfig = gameFactory.gameConfig()
        generalRepository.gameState = gameFactory.gameState(generalRepository.gameConfig!!)
        generalRepository.playerName = PLAYER_NAME
        generalRepository.playerId = PLAYER_ID
        generalRepository.gameName = GAME_NAME
        generalRepository.msgSeq = 10
    }

    override fun startServerSchedulers() {
        serverGameStepScheduler.start()
        announcementGameStepScheduler.start()
    }

    override fun stopServerSchedulers() {
        if (!announcementGameStepScheduler.isStopped())
            announcementGameStepScheduler.stop()
        if (!serverGameStepScheduler.isStopped())
            serverGameStepScheduler.stop()
    }

    override fun startClientSchedulers() {
        clientScheduler.start()
    }

    override fun stopClientSchedulers() {
        if (!clientScheduler.isStopped()) {
            clientScheduler.stop()
        }
    }

    override fun prepareClientGame(gameConfig: GameConfig, gameName: String, masterIpAddress: String, masterPort: Int) {
        generalRepository.gameConfig = gameConfig
        generalRepository.gameName = gameName
        generalRepository.playerName = PLAYER_NAME
        generalRepository.msgSeq = 10
        clientRepository.master = Connection().apply {
            ipAddress = masterIpAddress
            port = masterPort
            lastMessageTime = System.currentTimeMillis()
        }
    }

    override fun deputyToMaster() {
        val prevMaster = clientRepository.master!!
        with(generalRepository) {
            gameState =
                gameState?.copy(players = GamePlayers(gameState!!.players.players.fold(listOf()) { players, player ->
                    if (player.id == prevMaster.playerId) {
                        players + player.copy(role = NodeRole.VIEWER, ipAddress = prevMaster.ipAddress!!, port = prevMaster.port!!)
                    } else if (player.role == NodeRole.DEPUTY) {
                        players + player.copy(role = NodeRole.MASTER)
                    } else {
                        players + player
                    }
                }))

            serverRepository.connections.addAll(gameState!!.players.players.fold(listOf<Connection>()) { players, player ->
                if (player.id == generalRepository.playerId) {
                    players
                } else if (player.id == prevMaster.playerId){
                    players + Connection().apply {
                        playerId = player.id
                        ipAddress = prevMaster.ipAddress!!
                        port = prevMaster.port!!
                        lastMessageTime = System.currentTimeMillis()
                    }
                } else {
                    players + Connection().apply {
                        playerId = player.id
                        ipAddress = player.ipAddress
                        port = player.port
                        lastMessageTime = System.currentTimeMillis()
                    }
                }
            }.toMutableList())
        }
        clearClientRepository()
    }

    override fun setDeputyAsNewMaster() {
        val deputy = generalRepository.gameState!!.players.players.find { it.role == NodeRole.DEPUTY }
        clientRepository.master = Connection().apply {
            playerId = deputy!!.id
            ipAddress = deputy.ipAddress
            port = deputy.port
            lastMessageTime = System.currentTimeMillis()
        }
        roleChangeMsgEventPublisher.publishAsyncEvent(SendRoleChangeMsgEvent(messageFormer.roleChangeMsg(deputy!!.id, NodeRole.VIEWER, NodeRole.MASTER), deputy.ipAddress!!, deputy.port!!))
    }

    override fun clientToViewer() {
        val master = clientRepository.master!!
        roleChangeMsgEventPublisher.publishAsyncEvent(SendRoleChangeMsgEvent(messageFormer.roleChangeMsg(master.playerId!!, NodeRole.VIEWER, null), master.ipAddress!!, master.port!!))
    }

    override fun wasServer(): Boolean {
        return clientRepository.master == null
    }

    override fun serverSchedulersIsWorking(): Boolean =
        !serverGameStepScheduler.isStopped() || !announcementGameStepScheduler.isStopped()

    override fun hasDeputy(): Boolean {
        return generalRepository.gameState!!.containsDeputy()
    }


    override fun clearAll() {
        clearGeneralRepository()
        clearClientRepository()
        clearMasterRepository()
    }

    private fun clearGeneralRepository() {
        generalRepository.gameState = null
        generalRepository.gameState = null
        generalRepository.playerId = null
        generalRepository.playerName = null
    }

    private fun clearClientRepository() {
        clientRepository.master = null
    }

    private fun clearMasterRepository() {
        serverRepository.connections.clear()
        serverRepository.joinPlayerDelayedMessages.clear()
    }
}