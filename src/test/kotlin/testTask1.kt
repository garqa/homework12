package homework12

import org.junit.Test
import org.junit.Assert.*


class SquareAllTest {
    @Test
    fun testPozitiveValues() {
        val list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
        list.squareAll()
        val expected: MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
        assertEquals(expected, list)
    }

    @Test
    fun testNegativeValues() {
        val list: MutableList<Int> = mutableListOf(-1, -2, -3, -4, -5)
        list.squareAll()
        val expected: MutableList<Int> = mutableListOf(1, 4, 9, 16, 25)
        assertEquals(expected, list)
    }

    @Test
    fun testZeroValue() {
        val list: MutableList<Int> = mutableListOf(0)
        list.squareAll()
        val expected: MutableList<Int> = mutableListOf(0)
        assertEquals(expected, list)
    }

    @Test
    fun testEmptyList() {
        val list: MutableList<Int> = mutableListOf()
        list.squareAll()
        assertTrue(list.isEmpty())
    }

    @Test
    fun testIntOverflaw() {
        val list: MutableList<Int> = mutableListOf(Int.MAX_VALUE)

        val expectedPrint = "Значение ${Int.MAX_VALUE} по индексу 0 слишком большое и при возведении в квадрат приводит к переполнению Int-а"
        val expectedRes: MutableList<Int> = mutableListOf(1)

        assertEquals(expectedPrint, captureOutput { list.squareAll() })
        assertEquals(expectedRes, list)
    }


}