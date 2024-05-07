package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Truncate Sentence",
        url = "https://leetcode.com/problems/truncate-sentence/")
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        return java.util.Arrays.stream(s.split(" "))
                .limit(k)
                .collect(java.util.stream.Collectors.joining(" "));
    }
}
