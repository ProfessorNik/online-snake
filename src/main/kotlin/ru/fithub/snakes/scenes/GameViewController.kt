package ru.fithub.snakes.scenes

import javafx.application.Platform
import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.input.MouseEvent
import javafx.scene.layout.ColumnConstraints
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints
import ru.fithub.snakes.core.graphic.FiledItemType
import ru.fithub.snakes.core.model.ApplicationStateType
import ru.fithub.snakes.core.model.GameConfig
import ru.fithub.snakes.core.model.GamePlayer
import ru.fithub.snakes.core.model.NodeRole
import ru.fithub.snakes.core.service.other.ApplicationStateService
import ru.fithub.snakes.scenes.viewmodel.ScoresViewModel


class GameViewController(val applicationStateService: ApplicationStateService) {
    companion object {
        const val PEACEFUL_SNAKE_COLOR = "-fx-background-color: blue;"
        const val ENEMY_SNAKE_COLOR = "-fx-background-color: red;"
        const val GRASS_1_COLOR = "-fx-background-color: green;"
        const val GRASS_2_COLOR = "-fx-background-color: yellow;"
        const val FOOD_COLOR = "-fx-background-color: violet;"
    }

    @FXML
    lateinit var fieldGrid: GridPane


    @FXML
    lateinit var colName: TableColumn<ScoresViewModel, String>

    @FXML
    lateinit var colRole: TableColumn<ScoresViewModel, String>

    @FXML
    lateinit var colScores: TableColumn<ScoresViewModel, String>

    @FXML
    lateinit var scoresTable: TableView<ScoresViewModel>

    lateinit var cells: List<List<Label>>
    var oldScores: Map<GamePlayer, Boolean>? = null
    var oldConfig: GameConfig? = null

    @FXML
    fun initialize() {
        colScores.cellValueFactory = PropertyValueFactory("scores")
        colName.cellValueFactory = PropertyValueFactory("name")
        colRole.cellValueFactory = PropertyValueFactory("role")
    }

    @FXML
    fun onExit(event: MouseEvent?) {
        applicationStateService.changeState(ApplicationStateType.MAIN_MENU, null)

    }

    @FXML
    fun onView(event: MouseEvent?) {
        applicationStateService.changeState(ApplicationStateType.GAME, NodeRole.VIEWER)
    }


    fun update(
        newConfig: GameConfig,
        map: MutableMap<Pair<Int, Int>, FiledItemType>,
        newScores: Map<GamePlayer, Boolean>
    ) {
        Platform.runLater {
            if (oldScores == null || oldScores.hashCode() != newScores.hashCode()) {
                println("SCORES: $newScores")
                scoresTable.items.clear()
                val scores = FXCollections.observableArrayList(newScores.map {
                    ScoresViewModel(it.key.name, it.key.score.toString(), it.key.role.name)
                })
                scoresTable.items = scores

                oldScores = newScores
            }

            if (oldConfig == null || oldConfig.hashCode() != newConfig.hashCode()) {
                fieldGrid.rowConstraints.clear()
                fieldGrid.columnConstraints.clear()

                val h = (300 / newConfig.height).toDouble()
                val w = (300 / newConfig.width).toDouble()

                cells = List(newConfig.width) { x ->
                    List(newConfig.height) { y ->
                        val newCell = Label()
                        newCell.maxWidth = Double.MAX_VALUE
                        newCell.maxHeight = Double.MAX_VALUE
                        fieldGrid.add(newCell, x, y)
                        newCell
                    }
                }

                val rc = RowConstraints()
                rc.percentHeight = (300 / newConfig.height).toDouble()
                for (x in 0 until newConfig.height) {
                    fieldGrid.rowConstraints.add(rc);
                }

                val cc = ColumnConstraints()
                cc.percentWidth = (300 / newConfig.width).toDouble()
                for (i in 0 until newConfig.width) {
                    fieldGrid.columnConstraints.add(cc)
                }
                fieldGrid.isGridLinesVisible = true
                oldConfig = newConfig
            }

            for (x in 0 until newConfig.width) {
                for (y in 0 until newConfig.height) {
                    cells[x][y].style = when (map[x to y]) {
                        FiledItemType.FRIENDLY_SNAKE -> PEACEFUL_SNAKE_COLOR
                        FiledItemType.ENEMY_SNAKE -> ENEMY_SNAKE_COLOR
                        FiledItemType.FOOD -> FOOD_COLOR
                        else -> fillGrass(x, y, newConfig)
                    }
                }
            }
        }
    }

    private fun fillGrass(x: Int, y: Int, gameConfig: GameConfig): String {
        return if (x in 0 until gameConfig.width step 2) {
            if (y in 0 until gameConfig.height step 2) {
                GRASS_1_COLOR
            } else {
                GRASS_2_COLOR
            }
        } else {
            if (y in 0 until gameConfig.height step 2) {
                GRASS_2_COLOR
            } else {
                GRASS_1_COLOR
            }
        }
    }
}