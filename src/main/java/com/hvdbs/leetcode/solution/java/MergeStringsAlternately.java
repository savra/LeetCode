package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Merge Strings Alternately",
        url = "https://leetcode.com/problems/merge-strings-alternately")
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;

        while(!(i == word1.length() && j == word2.length())) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }

            if (j < word2.length()) {
                sb.append(word2.charAt(j++));
            }
        }

        return sb.toString();
    }
}
