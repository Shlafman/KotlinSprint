package org.example.utils.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinute = 457
    val sixty = 60
    var twentyFour = 24

    val startMinute = departureHour * sixty + departureMinute
    val endMinute = startMinute + travelMinute
    val arrivalHour = (endMinute / sixty) % twentyFour
    val arrivalMinutete = endMinute % sixty
    println("%02d:%02d".format(arrivalHour, arrivalMinutete))
}