package org.example.utils.lesson_4

fun main() {
    val sunny: Boolean = true
    val awningOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "winter"

    val conditions = sunny && awningOpen && (humidity == 20) && (currentSeason != "winter")
    println("Are the conditions now favorable for the growth of legumes? $conditions")
}