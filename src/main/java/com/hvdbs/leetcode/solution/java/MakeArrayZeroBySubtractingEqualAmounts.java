package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Make Array Zero by Subtracting Equal Amounts",
        url = "https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts")
public class MakeArrayZeroBySubtractingEqualAmounts {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int x;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                x = nums[i];

                for (int j = 0; j < nums.length; j++) {
                    nums[j] -= x;
                }

                result++;
            }
        }

        return result;
    }
}
