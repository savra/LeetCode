package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Count Equal and Divisible Pairs in an Array",
        url = "https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/")
public class CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        int pairCount = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}
