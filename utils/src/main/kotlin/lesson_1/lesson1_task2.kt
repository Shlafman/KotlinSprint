package org.example.utils.lesson_2

fun main() {
    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5
    val numberOfStudents = 4
    val averageStd = (grade1 + grade2 + grade3 + grade4).toFloat() / numberOfStudents
    println("%.2f".format(averageStd)
}