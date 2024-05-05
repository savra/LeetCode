package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Number of 1 Bits",
        url = "https://leetcode.com/problems/number-of-1-bits",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
