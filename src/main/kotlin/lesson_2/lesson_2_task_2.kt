package org.example.lesson_2

fun main() {
    val numberOfPermanentEmployees = 50
    val salaryOfPermanentEmployees = 30_000
    val numberOfInterns = 30
    val salaryOfInterns = 20_000
    val theCostOfPayingTheSalariesOfPermanentWorkers = numberOfPermanentEmployees * salaryOfPermanentEmployees
    val theCostOfPayingTheSalariesOfInters = numberOfInterns * salaryOfInterns
    val totalSalaryExpensesAfterTheArrivalOfInterns =
        theCostOfPayingTheSalariesOfPermanentWorkers + theCostOfPayingTheSalariesOfInters
    val totalNumberOfEmployees = numberOfPermanentEmployees + numberOfInterns
    val theAverageSalaryOfOneEmployeeAfterThePlacementOfIntern =
        totalSalaryExpensesAfterTheArrivalOfInterns / totalNumberOfEmployees
    println("Расходы на выплату зарплаты постоянных сотрудников - $theCostOfPayingTheSalariesOfPermanentWorkers рублей")
    println("Общие расходы по ЗП после прихода стажеров - $totalSalaryExpensesAfterTheArrivalOfInterns рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров - $theAverageSalaryOfOneEmployeeAfterThePlacementOfIntern рублей")
}
