package br.com.design_patterns_with_rpg.creational

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

object Boss {
    init {
        println("The killing has begun and you can't be left behind: $this")
    }

    fun print(): Boss =
        apply { println("Diablo III : $this") }
}

class SingletonTest {

    @Test
    fun singleton() {
        println("Start")
        val printerFirst = Boss.print()
        val printerSecond = Boss.print()

        assertThat(printerFirst).isSameAs(Boss)
        assertThat(printerSecond).isSameAs(Boss)
    }
}
