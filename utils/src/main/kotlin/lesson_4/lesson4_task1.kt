package org.example.utils.lesson_4

fun main() {
    val allTables = 13
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Today free tables: ${reservedToday < allTables}\nFree tables for tomorrow: ${reservedTomorrow < allTables}")
}