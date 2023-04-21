package homework12

fun MutableList<Int>.squareAll() {
    for (i in this.indices) {
        val originalValue = this[i]
        val squaredValue = originalValue.toLong() * originalValue.toLong()

        if (squaredValue > Int.MAX_VALUE) {
            println("Значение $originalValue по индексу $i слишком большое " +
                    "и при возведении в квадрат приводит к переполнению Int-а")
        }

        this[i] = squaredValue.toInt()
    }
}
