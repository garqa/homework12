package homework12

import java.time.LocalDate

fun processString(data: String){
    val length = data.length
    println("Я получил тип String = '$data', ее длина равна $length")
}

fun processInt(data: Int){
    val square = data * data
    println("Я получил тип Int = $data, его квадрат равен $square")
}

fun processDouble(data: Double){
    val roundedValue = data.format(2)
    println("Я получил тип Double = $data, это число округляется до $roundedValue")
}

fun processLocalDate(data: LocalDate){
    val tinkoffFoundation = LocalDate.of(2006, 12, 24)
    val comparisonResult = data.isBefore(tinkoffFoundation)
    val message = if (comparisonResult) "меньше" else "не меньше"
    println("Я получил тип LocalDate = $data, эта дата $message чем дата основания Tinkoff")
}

fun typeCasting(data: Any?) {
    when (data) {
        is String -> processString(data)
        is Int -> processInt(data)
        is Double -> processDouble(data)
        is LocalDate -> processLocalDate(data)
        null -> println("Объект равен null")
        else -> println("Мне этот тип неизвестен")
    }
}
