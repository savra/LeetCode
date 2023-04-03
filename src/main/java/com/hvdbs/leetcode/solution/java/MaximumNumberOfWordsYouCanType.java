package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Maximum Number of Words You Can Type",
        url = "https://leetcode.com/problems/maximum-number-of-words-you-can-type")
public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int result = 0;
        String[] words = text.split(" ");
        boolean brokenLetter;

        for (String word : words) {
            brokenLetter = false;

            for (int j = 0; j < brokenLetters.length(); j++) {
                if (word.indexOf(brokenLetters.charAt(j)) >= 0 ) {
                    brokenLetter = true;
                    break;
                }
            }

            if (!brokenLetter) {
                result++;
            }
        }

        return result;
    }
}
