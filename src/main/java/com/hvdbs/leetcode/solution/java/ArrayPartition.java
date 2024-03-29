package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Array Partition",
        url = "https://leetcode.com/problems/array-partition"
)
public class ArrayPartition {
    //My Time Complexity: O(N * LogN)
    //My Space complexity: O(1)
    public int arrayPairSum(int[] nums) {
        int length = nums.length;
        int sum = 0;

        Arrays.sort(nums);

        for (int i = length - 1; i >= 0; i -= 2) {
            sum += Math.min(nums[i], nums[i - 1]);
        }

        return sum;
    }
}
