package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Number of Unequal Triplets in Array",
        url = "https://leetcode.com/problems/number-of-unequal-triplets-in-array")
public class NumberOfUnequalTripletsInArray {
    public int unequalTriplets(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
