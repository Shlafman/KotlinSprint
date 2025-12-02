package org.example.utils.lesson_1

const val SECONDHOUR: Short = 3600
const val MINUTEHOUR: Byte = 60

fun main() {
    val totalSeconds: Short = 6480

    val hours: Int = totalSeconds / SECONDHOUR
    val minutes: Int = (totalSeconds % SECONDHOUR) / MINUTEHOUR
    val seconds: Int = totalSeconds % MINUTEHOUR

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}