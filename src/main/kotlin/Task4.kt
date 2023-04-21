package homework12

fun translateNumberToRussian(number: Int) {
    val ones = listOf("", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val teens = listOf("десять", "одиннадцать", "двенадцать", "тринадцать", "четырадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
    val tens = listOf("", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")
    val hundreds = listOf("", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот")
    val thousends = listOf("", "одна тысяча")
    val message = "Натуральное число должно быть из диапазона [1..1000]"


    if (number !in 1..1000)  {
        println(message)
    } else {
        val words = mutableListOf<String>()

        val thousendsNumber = number / 1000
        val hundredsNumber = (number % 1000) / 100
        val tensNumber = (number % 100) / 10
        val onesNumber = number % 10

        words.add(thousends[thousendsNumber])
        words.add(hundreds[hundredsNumber])

        if (tensNumber == 1) {
            words.add(teens[onesNumber])
        } else {
            words.add(tens[tensNumber])
            words.add(ones[onesNumber])
        }

        val filteredWords = words.filter { it.isNotEmpty() }
        println(filteredWords.joinToString(separator = " "))
    }
}