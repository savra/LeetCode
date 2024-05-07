package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Check if Number Has Equal Digit Count and Digit Value",
        url = "https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value")
public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public boolean digitCount(String num) {
        Map<Integer, Integer> digitCount = new HashMap<>();

        for(int i = 0; i < num.length(); i++) {
            Integer tmp = Character.getNumericValue(num.charAt(i));
            digitCount.put(tmp, digitCount.getOrDefault(tmp, 0) + 1);
        }

        boolean result = true;

        for (int i = 0; i < num.length(); i++) {
            if (digitCount.getOrDefault(i, 0) != Character.getNumericValue(num.charAt(i))) {
                result = false;
                break;
            }
        }

        return result;
    }
}
