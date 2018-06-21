package com.euler

fun main(args: Array<String>) {
    val sumOfSquares = (1..100).map { x -> x * x }.sum()
    val squareOfSum = Math.pow((1..100).sum().toDouble(), 2.0)
    println((squareOfSum - sumOfSquares).toInt())
}