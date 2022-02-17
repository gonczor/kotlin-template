import kotlin.test.Test
import algorithms.Fibonacci
import kotlin.test.assertEquals


internal class FibonacciTest {
    private val fib = Fibonacci()

    @Test
    fun calculate() {
        val expected = 34
        val result = fib.calculate(9)
        assertEquals(expected, result)
    }
    @Test
    fun testShouldReturn0For0Input() {
        val expected = 0
        val result = fib.calculate(0)
        assertEquals(expected, result)
    }
}