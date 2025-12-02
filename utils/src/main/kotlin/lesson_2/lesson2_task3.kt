package org.example.utils.lesson_2

fun main() {
    val departureHoure = 9
    val departureMinute = 39
    val travelMinute = 457

    val startMinute = departureHoure*60+departureMinute
    val endMinute = startMinute+travelMinute
    val arrivalHoure = (endMinute/60)%24
    val arrivalMinote = endMinute%60
   println("%02d:%02d".format(arrivalHoure, arrivalMinote))
}