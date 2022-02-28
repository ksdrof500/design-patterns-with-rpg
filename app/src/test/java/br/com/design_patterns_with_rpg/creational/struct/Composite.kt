package br.com.design_patterns_with_rpg.creational.struct

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

open class Equipment(
    open val price: Int,
    val name: String
)

open class Composite(name: String) : Equipment(0, name) {

    private val equipments = ArrayList<Equipment>()

    override val price: Int
        get() = equipments.map { it.price }.sum()


    fun add(equipment: Equipment) =
        apply { equipments.add(equipment) }
}

class DungeonDrops : Composite("Loot")
class Sword : Equipment(20000, "Vorpal Longsword")
class Armor : Equipment(15000, "Dragon Scale Mail")
class Shield : Equipment(5000, "Absorbing Shield")


class CompositeTest {

    @Test
    fun Composite() {
        val dd = DungeonDrops()
            .add(Sword())
            .add(Armor())
            .add(Shield())

        println(dd.price)

        assertThat(dd.name).isEqualTo("Loot")
        assertThat(dd.price).isEqualTo(40000)
    }
}