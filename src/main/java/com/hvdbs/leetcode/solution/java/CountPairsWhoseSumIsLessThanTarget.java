package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Pairs Whose Sum is Less than Target",
        url = "https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(1)")
public class CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    result++;
                }
            }
        }

        return result;
    }
}
