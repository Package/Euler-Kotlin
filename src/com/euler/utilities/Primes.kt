package com.euler.utilities

class Primes {

    // Static methods go inside a class "companion object" in Kotlin
    companion object {
        fun isPrime(num: Long): Boolean {
            if (num == 2L)
                return true

            if (num % 2 == 0L)
                return false

            for (x in 3..Math.sqrt(num.toDouble()).toLong() step 2) {
                if (num % x == 0L)
                    return false
            }

            return true
        }

        fun generator(): Sequence<Long> {
            var lastPrime = 2L

            fun next(): Long {
                if (lastPrime == 2L) {
                    lastPrime = 1
                    return 2
                }

                lastPrime += 2
                while (!isPrime(lastPrime))
                    lastPrime += 2

                return lastPrime
            }

            return generateSequence(::next)
        }
    }
}
