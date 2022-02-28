package br.com.design_patterns_with_rpg.creational.struct

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.Math.floor

interface Dice {
    var rollValue: Double
}

class Dice20(override var rollValue: Double) : Dice

class Dice100(private var rollValueD20: Dice20) : Dice {

    override var rollValue: Double
        get() = convertD20ToD100(rollValueD20.rollValue)
        set(rollInF) {
            rollValueD20.rollValue = convertD100ToD20(rollInF)
        }

    private fun convertD20ToD100(value: Double) = floor(value * 5)

    private fun convertD100ToD20(value: Double) = floor(value / 5)

}

class AdapterTest {

    @Test
    fun Adapter() {
        val dice20 = Dice20(20.0)
        val dice100 = Dice100(dice20)

        dice20.rollValue = 10.0
        println("${dice20.rollValue} D20 -> ${dice100.rollValue} D100")

        assertThat(dice100.rollValue).isEqualTo(50.0)

        dice100.rollValue = 100.0
        println("${dice100.rollValue} D100 -> ${dice20.rollValue} D20")

        assertThat(dice20.rollValue).isEqualTo(20.0)
    }
}