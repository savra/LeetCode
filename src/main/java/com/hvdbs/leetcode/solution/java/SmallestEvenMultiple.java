package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Smallest Even Multiple",
        url = "https://leetcode.com/problems/smallest-even-multiple/")
public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        int result = 0;

        for (int i = n; i <= Integer.MAX_VALUE; i++) {
            if (i % n == 0 && i % 2 == 0) {
                result = i;
                break;
            }
        }

        return result;
    }
}
