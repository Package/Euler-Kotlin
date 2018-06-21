package com.euler

import com.euler.utilities.Primes

fun main(args: Array<String>) {
    val largestPrimeFactor =
            (Math.sqrt(600851475143.0).toLong() downTo 1)
            .first { x -> 600851475143L % x == 0L && Primes.isPrime(x) }

    println(largestPrimeFactor)
}