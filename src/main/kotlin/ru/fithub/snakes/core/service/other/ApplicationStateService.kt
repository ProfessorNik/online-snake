package ru.fithub.snakes.core.service.other

import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.NodeRole

interface ApplicationStateService {
    var applicationStateType: ApplicationStateType?
    var nodeRole: NodeRole?
    fun changeState(newState: ApplicationStateType?, newBehavior: NodeRole?)
}