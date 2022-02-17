package algorithms

class Fibonacci {
    fun calculate(i: Int): Int {
        if (i <= 1) {
            return i
        }
        return calculate(i-1) + calculate(i-2)
    }
}