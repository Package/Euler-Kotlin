package com.euler

fun main(args: Array<String>) {
    val x =  (1..999)
            .filter { x -> x % 3 == 0 || x % 5 == 0 }
            .sum()
    println(x)
}