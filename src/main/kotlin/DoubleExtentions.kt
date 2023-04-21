package homework12

fun Double.format(digits: Int) =
    if (this % 1 == 0.0) {
        "%.0f".format(this)
    } else {
        "%.${digits}f".format(this).trimEnd('0', ',')
    }
