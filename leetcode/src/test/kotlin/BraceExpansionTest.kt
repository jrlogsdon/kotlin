import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BraceExpansionTest {

    val expander = BraceExpansion()

    @Test
    fun testNoBraces() {
        val input = "abcd"
        val expansion = expander.expand(input)
        val expected = arrayOf(input);
        assertArrayEquals(expected, expansion)
    }


    @Test
    fun testBraces() {
        val input = "{a,b}c{d,e}f"
        val expansion = expander.expand(input)
        val expected = arrayOf("acdf","acef","bcdf","bcef")
        assertArrayEquals(expected, expansion)
    }
}