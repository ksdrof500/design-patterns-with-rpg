package br.com.design_patterns_with_rpg.creational.creating

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


interface RaceSpeak

class Elf : RaceSpeak

class Dwarf : RaceSpeak

abstract class RaceFactory {

    abstract fun makePlant(): RaceSpeak

    companion object {
        inline fun <reified T : RaceSpeak> createFactory(): RaceFactory =
            when (T::class) {
                Elf::class -> ElfFactory()
                Dwarf::class -> DwarfFactory()
                else -> throw IllegalArgumentException()
            }
    }
}

class DwarfFactory : RaceFactory() {
    override fun makePlant(): RaceSpeak = Dwarf()
}

class ElfFactory : RaceFactory() {
    override fun makePlant(): RaceSpeak = Elf()
}


class AbstractFactoryTest {

    @Test
    fun `Abstract Factory`() {
        val raceFactory = RaceFactory.createFactory<Dwarf>()
        val raceSpeak = raceFactory.makePlant()
        println("This still counts as one: $raceSpeak")

        assertThat(raceSpeak).isInstanceOf(Dwarf::class.java)
    }
}
