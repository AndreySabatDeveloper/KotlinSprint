package org.example.lesson_2

fun main() {
    val principalAmount = 70_000
    val interestRate = 16.7
    val timePeriod = 20
    val compoundInterest = principalAmount.toDouble() * Math.pow(
        (1 +
                interestRate.toDouble() / 100.00), timePeriod.toDouble()
    )
    println(String.format("%.3f", compoundInterest))
}