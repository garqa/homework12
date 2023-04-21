package homework12

import org.junit.Test
import org.junit.Assert.*


class DoubleExtensionTest {

    @Test
    fun testFormatWithoutDecimal() {
        val input = 15.0
        val expectedOutput = "15"
        val actualOutput = input.format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatWithDecimal() {
        val input = 3.14159
        val expectedOutput = "3,14"
        val actualOutput = input.format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatWithMoreDecimal() {
        val input = 1.23456789
        val expectedOutput = "1,23456789"
        val actualOutput = input.format(8)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatWithZeroDecimal() {
        val input = 3.14159
        val expectedOutput = "3"
        val actualOutput = input.format(0)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatNegative() {
        val input = -3.1415926
        val expectedOutput = "-3,14"
        val actualOutput = input.format(2)
        assertEquals(expectedOutput, actualOutput)
    }
}