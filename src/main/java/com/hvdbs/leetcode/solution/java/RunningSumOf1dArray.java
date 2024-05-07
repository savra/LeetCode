package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Running Sum of 1d Array",
        url = "https://leetcode.com/problems/running-sum-of-1d-array/")
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {

                result[i] += nums[j];
            }
        }

        return result;
    }
}
