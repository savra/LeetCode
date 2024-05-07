package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum Strong Pair XOR I",
        url = "https://leetcode.com/problems/maximum-strong-pair-xor-i")
public class MaximumStrongPairXORI {
    public int maximumStrongPairXor(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) <= Math.min(nums[i], nums[j]) && ((nums[i] ^ nums[j]) > result)) {
                    result = nums[i] ^ nums[j];
                }
            }
        }

        return result;
    }
}
