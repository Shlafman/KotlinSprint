package org.example.utils.lesson_2

fun main() {
    val oldWorkers = 50
    val internsWorkers = 30
    val oldSalary = 30000
    val internsSalary = 20000

    val oldWorkersExpenses = oldWorkers * oldSalary
    val internsExpenses = internsWorkers * internsSalary
    val totalExpenses = oldWorkersExpenses + internsExpenses
    val totalWorkers = oldWorkers + internsWorkers
    val averageSalary = totalExpenses / totalWorkers

    println(oldWorkersExpenses)
    println(totalExpenses)
    println(averageSalary)
}