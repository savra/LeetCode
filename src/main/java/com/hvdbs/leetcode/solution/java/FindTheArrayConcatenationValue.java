package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Find the Array Concatenation Value",
        url = "https://leetcode.com/problems/find-the-array-concatenation-value/")
public class FindTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long result = 0;

        for (int i = 0, j = nums.length - 1; i < nums.length / 2 && j >= nums.length / 2; i++, j--) {
            result += Integer.parseInt(String.valueOf(nums[i]) + nums[j]);
        }

        if (nums.length % 2 != 0) {
            result += nums[nums.length / 2];
        }

        return result;
    }
}
