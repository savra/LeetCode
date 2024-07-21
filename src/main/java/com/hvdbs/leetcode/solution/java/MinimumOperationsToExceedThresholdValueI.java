package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Operations to Exceed Threshold Value I",
        url = "https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)"
)
public class MinimumOperationsToExceedThresholdValueI {
    public int minOperations(int[] nums, int k) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                result++;
            }
        }

        return result;
    }
}
