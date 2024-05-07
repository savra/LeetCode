package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum Count of Positive Integer and Negative Integer",
        url = "https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/")
public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int maxNegative = 0, maxPositive = 0;

        for (int num : nums) {
            if (num < 0) {
                maxNegative++;
            } else if (num > 0) {
                maxPositive++;
            }
        }

        return Math.max(maxNegative, maxPositive);
    }
}
