package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Move Zeroes",
        url = "https://leetcode.com/problems/move-zeroes/description/",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, insertPosition = 0;

        while (i < n) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[insertPosition];
                nums[insertPosition] = tmp;
                insertPosition++;
            }

            i++;
        }
    }
}
