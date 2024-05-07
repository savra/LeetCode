package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Arithmetic Triplets",
        url = "https://leetcode.com/problems/number-of-arithmetic-triplets/description/")
public class NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
