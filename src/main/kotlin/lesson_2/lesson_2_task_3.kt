package org.example.lesson_2

fun main() {
    val trainDepartureTime = "Время выезда поезда - 9:39 "
    val trainTravelTime = 457
    val trainArrivalTimeInMinutes = TRAIN_DEPARTURE_TIME_IN_MINUTES + trainTravelTime
    val trainArrivalTimeHours = trainArrivalTimeInMinutes / NUMBER_OF_MINUTES_PER_HOUR
    val trainArrivalTimeMinutes = trainArrivalTimeInMinutes - trainArrivalTimeHours * NUMBER_OF_MINUTES_PER_HOUR
    println(trainDepartureTime)
    println("Время поезда в пути - $trainTravelTime")
    println("Время прибытия поезда - $trainArrivalTimeHours:$trainArrivalTimeMinutes")


}

const val TRAIN_DEPARTURE_TIME_IN_MINUTES = 579
const val NUMBER_OF_MINUTES_PER_HOUR = 60