package br.com.design_patterns_with_rpg.creational

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

sealed class Houses

object Stark : Houses()

class Targaryen(val someProperty: String) : Houses()

data class Lannister(val someProperty: String) : Houses()

class Peculiarity(
    val name: String
)

object PeculiarityFactory {

    fun peculiarityForHouses(house: Houses): Peculiarity =
        when (house) {
            is Stark -> Peculiarity("Killer white walkers")
            is Targaryen -> Peculiarity("First of her name, Born of the storm, The unburnt, Mother of the Dragons, Chainbreaker, Mother of the slaves, Khaleesi of the Dothraki, Queen of Mereen")
            is Lannister -> Peculiarity("Always keep their promises")
        }
}

class FactoryMethodTest {

    @Test
    fun factoryMethod() {
        val targaryenPeculiarity = PeculiarityFactory.peculiarityForHouses(Targaryen("")).name
        println("Targaryen : $targaryenPeculiarity")

        val starkPeculiarity = PeculiarityFactory.peculiarityForHouses(Stark).name
        println("Stark : $starkPeculiarity")

        assertThat(targaryenPeculiarity).isEqualTo("First of her name, Born of the storm, The unburnt, Mother of the Dragons, Chainbreaker, Mother of the slaves, Khaleesi of the Dothraki, Queen of Mereen")
        assertThat(starkPeculiarity).isEqualTo("Killer white walkers")
    }
}