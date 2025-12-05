package org.example.utils.lesson_4

const val REQUIRED_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "winter"

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "winter"

    val conditions = isSunny && isAwningOpen && (humidity == REQUIRED_HUMIDITY) && (currentSeason != UNFAVORABLE_SEASON)
    println("Are the conditions now favorable for the growth of legumes? $conditions")
}