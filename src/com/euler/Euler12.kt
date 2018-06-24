package com.euler

fun numberOfDivisors(n: Int): Int {
    // +2 because 1 and n are always divisors
    return (2..n/2).filter { x -> n % x == 0 }.size + 2
}

fun triangleNum(): Sequence<Int> {
    var startNum = 0

    fun next(): Int {
        startNum += 1

        return (1..startNum).sum()
    }

    return generateSequence(::next)
}

fun main(args: Array<String>) {
    // This one will take around 10 minutes to run (on decent hardware)
    val t = triangleNum().first { x -> numberOfDivisors(x) > 500 }
    println(t)
}