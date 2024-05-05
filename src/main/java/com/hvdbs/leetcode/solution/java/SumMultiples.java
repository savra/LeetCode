package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Sum Multiples",
        url = "https://leetcode.com/problems/sum-multiples/")
public class SumMultiples {
    public int sumOfMultiples(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
            i++;
        }

        return sum;
    }
}
