package com.rahul.common

class Calculation {
    fun addition(vararg number: Int): Int {
        var sum = 0;
        number.forEach {
            sum = sum + it;
        }
        return sum;
    }

    fun multiplication(vararg number: Int): Int {
        var sum = 0;
        number.forEach {
            sum = sum * it;
        }
        return sum;
    }


    fun dividation(one: Int, two: Int): Int {
        return one / two
    }

    fun subtraction(one: Int, two: Int): Int {
        return one - two
    }

    fun power(base: Int, power: Int): Double {
        return Math.pow(base.toDouble(), power.toDouble())
    }

    fun remainder(dividend: Int, divisor: Int): Int {
        return dividend % divisor
    }

}