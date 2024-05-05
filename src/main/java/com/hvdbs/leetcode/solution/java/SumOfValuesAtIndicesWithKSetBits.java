package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Sum of Values at Indices With K Set Bits",
        url = "https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class SumOfValuesAtIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }
}
