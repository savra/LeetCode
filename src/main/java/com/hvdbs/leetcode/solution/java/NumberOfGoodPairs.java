package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Number of Good Pairs", url = "https://leetcode.com/problems/number-of-good-pairs/")
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    goodPairs++;
                }
            }
        }

        return goodPairs;
    }
}
