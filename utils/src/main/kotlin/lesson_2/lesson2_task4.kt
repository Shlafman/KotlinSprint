package org.example.utils.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffProcent = 20
    val oneHundredProcent = 100

    val bonusCrystalOre = (crystalOre * buffProcent) / oneHundredProcent
    val bonusIronOre = (ironOre * buffProcent) / oneHundredProcent

    println("Crystalline ore: $bonusCrystalOre")
    println("Iron ore: $bonusIronOre")
}