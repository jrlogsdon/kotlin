package main.kotlin

import kotlin.math.abs

class SubArrayRanges {


    //O(n^2)
    fun subArrayRanges(nums: IntArray): Long {
        var sum = 0L
        for (i in nums.indices)  {
            var min = nums[i]
            var max = nums[i]
            for (j in i until  nums.size) {
                max = if (nums[j] > max) nums[j] else max
                min = if (nums[j] < min) nums[j] else min
                sum += abs(max - min)
            }
        }
        return sum
    }

}