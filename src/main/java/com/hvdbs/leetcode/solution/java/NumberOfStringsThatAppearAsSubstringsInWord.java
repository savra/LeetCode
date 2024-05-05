package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Strings That Appear as Substrings in Word",
        url = "https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/")
public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.indexOf(patterns[i]) != -1) {
                result++;
            }
        }

        return result;
    }
}
