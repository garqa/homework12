package homework12

fun processList(list: List<Double?>, maxValue: Double = 25.0, maxItems: Int = 10): Double {
    return list
        .asSequence()
        .filterNotNull()
        .map {
            if (it.toInt() % 2 != 0) {
                it / 2
            } else {
                it * it
            }
        }
        .filter { it <= maxValue}
        .sortedDescending()
        .take(maxItems)
        .sum()
}
