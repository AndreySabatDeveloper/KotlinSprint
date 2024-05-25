package org.example.lesson_2

fun main() {
    val assessmentOfTheFirstStudent = 3.0
    val assessmentOfTheSecondStudent = 4.0
    val assessmentOfTheThirdStudent = 3.0
    val assessmentOfTheFourthStudent = 5.0
    val totalStudents = 4
    val averageRating =
        (assessmentOfTheFirstStudent + assessmentOfTheSecondStudent + assessmentOfTheThirdStudent + assessmentOfTheFourthStudent) / totalStudents
    println(averageRating)
}

