package org.example.utils.lesson_2

fun main() {
    val investments = 70000
    val interestRate = 16.7
    val investmentPeriod = 20.0


    val finalAmount = investments * Math.pow(1 + interestRate / 100, investmentPeriod)
    println("%.3f".format(finalAmount))
}