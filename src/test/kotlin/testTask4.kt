package homework12

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class TranslateNumberToRussianTest(val number: Int, val expected: String) {

    @Test
    fun `test translateNumberToRussian function`() {
        assertEquals("Failed for number $number", expected, captureOutput{ translateNumberToRussian(number) } )
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return listOf(
                arrayOf(1, "один"),
                arrayOf(19, "девятнадцать"),
                arrayOf(25, "двадцать пять"),
                arrayOf(100, "сто"),
                arrayOf(203, "двести три"),
                arrayOf(113, "сто тринадцать"),
                arrayOf(156, "сто пятьдесят шесть"),
                arrayOf(999, "девятьсот девяносто девять"),
                arrayOf(1000, "одна тысяча"),
                arrayOf(0, "Натуральное число должно быть из диапазона [1..1000]"),
                arrayOf(-1, "Натуральное число должно быть из диапазона [1..1000]"),
                arrayOf(1001, "Натуральное число должно быть из диапазона [1..1000]")
            )
        }

    }

}