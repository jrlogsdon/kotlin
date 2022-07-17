package main.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {

    val fizzBuzz = FizzBuzz()


    @Test
    fun fizzCase() {
        val actual = fizzBuzz.fizzBuzz(3)
        val expected = listOf("1", "2", "Fizz");
        assertTrue(expected == actual)
    }

    @Test
    fun buzzCase() {
        val actual = fizzBuzz.fizzBuzz(5)
        val expected = listOf("1", "2", "Fizz", "4", "Buzz");
        assertTrue(expected == actual)
    }

    @Test
    fun fizzBuzz() {
        val actual = fizzBuzz.fizzBuzz(15)
        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz");
        assertTrue(expected == actual)

    }

    @Test
    fun fizzBuzzFast() {
        val actual = fizzBuzz.fizzBuzzWithMutableList(15)
        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz");
        assertTrue(expected == actual)

    }


}
