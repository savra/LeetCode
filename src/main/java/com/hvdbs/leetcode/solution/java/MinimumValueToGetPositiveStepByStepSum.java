package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Value to Get Positive Step by Step Sum",
        url = "https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int s = 0;
        int m = 0;

        for (int num : nums) {
            s += num;
            m = Math.min(m, s);
        }

        return 1 - m;
    }
}
