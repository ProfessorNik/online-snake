package me.nikol.snake.game.infrastructure

import me.nikol.snake.dto.SnakesProto
import me.nikol.snake.game.model.*
import me.nikol.snake.game.service.gamemessage.GameMessageService
import me.nikol.snake.net.receiver.MulticastController
import me.nikol.snake.net.sender.Mapper
import org.mapstruct.factory.Mappers

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