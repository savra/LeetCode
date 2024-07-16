package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Permutation Difference between Two Strings",
        url = "https://leetcode.com/problems/permutation-difference-between-two-strings",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return result;
    }
}
