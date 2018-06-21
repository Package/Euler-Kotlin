package com.euler

fun isPalindrome(str: String): Boolean {
    return str.reversed() == str
}

fun main(args: Array<String>) {
    var maxPalindrome = 0

    (999 downTo 1).forEach { x ->
        (999 downTo 1).forEach { y ->
            if (isPalindrome((x * y).toString()) && x * y > maxPalindrome)
                maxPalindrome = x * y
        }
    }

    println(maxPalindrome)
}