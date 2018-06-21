package com.euler

import com.euler.utilities.Primes

fun main(args: Array<String>) {
    println(Primes.generator().takeWhile { p -> p < 2_000_000 }.sum())
}