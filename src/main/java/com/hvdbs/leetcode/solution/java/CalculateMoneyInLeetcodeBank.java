package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Calculate Money in Leetcode Bank",
        url = "https://leetcode.com/problems/calculate-money-in-leetcode-bank"
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
