class FibDynamic {

    fun fib(n: Int): Int {
        if (n == 0) return 0
        if (n == 1 || n == 2) return 1
        val nums = IntArray(n + 1){0}
        nums[1] = 1
        nums[2] = 1
        return fibWithCache(n, nums)

    }

    private fun fibWithCache(n: Int, nums: IntArray): Int {
        if (nums[n] == 0) {
            val number = fibWithCache(n-1, nums) + fibWithCache(n-2, nums)
            nums[n] = number
        }
        return nums[n]
    }
}