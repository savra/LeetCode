package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Index of the First Occurrence in a String",
        url = "https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/")
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
