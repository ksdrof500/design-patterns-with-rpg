package br.com.design_patterns_with_rpg.creational.struct

import org.junit.Test

interface StatsFile {
    fun read(name: String)
}

class CharStatsFile : StatsFile {
    override fun read(name: String) = println("Reading file: $name")
}

//Proxy:
class SecuredFile(private val normalFile: StatsFile) : StatsFile {
    var password: String = ""

    override fun read(name: String) {
        if (password == "secret") {
            println("Password is correct: $password")
            normalFile.read(name)
        } else {
            println("Incorrect password. Access denied!")
        }
    }
}

class ProtectionProxyTest {
    @Test
    fun `Protection Proxy`() {
        val securedFile = SecuredFile(CharStatsFile())

        with(securedFile) {
            read("statsPerson.md")
            password = "secret"
            read("statsPerson.md")
        }
    }
}