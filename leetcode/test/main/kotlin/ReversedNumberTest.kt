package main.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReversedNumberTest {

    val reversedNumber = ReversedNumber()

    @Test
    fun reversedNegative() {
        val input = -123
        val expected = -321
        assertEquals(expected, reversedNumber.reverse(input))
    }

    @Test
    fun bigPositive() {
        val input = 1534236469
        //           964632435
        // current: 1056389759
        val expected = 0
        assertEquals(expected, reversedNumber.reverse(input))

    }
}