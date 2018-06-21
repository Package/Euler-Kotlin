package com.euler

fun fib(): Sequence<Long> {
    var x = 0L
    var y = 1L

    fun next(): Long {
        val res = x + y
        x = y
        y = res

        return x
    }

    return generateSequence(::next)
}

fun main(args: Array<String>) {
    val res = fib()
                .takeWhile { x -> x <= 4_000_000 }
                .filter { x -> x % 2 == 0L }
                .sum()
    print(res)
}