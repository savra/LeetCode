package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Replace All Digits with Characters",
        url = "https://leetcode.com/problems/replace-all-digits-with-characters/description/")
public class ReplaceAllDigitsWithCharacters {
    public static String replaceDigits(String s) {
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i += 2) {
            chars[i] = (char)(chars[i - 1] + Integer.parseInt(String.valueOf(chars[i])));
        }

        return new String(chars).replaceAll("[^a-z]", "");
    }
}
