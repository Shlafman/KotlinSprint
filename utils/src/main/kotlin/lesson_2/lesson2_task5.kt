package org.example.utils.lesson_2
import kotlin.math.pow

fun main() {
    val investments = 70000
    val interestRate = 16.7
    val investmentPeriod = 20.0
    val onehundred = 100.0

    val finalAmount = investments * (1 + interestRate / onehundred).pow(investmentPeriod)
    println("%.3f".format(finalAmount))
}