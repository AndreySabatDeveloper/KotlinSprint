package org.example.lesson_1

fun main() {
    val timeSpentInSpace = TIME_SPENT_IN_SPACE // время пребывания Гагариным в космосе 106 минут

    val remainingHours = String.format(
        "%02d",
        timeSpentInSpace / NUMBER_OF_SECONDS_PER_HOUR
    ) // секунды поделил на колво секунд в 1 часе "3600",
    // получилось 1,766667. Т.к Тип инт целый , вывлеось только 1 час

    val remainingMinutes =
        String.format("%02d", timeSpentInSpace / NUMBER_OF_SECONDS_PER_MINUTE - NUMBER_OF_MINUTE_PER_HOUR)
    // секунды поделил на колво секунд в 1 минуте "60",
    // получилось 106 минут, т.к мы печатаем в формате [часы:минуты:секунды],
    // вычил 60 минут чтобы показать остаток минут от 106 минут

    val remainingSeconds =
        String.format("%02d", timeSpentInSpace - TIME_SPENT_IN_SPACE) // Гагарин пробыл в космосе ровно 106 минут
    // (по информации википедии) поэтому остаток секунд из 6_480 секунд (ровно 106 минут) нет

    println("$remainingHours:$remainingMinutes:$remainingSeconds")

}

const val TIME_SPENT_IN_SPACE = 6_360
const val NUMBER_OF_SECONDS_PER_HOUR = 3_600
const val NUMBER_OF_SECONDS_PER_MINUTE = 60
const val NUMBER_OF_MINUTE_PER_HOUR = 60