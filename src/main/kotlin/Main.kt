package homework12

import java.time.LocalDate
import java.util.logging.Handler

fun main() {
    // Демонстрация функции из задачи 1
    val inputIntList = mutableListOf(1, 4, 9, 16, 25)
    println("Пример решения задачи 1 для списка $inputIntList:")
    inputIntList.squareAll()
    println(inputIntList)

    // Демонстрация функции из задачи 2
    println("\n\nДемонастрация решения задачи 2:")
    typeCasting("Privet")
    typeCasting(145)
    typeCasting(145.0)
    typeCasting(145.2817812)
    typeCasting(LocalDate.of(1990,1,1))
    typeCasting(Handler::class)

    // Демонстрация функции из задачи 3
    val inputDoubleList = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
    println("\n\nДемонстрация решения задачи 3 для списка $inputDoubleList:")
    println(processList(inputDoubleList).format(2))

    // Демонстрация функции из задачи 4
    val inputInt = 975
    println("\n\nДемонстрация решения задачи 4 для числа $inputInt:")
    translateNumberToRussian(inputInt)
}