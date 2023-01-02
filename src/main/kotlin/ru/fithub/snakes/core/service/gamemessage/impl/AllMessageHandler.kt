package ru.fithub.snakes.core.service.gamemessage.impl

import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.Connection
import ru.fithub.snakes.core.model.GameMessage
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.service.gamemessage.MessageHandler
import ru.fithub.snakes.core.service.other.ApplicationStateService

class AllMessageHandler(
    private val serverRepository: ServerRepository,
    private val clientRepository: ClientRepository,
    private val applicationStateService: ApplicationStateService
) : MessageHandler {
    override fun <M> handle(msg: GameMessage<M>, clazz: Class<M>, ipAddress: String, port: Int) {
        if (applicationStateService.applicationStateType == ApplicationStateType.GAME) {
            when (applicationStateService.nodeRole) {
                NodeRole.MASTER -> {
                    serverRepository.getConnectionByIpAndPort(ipAddress,port)?.let { connection ->
                        continueConnection(connection)
                    }
                }
                NodeRole.VIEWER, NodeRole.NORMAL, NodeRole.DEPUTY -> {
                    val master = clientRepository.master ?: throw NullPointerException("Master is missing in ClientRepository")
                    if (ipAddress == master.ipAddress && port == master.port) {
                        continueConnection(master)
                    }
                }
                else -> {
                    //do nothing
                }
            }
        }
    }

    private fun continueConnection(connection: Connection) {
        connection.lastMessageTime = System.currentTimeMillis()
        connection.pingTime = null
    }
}