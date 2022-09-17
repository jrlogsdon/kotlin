package main.kotlin

class NextPermutation {

    fun nextPermutation(nums: IntArray): Unit {
        var i = nums.size - 2
        while (i >= 0 && nums[i+1] <= nums[i]) {
            i--
        }

        if (i >= 0) {
            var j = nums.size - 1
            while (nums[j] <= nums[i]) {
                j--
            }
            swap(i, j, nums)
        }
        reverse(nums, i+1)

    }

    private fun reverse(numbs: IntArray, index: Int) {
        var end = numbs.size - 1
        var start = index;
        while (start < end) {
            swap(start, end, numbs)
            start++
            end--
        }
    }

    private fun swap(i: Int, j: Int, numbs: IntArray) {
        var temp = numbs[i]
        numbs[i] = numbs[j]
        numbs[j] = temp
    }
}