package org.example.lesson_2

fun main() {
    val numberOfPermanentEmployees = 50
    val salaryOfPermanentEmployees = 30_000
    val numberOfInterns = 30
    val salaryOfInterns = 20_000
    println("Расходы на выплату зарплаты постоянных сотрудников - ${numberOfPermanentEmployees * salaryOfPermanentEmployees} рублей")
    println("Общие расходы по ЗП после прихода стажеров - ${numberOfPermanentEmployees * salaryOfPermanentEmployees + numberOfInterns * salaryOfInterns} рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров - ${(numberOfPermanentEmployees * salaryOfPermanentEmployees + numberOfInterns * salaryOfInterns) / (numberOfPermanentEmployees + numberOfInterns)} рублей")
}
