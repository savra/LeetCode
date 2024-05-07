package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Maximum Number of String Pairs",
        url = "https://leetcode.com/problems/find-maximum-number-of-string-pairs",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(1)")
public class FindMaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairCount = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].charAt(0) == words[j].charAt(1)
                        && words[i].charAt(1) == words[j].charAt(0)) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}
