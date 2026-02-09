package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Maximum Subarray",
        url = "https://leetcode.com/problems/maximum-subarray/description/",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        difficulty = Difficulty.MEDIUM
)
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int globalSum = currentSum;

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            globalSum = Math.max(currentSum, globalSum);

        }

        return globalSum;
    }
}
