package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Length of Last Word",
        url = "https://leetcode.com/problems/length-of-last-word")
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (s.charAt(i) == ' ') { i--; }

        int j = s.lastIndexOf(' ', i);

        return j == -1 ? i + 1 : i - j;
    }
}
