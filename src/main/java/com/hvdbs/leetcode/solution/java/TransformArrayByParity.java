package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        spaceComplexity = Complexity.ConstantComplexity.LOGARITHMIC,
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        url = "https://leetcode.com/problems/transform-array-by-parity",
        name = "Transform Array by Parity",
        difficulty = Difficulty.EASY)
public class TransformArrayByParity {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        Arrays.sort(nums);

        return nums;
    }
}
