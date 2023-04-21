package homework12

import org.junit.Test
import org.junit.Assert.*


class DoubleExtensionTest {

    @Test
    fun testFormatInt() {
        val input = 145.0
        val expectedOutput = "145"
        val actualOutput = input.format(2)
        assertEquals(expectedOutput, actualOutput)
    }
    @Test
    fun testFormatWithTrimZero() {
        val input = 145.101
        val expectedOutput = "145,1"
        val actualOutput = input.format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatWithRoundDown() {
        val input = 3.1415926
        val expectedOutput = "3,14"
        val actualOutput = input.format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatWithRoundUp() {
        val input = 1.23456789
        val expectedOutput = "1,23457"
        val actualOutput = input.format(5)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testFormatWithZeroDecimal() {
        val input = 3.1415926
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