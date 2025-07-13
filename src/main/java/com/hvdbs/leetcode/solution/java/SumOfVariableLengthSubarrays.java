package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Sum of Variable Length Subarrays",
        url = "https://leetcode.com/problems/sum-of-variable-length-subarrays",
        timeComplexity = Complexity.ConstantComplexity.QUADRATIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.EASY)
public class SumOfVariableLengthSubarrays {
    public int subarraySum(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            int sum = 0;

            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }

            totalSum += sum;
        }

        return totalSum;
    }
}
