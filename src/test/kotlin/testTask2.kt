package homework12

import org.junit.Test
import org.junit.Assert.*
import java.time.LocalDate


class TypeCastingTest {
    @Test
    fun testProcessString() {
        val data = "Privet"
        val expectedOutput = "Я получил тип String = 'Privet', ее длина равна 6"
        assertEquals(expectedOutput, captureOutput { typeCasting(data) })
    }

    @Test
    fun testProcessPositiveInt() {
        val data = 5
        val expectedOutput = "Я получил тип Int = 5, его квадрат равен 25"
        assertEquals(expectedOutput, captureOutput { typeCasting(data) })
    }

    @Test
    fun testProcessNegativeInt() {
        val data = -5
        val expectedOutput = "Я получил тип Int = -5, его квадрат равен 25"
        assertEquals(expectedOutput, captureOutput { processInt(data) })
    }

    @Test
    fun testProcessDouble() {
        val data = 3.1415926
        val expectedOutput = "Я получил тип Double = 3.1415926, это число округляется до 3,14"
        assertEquals(expectedOutput, captureOutput { typeCasting(data) })
    }

    @Test
    fun testProcessOldLocalDate() {
        val data = LocalDate.of(2005, 12, 24)
        val expectedOutput = "Я получил тип LocalDate = 2005-12-24, эта дата меньше чем дата основания Tinkoff"
        assertEquals(expectedOutput, captureOutput { typeCasting(data) })
    }

    @Test
    fun testProcessNewLocalDate() {
        val data = LocalDate.of(2023, 4, 21)
        val expectedOutput = "Я получил тип LocalDate = 2023-04-21, эта дата не меньше чем дата основания Tinkoff"
        assertEquals(expectedOutput, captureOutput { processLocalDate (data) })
    }

    @Test
    fun testProcessNull() {
        val data: Any? = null
        val expectedOutput = "Объект равен null"
        assertEquals(expectedOutput, captureOutput { typeCasting(data) })
    }

    @Test
    fun testProcessUnknownType() {
        val data = true
        val expectedOutput = "Мне этот тип неизвестен"
        assertEquals(expectedOutput, captureOutput { typeCasting(data) })
    }

}
