package org.example.utils.lesson_4

fun main() {
    val day = 5

    val handsDay = day % 2 != 0
    val legsBackDay = !handsDay

    println(
        """
        Hand exercises :    $handsDay
        Leg exercises:    $legsBackDay
        Back exercises:  $legsBackDay
        Abdominal exercises: $handsDay
    """.trimIndent()
    )
}