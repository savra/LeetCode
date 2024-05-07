package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Split a String in Balanced Strings",
        url = "https://leetcode.com/problems/split-a-string-in-balanced-strings/description/")
public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lCount++;
            } else {
                rCount++;
            }

            if (lCount == rCount) {
                result++;
                lCount = rCount = 0;
            }
        }

        return result;
    }
}
