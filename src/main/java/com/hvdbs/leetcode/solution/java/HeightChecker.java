package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Height Checker",
        url = "https://leetcode.com/problems/height-checker")
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];

        System.arraycopy(expected, 0, heights, 0, heights.length);

        Arrays.sort(expected);

        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                result++;
            }
        }

        return result;
    }
}
