package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Array Partition",
        url = "https://leetcode.com/problems/array-partition",
        timeComplexity = "O(N * LogN)",
        spaceComplexity = "O(1)"
)
public class ArrayPartition {
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
