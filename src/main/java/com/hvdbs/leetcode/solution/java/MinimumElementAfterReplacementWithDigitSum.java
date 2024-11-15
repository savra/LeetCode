package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Element After Replacement With Digit Sum",
        url = "https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum",
        timeComplexity = Complexity.ConstantComplexity.BILINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int min = 0x7FFFFFFF;

        for (int num : nums) {
            min = Math.min(sumDigit(num), min);
        }

        return min;
    }

    private int sumDigit(int num) {
        int sum = 0;
        int tmp = num;

        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }

        return sum;
    }
}
