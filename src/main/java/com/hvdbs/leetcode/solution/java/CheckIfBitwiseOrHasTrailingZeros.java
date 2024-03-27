package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check if Bitwise OR Has Trailing Zeros",
        url = "https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros")
public class CheckIfBitwiseOrHasTrailingZeros {
    public boolean hasTrailingZeros(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;

                if (evenCount == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
