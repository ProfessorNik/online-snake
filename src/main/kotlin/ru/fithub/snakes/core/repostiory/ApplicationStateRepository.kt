package ru.fithub.snakes.core.repostiory

import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.service.behavior.Behavior

class ApplicationStateRepository {
    var applicationStateType: ApplicationStateType? = null
    var behaviorType: NodeRole? = null
}