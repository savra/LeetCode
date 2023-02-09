package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Counting Words With a Given Prefix",
        url = "https://leetcode.com/problems/counting-words-with-a-given-prefix/")
public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words).filter(word -> word.startsWith(pref)).count();
    }
}
