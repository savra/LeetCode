package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum String Length After Removing Substrings",
        url = "https://leetcode.com/problems/minimum-string-length-after-removing-substrings",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        int prevSize = 0;
        int currentSize = s.length();
        String tmp = s;

        while(currentSize != prevSize) {
            prevSize = currentSize;
            tmp = tmp.replaceAll("(AB)|(CD)", "");
            currentSize = tmp.length();
        }

        return currentSize;
    }
}
