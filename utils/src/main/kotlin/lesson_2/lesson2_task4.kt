package org.example.utils.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffProcent: Double = 20.0
    val oneHundredProcent = 100

    val bonusCrystalOre = (crystalOre * buffProcent) / oneHundredProcent.toInt()
    val bonusIronOre = (ironOre * buffProcent) / oneHundredProcent.toInt()

    println("Crystalline ore: $bonusCrystalOre")
    println("Iron ore: $bonusIronOre")
}