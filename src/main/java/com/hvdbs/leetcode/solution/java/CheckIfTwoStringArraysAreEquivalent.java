package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Check If Two String Arrays are Equivalent",
        url = "https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/")
public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
