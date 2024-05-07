package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Largest 3-Same-Digit Number in String",
        url = "https://leetcode.com/problems/largest-3-same-digit-number-in-string")
public class Largest3SameDigitNumberInString {
    public String largestGoodInteger(String num) {
        int max = -1;

        if (num == null || num.length() < 3) {
            return "";
        }

        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i - 2) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i)) {
                if (Character.getNumericValue(num.charAt(i)) > max) {
                    max = Character.getNumericValue(num.charAt(i));
                }
            }
        }

        return max > -1 ? String.valueOf(max).repeat(3) : "";
    }
}
