package ru.fithub.snakes.core.config

import ru.fithub.snakes.SnakesApplication
import ru.fithub.snakes.core.infrastructure.AnnouncementPresenter
import ru.fithub.snakes.core.infrastructure.GameMessageController
import ru.fithub.snakes.core.infrastructure.GamePlayPresenter
import ru.fithub.snakes.core.repostiory.ApplicationStateRepository
import ru.fithub.snakes.core.repostiory.ClientRepository
import ru.fithub.snakes.core.repostiory.GeneralRepository
import ru.fithub.snakes.core.repostiory.ServerRepository
import ru.fithub.snakes.core.scheduler.AnnouncementScheduler
import ru.fithub.snakes.core.scheduler.ClientScheduler
import ru.fithub.snakes.core.scheduler.ServerGameStepScheduler
import ru.fithub.snakes.core.service.MessageFormer
import ru.fithub.snakes.core.service.gamemessage.GameMessageService
import ru.fithub.snakes.core.service.gamemessage.impl.*
import ru.fithub.snakes.core.service.other.AnnouncementService
import ru.fithub.snakes.core.service.other.JoinService
import ru.fithub.snakes.core.service.other.impl.*
import ru.fithub.snakes.event.config.EventConfig

class ServiceConfig(eventConfig: EventConfig, snakesApplication: SnakesApplication) {
    private val applicationStateRepository = ApplicationStateRepository()
    private val clientRepository = ClientRepository()
    val generalRepository = GeneralRepository()
    private val serverRepository = ServerRepository()
    private val messageFormer = MessageFormer(generalRepository)

    val announcementPresenter: AnnouncementPresenter = AnnouncementPresenter()
    val gamePlayPresenter: GamePlayPresenter = GamePlayPresenter(generalRepository)

    private val makeDeputyService = MakeDeputyServiceImpl(generalRepository, eventConfig.sendRoleChangeMsgEventPublisher, eventConfig.receiveAckMsgEventPublisher, eventConfig.receiveErrorMsgEventPublisher, eventConfig.stopSendMessagesToPlayerEventPublisher, messageFormer)

    private val gameService = GameServiceImpl(generalRepository, clientRepository, serverRepository, messageFormer, eventConfig.sendRoleChangeMsgEventPublisher)

    val applicationStateService = ApplicationStateServiceImpl(gameService, snakesApplication, applicationStateRepository)

    private val serverGameStepScheduler = ServerGameStepScheduler(applicationStateService, generalRepository, serverRepository, gamePlayPresenter, messageFormer, makeDeputyService, eventConfig.sendStateMsgEventPublisher, eventConfig.sendErrorMsgEventPublisher, eventConfig.sendAckMsgEventPublisher, eventConfig.sendPingMsgEventPublisher, eventConfig.stopSendMessagesToPlayerEventPublisher)
    private val announcementScheduler = AnnouncementScheduler(generalRepository, serverRepository, eventConfig.sendAnnouncementMsgEventPublisher, messageFormer)
    private val clientScheduler = ClientScheduler(generalRepository, clientRepository, eventConfig.sendPingMsgEventPublisher, eventConfig.stopSendMessagesToPlayerEventPublisher, applicationStateService, messageFormer)

    private val announcementService: AnnouncementService = AnnouncementServiceImpl(announcementPresenter)
    val changeDirectionService = ChangeDirectionServiceImpl(applicationStateService, clientRepository, eventConfig.sendSteerMsgEventPublisher, messageFormer, generalRepository)
    val joinService: JoinService = JoinServiceImpl(
        eventConfig.sendJoinMsgEventPublisher,
        applicationStateService,
        gameService,
        eventConfig.receiveAckMsgEventPublisher,
        eventConfig.receiveErrorMsgEventPublisher
    )
    private val messagesRegistrar = MessagesRegistrarImpl(generalRepository, clientRepository, serverRepository, applicationStateService, eventConfig.sendAckMsgEventPublisher, eventConfig.sendErrorMsgEventPublisher)
    private val filterOnAnsweredMessages = FilterOnAnsweredMessages(eventConfig.sendAckMsgEventPublisher, eventConfig.sendErrorMsgEventPublisher, serverRepository, clientRepository, applicationStateService)

    private val allMessageHandler: AllMessageHandler = AllMessageHandler(serverRepository, clientRepository, applicationStateService)
    private val joinMessageHandler: JoinMessageHandler = JoinMessageHandler(applicationStateService, generalRepository, serverRepository)
    private val pingMessageHandler: PingMessageHandler = PingMessageHandler(serverRepository, generalRepository, clientRepository, messageFormer, eventConfig.sendAckMsgEventPublisher, applicationStateService)
    private val stateMessageHandler: StateMessageHandler = StateMessageHandler(generalRepository, clientRepository, messageFormer, eventConfig.sendAckMsgEventPublisher, applicationStateService, gamePlayPresenter)
    private val steerMessageHandler: SteerMessageHandler = SteerMessageHandler(applicationStateService, generalRepository, serverRepository, eventConfig.sendAckMsgEventPublisher, messageFormer)
    private val announcementMessageHandler: AnnouncementMessageHandler = AnnouncementMessageHandler(announcementService)
    private val ackMessageHandler: AckMessageHandler = AckMessageHandler(eventConfig.receiveAckMsgEventPublisher)
    private val errorMessageHandler: ErrorMessageHandler = ErrorMessageHandler(eventConfig.receiveErrorMsgEventPublisher)
    private val roleChangeMessageHandler: RoleChangeMessageHandler = RoleChangeMessageHandler(serverRepository, generalRepository, clientRepository, messageFormer, applicationStateService, eventConfig.sendAckMsgEventPublisher)
    private val messageService: GameMessageService = GameMessageServiceImpl(
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
        ),
        filterOnAnsweredMessages
    )
    val gameMessageController: GameMessageController = GameMessageController(messageService)

    init {
        gameService.clientScheduler = clientScheduler
        gameService.serverGameStepScheduler = serverGameStepScheduler
        gameService.announcementGameStepScheduler = announcementScheduler
    }
}