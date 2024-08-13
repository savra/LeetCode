package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find if Digit Game Can Be Won",
        url = "https://leetcode.com/problems/find-if-digit-game-can-be-won",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class FindIfDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        long sumSingleDigit = 0;
        long sumDoubleDigit = 0;

        for (int num : nums) {
            int digitCount = (int) Math.log10(num) + 1;

            if (digitCount == 1) {
                sumSingleDigit += num;
            } else {
                sumDoubleDigit += num;
            }
        }

        return sumSingleDigit != sumDoubleDigit;
    }
}
