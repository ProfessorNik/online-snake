package ru.fithub.snakes.core.model

import kotlin.math.abs

data class GameConfig(
    val width: Int,
    val height: Int,
    val foodStatic: Int,
    val stateDelayMs: Int
) {
    fun alignX(x: Int): Int {
        return if (x >= width || x < 0) abs(width - abs(x)) else x
    }

    fun alignY(y: Int): Int {
        return if (y >= height || y < 0) abs(height - abs(y)) else y
    }

    fun alignPoint(point: Coord): Coord {
        return point.copy(x = alignX(point.x), y = alignY(point.y))
    }
}