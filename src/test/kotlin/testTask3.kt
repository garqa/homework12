package homework12

import org.junit.Test
import org.junit.Assert.*

class ProcessListTest {
    @Test
    fun testProcessListWithSimpleInput() {
        val inputList = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
        val expectedOutput = 22.0851.format(2)
        val actualOutput = processList(inputList).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testProcessListWithNegativeInput() {
        val inputList = listOf(-0.01, -1.1, -2.2, -3.3, -5.5)
        val expectedOutput = -0.1099
        val actualOutput = processList(inputList)
        assertEquals(expectedOutput.format(2), actualOutput.format(2))
    }

    @Test
    fun testProcessEmptyList() {
        val inputList = emptyList<Double?>()
        val expectedOutput = 0.0.format(2)
        val actualOutput = processList(inputList).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testProcessListWithAllNulls() {
        val inputList = listOf(null, null, null)
        val expectedOutput = 0.0.format(2)
        val actualOutput = processList(inputList).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testProcessListWithAllZeros() {
        val inputList = listOf(0.0, 0.0)
        val expectedOutput = 0.0.format(2)
        val actualOutput = processList(inputList).format(2)
        assertEquals(expectedOutput, actualOutput)
    }


    @Test
    fun testProcessListWithTakingMaxItems() {
        val maxItems = 10
        val inputList = List(maxItems * 2) {1.0}
        val expectedOutput = (0.5 * maxItems).format(2)
        val actualOutput = processList(inputList, maxItems=maxItems).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testProcessListWithFilteringMaxValue() {
        val maxValue = 25.0
        val inputList = List(5) {2 * maxValue + it + 1}
        val expectedOutput = 0.0.format(2)
        val actualOutput = processList(inputList, maxValue=maxValue).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testProcessListFilteringOnBound() {
        val maxValue = 4.0
        val value = 2.0
        val size = 5
        val inputList = List(size) { value }
        val expectedOutput = (size * maxValue).format(2)
        val actualOutput = processList(inputList, maxValue=maxValue).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testProcessListWithComplexInput() {
        val inputList = listOf(null, 7.0, 8.0, null, 4.0, 3.0, -6.0, -2.0, -1.0, 5.0, 9.0, 1.8, 1.6, 1.4, 1.2, 0.5)
        val expectedOutput = "35"
        val actualOutput = processList(inputList).format(2)
        assertEquals(expectedOutput, actualOutput)
    }

}
