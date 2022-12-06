package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Count the Number of Consistent Strings",
        url = "https://leetcode.com/problems/count-the-number-of-consistent-strings/")
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistCount = 0;
        boolean consist = true;

        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (allowed.indexOf(word.charAt(j)) == -1) {
                    consist = false;
                    break;
                }
            }

            if (consist) {
                consistCount++;
            }

            consist = true;
        }

        return consistCount;
    }
}
