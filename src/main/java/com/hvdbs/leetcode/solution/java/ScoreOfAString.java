package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Score of a String",
        url = "https://leetcode.com/problems/score-of-a-string",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)"
)
public class ScoreOfAString {
    public int scoreOfString(String s) {
        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            result += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return result;
    }
}
