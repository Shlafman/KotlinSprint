package org.example.utils.lesson_3

fun main() {
    var age = 20
    val name = "Tatiana Sergeevna"
    var familyName = "Andreeva"
    var fullName = "$familyName $name"

    println("$fullName, $age")

    age = 22
    familyName = "Sidorova"
    fullName = "$familyName $name"

    println("$fullName, $age")
}