package ru.fithub.snakes.core.infrastructure

import org.mapstruct.factory.Mappers
import ru.fithub.snakes.core.model.*
import ru.fithub.snakes.core.service.gamemessage.GameMessageService
import ru.fithub.snakes.dto.SnakesProto
import ru.fithub.snakes.net.receiver.MulticastController
import ru.fithub.snakes.net.sender.Mapper

class GameMessageController(private val messageService: GameMessageService) : MulticastController {
    private val mapper: Mapper = Mappers.getMapper(Mapper::class.java)
    override fun multicastGameMessage(gameMessage: SnakesProto.GameMessage, hostAddress: String, port: Int) {
        @Suppress("UNCHECKED_CAST")
        if (gameMessage.hasAnnouncement()) {
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<AnnouncementMsg>, AnnouncementMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasAck()) {
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<AckMsg>, AckMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasDiscover()) {
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<DiscoverMsg>, DiscoverMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasError()) {
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<ErrorMsg>, ErrorMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasJoin()) {
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<JoinMsg>, JoinMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasPing()) {
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<PingMsg>, PingMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasRoleChange()){
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<RoleChangeMsg>, RoleChangeMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasState()){
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<StateMsg>, StateMsg::class.java,  hostAddress, port)
        }
        if(gameMessage.hasSteer()) {
            @Suppress("UNCHECKED_CAST")
            messageService.handleMessage(mapper.map(gameMessage) as GameMessage<SteerMsg>, SteerMsg::class.java,  hostAddress, port)
        }
    }
}