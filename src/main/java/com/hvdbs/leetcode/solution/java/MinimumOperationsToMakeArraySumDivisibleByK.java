package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k",
        name = "Minimum Operations to Make Array Sum Divisible by K",
        difficulty = Difficulty.EASY
)
public class MinimumOperationsToMakeArraySumDivisibleByK {
    public int minOperations(int[] nums, int k) {
        int totalSum = 0;
        int operationsCount = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        if (totalSum % k == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                totalSum--;
                operationsCount++;
                nums[i]--;

                if (totalSum % k == 0) {
                    return operationsCount;
                }
            }
        }

        return operationsCount;
    }
}
