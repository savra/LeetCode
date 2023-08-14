package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Move Zeroes",
        url = "https://leetcode.com/problems/move-zeroes/description/")
public class MoveZeroes {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
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
