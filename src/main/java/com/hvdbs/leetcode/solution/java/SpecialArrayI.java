package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Special Array I",
        url = "https://leetcode.com/problems/special-array-i",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }

        return true;
    }
}
