package org.example.utils.lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println(
        "Load weight $weight1 kg and volume $volume1 L matches the category 'Average': " +
                "${(weight1 > minWeight && weight1 <= maxWeight) && (volume1 < maxVolume)}"
    )
    println(
        "Load weight $weight2 kg and volume $volume2 L matches the category 'Average': " +
                "${(weight2 > minWeight && weight2 <= maxWeight) && (volume2 < maxVolume)}"
    )
}