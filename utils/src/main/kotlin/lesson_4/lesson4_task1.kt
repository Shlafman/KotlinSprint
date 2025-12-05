package org.example.utils.lesson_4
const val TOTAL_TABLES = 13
fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Today free tables: ${reservedToday < TOTAL_TABLES}\nFree tables for tomorrow: ${reservedTomorrow < TOTAL_TABLES}")
}