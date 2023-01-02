//package ru.fithub.snakes.core.graphic
//
//import com.badlogic.gdx.graphics.Texture
//import com.badlogic.gdx.graphics.g2d.Batch
//import com.badlogic.gdx.graphics.g2d.TextureRegion
//import com.badlogic.gdx.scenes.scene2d.Actor
//import ktx.assets.toInternalFile
//
//class Field(
//    val cellX: Int,
//    val sellY: Int
//) : Actor() {
//    private var fieldState: FieldState = FieldState.PREVIEW
//    private val cellWidth: Int = 30
//    private val cellHeight: Int = 30
//    private val greenCell = TextureRegion(
//        Texture("green.png".toInternalFile(), true).apply {
//            setFilter(
//                Texture.TextureFilter.Linear,
//                Texture.TextureFilter.Linear
//            )
//        },
//        cellWidth,
//        cellHeight
//    )
//    private val lightGreenCell = TextureRegion(
//        Texture("light_green.png".toInternalFile(), true).apply {
//            setFilter(
//                Texture.TextureFilter.Linear,
//                Texture.TextureFilter.Linear
//            )
//        },
//        cellWidth,
//        cellHeight
//    )
//    private val enemyCell = TextureRegion(
//        Texture("red.png".toInternalFile(), true).apply {
//            setFilter(
//                Texture.TextureFilter.Linear,
//                Texture.TextureFilter.Linear
//            )
//        },
//        cellWidth,
//        cellHeight
//    )
//    private val friendlyCell = TextureRegion(
//        Texture("yellow.png".toInternalFile(), true).apply {
//            setFilter(
//                Texture.TextureFilter.Linear,
//                Texture.TextureFilter.Linear
//            )
//        },
//        cellWidth,
//        cellHeight
//    )
//    private val foodCell = TextureRegion(
//        Texture("violet.png".toInternalFile(), true).apply {
//            setFilter(
//                Texture.TextureFilter.Linear,
//                Texture.TextureFilter.Linear
//            )
//        },
//        cellWidth,
//        cellHeight
//    )
//
//    private val preview = TextureRegion(
//        Texture("snake_logo.png".toInternalFile(), true).apply {
//            setFilter(
//                Texture.TextureFilter.Linear,
//                Texture.TextureFilter.Linear
//            )
//        },
//        300,
//        300
//    )
//
//    var mapCells: Map<Pair<Int, Int>, FiledItemType>? = null
//    set(value) {
//        fieldState = FieldState.GAME
//        field = value
//    }
//
//    override fun draw(batch: Batch?, parentAlpha: Float) {
//        when(fieldState) {
//            FieldState.PREVIEW -> drawPreview(batch, parentAlpha)
//            FieldState.GAME -> drawField(batch, parentAlpha)
//        }
//    }
//
//    private fun drawPreview(batch: Batch?, parentAlpha: Float) {
//        batch?.draw(preview, x, y)
//    }
//
//    private fun drawField(batch: Batch?, parentAlpha: Float){
//        for (i in 0 until 10 step 2) {
//            for (j in 0 until 10 step 2)
//                batch?.draw(greenCell, x + j * cellWidth, y + i * cellHeight)
//            for (j in 1 until 10 step 2)
//                batch?.draw(lightGreenCell, x + j * cellWidth, y + i * cellHeight)
//        }
//
//        for (i in 1 until 10 step 2) {
//            for (j in 1 until 10 step 2)
//                batch?.draw(greenCell, x + j * cellWidth, y + i * cellHeight)
//            for (j in 0 until 10 step 2)
//                batch?.draw(lightGreenCell, x + j * cellWidth, y + i * cellHeight)
//        }
//
//        mapCells?.let { drawFromMap(it, batch) }
//    }
//
//    private fun drawFromMap(map: Map<Pair<Int, Int>, FiledItemType>, batch: Batch?) {
//        map.forEach {
//            batch?.draw(mapTypeOnTextureRegion(it.value), x + it.key.first * cellWidth, y + it.key.second * cellHeight)
//        }
//    }
//
//    private fun mapTypeOnTextureRegion(type: FiledItemType): TextureRegion {
//        return when (type) {
//            FiledItemType.ENEMY_SNAKE -> enemyCell
//            FiledItemType.FOOD -> foodCell
//            FiledItemType.FRIENDLY_SNAKE -> friendlyCell
//            FiledItemType.EMPTY -> greenCell
//        }
//    }
//
//    fun showPreview() {
//        fieldState = FieldState.PREVIEW
//    }
//}