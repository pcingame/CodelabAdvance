package com.pc.codelabadvance


val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")

val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

//val solarSystem = rockPlanets + gasPlanets

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
//    for (i in solarSystem) {
//        println(i)
//    }

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

//    println(solarSystem["Mars"])
//    cookies.forEach {
//        println("Menu item: ${it.name}")
//    }

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    val expensiveMenu = cookies.filter {
        it.price > 1.39
    }.map {
        "${it.name} - $${it.price}"
    }

    // println("Full menu:")
    fullMenu.forEach {
        // println(it)
    }
    //println("Expensive menu:")
    expensiveMenu.forEach {
        // println(it)
    }

    val groupMenu = cookies.groupBy {
        it.softBaked
    }

    val softBakedMenu = groupMenu[true] ?: listOf()
    val crunchyMenu = groupMenu[false] ?: listOf()

//    println("Soft cookies:")
//    softBakedMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
//    println("Crunchy cookies:")
//    crunchyMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
}

