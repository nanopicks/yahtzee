package org.superluigi.yahtzee.view.dice

import javafx.scene.control.Button
import org.superluigi.yahtzee.model.Die
import org.superluigi.yahtzee.view.dice.SetBackground

object DiceToButtons {

    fun apply(dice: List<Die>): List<Button> {

        val newButtons = Array(5, { Button() })

        val buttons =

            dice.mapIndexed { index, die ->

                val button = newButtons[index]

                SetBackground.apply(die, button)

                button.maxWidth = Double.MAX_VALUE
                button.maxHeight = Double.MAX_VALUE

                button

            }

        return buttons

    }

}