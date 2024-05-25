package org.example.lesson_2

fun main() {
    val trainDepartureTime = "Время выезда поезда - 9:39 "
    val trainDepartureTimeInMinutes = 9 * NUMBER_OF_MINUTES_PER_HOUR + 39
    val trainTravelTime = 457
    val trainArrivalTimeInMinutes = trainDepartureTimeInMinutes + trainTravelTime
    val trainArrivalTimeHours = trainArrivalTimeInMinutes / NUMBER_OF_MINUTES_PER_HOUR
    val trainArrivalTimeMinutes = trainArrivalTimeInMinutes - trainArrivalTimeHours * NUMBER_OF_MINUTES_PER_HOUR
    println(trainDepartureTime)
    println("Время поезда в пути - $trainTravelTime")
    println("Время прибытия поезда - $trainArrivalTimeHours:$trainArrivalTimeMinutes")


}

const val NUMBER_OF_MINUTES_PER_HOUR = 60