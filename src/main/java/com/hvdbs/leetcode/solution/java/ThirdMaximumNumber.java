package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Third Maximum Number",
        url = "https://leetcode.com/problems/third-maximum-number",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int num : nums) {
            if (max1 == num || max2 == num || max3 == num) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        if (max3 == Long.MIN_VALUE) {
            return (int)max1;
        }

        return (int)max3;
    }
}
