package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Percentage of Letter in String",
        url = "https://leetcode.com/problems/percentage-of-letter-in-string")
public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        int letterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                letterCount++;
            }
        }

        return (int)(letterCount / (double)s.length() * 100);
    }
}
