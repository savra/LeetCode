package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Count Number of Pairs With Absolute Difference K",
        url = "https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/")
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        int countPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    countPairs++;
                }
            }
        }

        return countPairs;
    }
}
