package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Monotonic Array",
        url = "https://leetcode.com/problems/monotonic-array")
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] > nums[j]) {
                isIncreasing = false;
                break;
            }
        }

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[j] > nums[i]) {
                isDecreasing = false;
                break;
            }
        }

        return isIncreasing | isDecreasing;
    }
}
