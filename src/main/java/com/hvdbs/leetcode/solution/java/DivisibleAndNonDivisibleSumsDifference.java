package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Divisible and Non-divisible Sums Difference",
        url = "https://leetcode.com/problems/divisible-and-non-divisible-sums-difference")
public class DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
}
