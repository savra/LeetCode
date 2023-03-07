package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Check if Word Equals Summation of Two Words",
        url = "https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/")
public class CheckIfWordEqualsSummationOfTwoWords {
    private static final int A_CODE = 97;

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convertToNumber(firstWord) + convertToNumber(secondWord) == convertToNumber(targetWord);
    }

    private int convertToNumber(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            sb.append((int)word.charAt(i) - A_CODE);
        }

        return Integer.parseInt(sb.toString());
    }
}
