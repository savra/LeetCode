package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Maximum Sum With Exactly K Elements",
        url = "https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/")
public class MaximumSumWithExactlyKElements {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        int result = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        while (k > 0) {
            result += max;
            max++;
            k--;
        }

        return result;
    }
}
