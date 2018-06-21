package com.euler

fun main(args: Array<String>) {
    (1..1000).forEach { a ->
        (1..1000).forEach { b ->
            (1..1000).forEach { c ->
                val a2 = a * a
                val b2 = b * b
                val c2 = c * c
                if (a2 + b2 == c2 && a + b + c == 1000) {
                    println(a * b * c)
                    return
                }
            }
        }
    }
}