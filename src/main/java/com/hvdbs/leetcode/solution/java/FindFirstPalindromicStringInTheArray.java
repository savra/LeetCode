package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find First Palindromic String in the Array",
        url = "https://leetcode.com/problems/find-first-palindromic-string-in-the-array/")
public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        String result = "";

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);

            if (word.equals(sb.reverse().toString())) {
                result = word;
                break;
            }
        }

        return result;
    }
}
