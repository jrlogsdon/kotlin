package main.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SubArrayRangesTest {

    val subArrayRanges = SubArrayRanges()

    @Test
    fun smallSubArrayAscending() {
        val nums = intArrayOf(1, 2, 3)
        // can be viewed as the sum of the subarrays
        // i.e. 1 - 3 is sum of 1 to 2 and 1 to 3

        assertEquals(4, subArrayRanges.subArrayRanges(nums))
    }

    @Test
    fun smallSubArrayNegatives() {
        val nums = intArrayOf(4,-2,-3,4,1)

        assertEquals(59, subArrayRanges.subArrayRanges(nums))
    }
}

