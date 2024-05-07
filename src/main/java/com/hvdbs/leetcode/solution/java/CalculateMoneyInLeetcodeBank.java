package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Calculate Money in Leetcode Bank",
        url = "https://leetcode.com/problems/calculate-money-in-leetcode-bank",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)"
)
public class CalculateMoneyInLeetcodeBank {
    public static int totalMoney(int n) {
        int sum = 0;

        for (int i = 1, j = 1, k = 1, l = 1; i <= n; i++, l++) {
            if (l == 7) {
                sum += j;
                j = ++k;
                l = 0;
            } else {
                sum += j++;
            }
        }

        return sum;
    }
}
