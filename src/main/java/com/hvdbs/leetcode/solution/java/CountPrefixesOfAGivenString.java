package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Count Prefixes of a Given String",
        url = "https://leetcode.com/problems/count-prefixes-of-a-given-string")
public class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {
        return (int)Arrays.stream(words).filter(s::startsWith).count();
    }
}