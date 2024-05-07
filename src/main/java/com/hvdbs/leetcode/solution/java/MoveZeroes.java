package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Move Zeroes",
        url = "https://leetcode.com/problems/move-zeroes/description/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer++] = nums[readPointer];
            }
        }

        for (int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
