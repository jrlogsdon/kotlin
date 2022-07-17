import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FibDynamicTest {
    val fibDynamic = FibDynamic()

    @Test
    fun baseZero() {
        assertEquals(0, fibDynamic.fib(0))
    }

    @Test
    fun baseOne() {
        assertEquals(1, fibDynamic.fib(1))
        assertEquals(1, fibDynamic.fib(2))
    }

    @Test
    fun largeFib() {
        val expected = 102334155
        assertEquals(expected, fibDynamic.fib(40))
    }

}