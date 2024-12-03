package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check Balanced String",
        url = "https://leetcode.com/problems/check-balanced-string/description/",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int current = Character.getNumericValue(num.charAt(i));

            if (i % 2 == 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }
        }

        return evenSum == oddSum;
    }
}
