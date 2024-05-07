package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Remove Trailing Zeros From a String",
        url = "https://leetcode.com/problems/remove-trailing-zeros-from-a-string",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class RemoveTrailingZerosFromAString {
    public String removeTrailingZeros(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
