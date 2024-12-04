package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Final Array State After K Multiplication Operations I",
        url = "https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.BILINEAR
)
public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = 0x7FFFFFFF;

        int minIndex = 0;

        while (k > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    minIndex = i;
                }
            }

            nums[minIndex] = min * multiplier;
            min = 0x7FFFFFFF;

            k--;
        }

        return nums;
    }
}
