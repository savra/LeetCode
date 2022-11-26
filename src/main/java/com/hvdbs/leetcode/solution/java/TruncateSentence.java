package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Truncate Sentence",
        url = "https://leetcode.com/problems/truncate-sentence/")
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        return java.util.Arrays.stream(s.split(" "))
                .limit(k)
                .collect(java.util.stream.Collectors.joining(" "));
    }
}
