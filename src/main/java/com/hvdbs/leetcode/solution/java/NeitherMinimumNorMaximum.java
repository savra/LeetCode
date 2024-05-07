package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Neither Minimum nor Maximum",
        url = "https://leetcode.com/problems/neither-minimum-nor-maximum",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class NeitherMinimumNorMaximum {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if (nums.length <= 2) {
            return -1;
        }

        for (int num : nums) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }

        return -1;
    }
}
