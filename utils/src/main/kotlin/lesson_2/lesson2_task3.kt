package org.example.utils.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinute = 457

    val startMinute = departureHour * MINUTES_IN_HOUR + departureMinute
    val endMinute = startMinute + travelMinute
    val arrivalHour = (endMinute / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinutete = endMinute % MINUTES_IN_HOUR
    println("%02d:%02d".format(arrivalHour, arrivalMinutete))
}