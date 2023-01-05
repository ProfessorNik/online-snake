package ru.fithub.snakes.core.service.other

import ru.fithub.snakes.core.model.Direction

interface ChangeDirectionService {
    fun changeDirection(direction: Direction)
}