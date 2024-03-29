package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Maximum Number of String Pairs",
        url = "https://leetcode.com/problems/find-maximum-number-of-string-pairs"
)
public class FindMaximumNumberOfStringPairs {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
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
