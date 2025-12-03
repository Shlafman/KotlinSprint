package org.example.utils.lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    var movement = "$from-$to:$moveNumber"

    println(movement)

    from = "D2"
    to = "D3"
    moveNumber++

    movement = "$from-$to:$moveNumber"

    println(movement)
}