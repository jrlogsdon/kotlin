package main.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NextPermutationTest {

    val perms = NextPermutation()

    @Test
    fun simplePerm() {
        val input = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 3, 2)
        perms.nextPermutation(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun duplicates() {
        val input = intArrayOf(1, 1, 5)
        val expected = intArrayOf(1, 5, 1)
        perms.nextPermutation(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun alreadyLexicographic() {
        val input = intArrayOf(3, 2, 1)
        val expected = intArrayOf(1, 2, 3)
        perms.nextPermutation(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun multipleSwapsNotSort() {
        val input = intArrayOf(1, 3, 2)
        val expected = intArrayOf(2, 1, 3)
        perms.nextPermutation(input)

        assertArrayEquals(expected, input)

    }

}
