package br.com.design_patterns_with_rpg.creational.struct

import org.junit.Test

class ComplexSystemStore(private val userPreferences: UserPreferences) {

    private val cache: HashMap<String, String>

    init {
        println("Reading data from file: $userPreferences")
        cache = HashMap()
    }

    fun store(key: String, payload: String) {
        cache[key] = payload
    }

    fun read(key: String): String = cache[key] ?: ""

    fun commit() = println("Storing cached data: $cache to file: $userPreferences")
}

data class User(val login: String)

data class UserPreferences(
    val xp: Int,
    val level: Int,
    val type: String,
    val race: String,)


//Facade:
class UserRepository {

    private val systemPreferences = ComplexSystemStore(UserPreferences(1500, 3, "Paladin", "Dwarf"))

    fun save(user: User) {
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}

class FacadeTest {

    @Test
    fun Facade() {
        val userRepository = UserRepository()
        val user = User("ksdrof")
        userRepository.save(user)
        val resultUser = userRepository.findFirst()
        println("Found stored user: $resultUser")
    }
}