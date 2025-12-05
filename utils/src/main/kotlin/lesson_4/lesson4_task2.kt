package org.example.utils.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100

fun main() {
    val maxVolume = 100

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println(
        "Load weight $weight1 kg and volume $volume1 L matches the category 'Average': " +
                "${(weight1 > MIN_WEIGHT && weight1 <= MAX_WEIGHT) && (volume1 < maxVolume)}"
    )
    println(
        "Load weight $weight2 kg and volume $volume2 L matches the category 'Average': " +
                "${(weight2 > MIN_WEIGHT && weight2 <= MAX_WEIGHT) && (volume2 < maxVolume)}"
    )
}