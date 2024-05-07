package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Odd Numbers in an Interval Range",
        url = "https://leetcode.com/problems/count-odd-numbers-in-an-interval-range")
public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        int tmp = high - low + 1;

        if (tmp % 2 == 0 || high % 2 == 0) {
            return tmp / 2;
        }

        return tmp / 2 + 1;
    }
}
