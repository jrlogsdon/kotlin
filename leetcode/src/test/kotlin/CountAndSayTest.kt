import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CountAndSayTest {

    val countAndSay = CountAndSay()
    @Test
    fun testOne() {
        val string = countAndSay.countAndSay(1)
        assertEquals("1", string)
    }

    @Test
    fun two() {
        val actual = countAndSay.countAndSay(2)
        assertEquals("11", actual)
    }

    @Test
    fun three() {
        val actual = countAndSay.countAndSay(3)
        assertEquals("21", actual)
    }

    @Test
    fun seven() {
        // 1211 -> 4
        // 111221 -> 5
        // 312211 -> 6
        // 13112221 -> 7
        val actual = countAndSay.countAndSay(7)
        assertEquals("13112221", actual)

    }

}