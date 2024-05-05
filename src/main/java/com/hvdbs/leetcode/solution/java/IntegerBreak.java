package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Integer Break",
        url = "https://leetcode.com/problems/integer-break")
public class IntegerBreak {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int result = 1;

        while (n > 4) {
            result *= 3;
            n -= 3;
        }

        return result * n;
    }
}
