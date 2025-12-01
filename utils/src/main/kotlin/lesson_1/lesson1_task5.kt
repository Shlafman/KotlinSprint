package org.example.utils.lesson_1

fun main()   {
    val totalSeconds: Short = 6480
    val hours: Int = totalSeconds / 3600
    val minutes: Int  = (totalSeconds % 3600) / 60
    val seconds: Int = totalSeconds % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}