package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Maximum Number of Words Found in Sentences", url = "https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/")
public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        return java.util.Arrays.stream(sentences)
                .mapToInt(sentence -> sentence.split(" ").length)
                .max()
                .getAsInt();
    }
}
