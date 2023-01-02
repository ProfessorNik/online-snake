package me.nikol.snake.game.config

import me.nikol.snake.event.config.EventConfig
import me.nikol.snake.game.Main
import me.nikol.snake.game.infrastructure.AnnouncementPresenter
import me.nikol.snake.game.infrastructure.GameMessageController
import me.nikol.snake.game.service.gamemessage.GameMessageService
import me.nikol.snake.game.service.gamemessage.impl.*
import me.nikol.snake.game.service.other.AnnouncementService
import me.nikol.snake.game.service.other.JoinService
import me.nikol.snake.game.service.other.impl.AnnouncementServiceImpl
import me.nikol.snake.game.service.other.impl.JoinServiceImpl

class ServiceConfig(eventConfig: EventConfig, presenter: AnnouncementPresenter, main: Main) {
    var announcementService: AnnouncementService = AnnouncementServiceImpl(presenter)
    val joinService: JoinService = JoinServiceImpl(eventConfig.sendJoinMsgEventPublisher, main, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher)

    private val allMessageHandler: AllMessageHandler = AllMessageHandler()
    private val joinMessageHandler: JoinMessageHandler = JoinMessageHandler()
    private val pingMessageHandler: PingMessageHandler = PingMessageHandler()
    private val stateMessageHandler: StateMessageHandler = StateMessageHandler()
    private val steerMessageHandler: SteerMessageHandler = SteerMessageHandler()
    private val announcementMessageHandler: AnnouncementMessageHandler = AnnouncementMessageHandler(announcementService)
    private val ackMessageHandler: AckMessageHandler = AckMessageHandler(eventConfig.receiveAckMsgEventPublisher)
    private val errorMessageHandler: ErrorMessageHandler = ErrorMessageHandler(eventConfig.receiveErrorMsgEventPublisher)
    private val roleChangeMessageHandler: RoleChangeMessageHandler = RoleChangeMessageHandler()
    val messageService: GameMessageService = GameMessageServiceImpl(
        listOf(
            allMessageHandler,
            joinMessageHandler,
            pingMessageHandler,
            stateMessageHandler,
            steerMessageHandler,
            announcementMessageHandler,
            ackMessageHandler,
            errorMessageHandler,
            roleChangeMessageHandler
        )
    )
    val gameMessageController: GameMessageController = GameMessageController(messageService)
}