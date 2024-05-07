package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimize String Length",
        url = "https://leetcode.com/problems/minimize-string-length",
        timeComplexity = "O(N * LogN)",
        spaceComplexity = "O(N)")
public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        int j = 0;
        int resultCount = 1;
        char[] tmp = s.toCharArray();

        Arrays.sort(tmp);

        for (int i = 1; i < tmp.length; i++) {
            if (tmp[i] != tmp[j]) {
                resultCount++;
                j = i;
            }
        }

        return resultCount;
    }
}
