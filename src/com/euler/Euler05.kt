package com.euler

fun evenlyDivisible(num: Long, divisor: Int): Boolean = (divisor downTo 1).all { d -> num % d == 0L }

fun main(args: Array<String>) {
    var number = 1_000_000L
    while (!evenlyDivisible(number, 20))
        number += 1
    print(number)
}