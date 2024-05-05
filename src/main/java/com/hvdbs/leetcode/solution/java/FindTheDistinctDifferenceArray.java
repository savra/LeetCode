package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Find the Distinct Difference Array",
        url = "https://leetcode.com/problems/find-the-distinct-difference-array")
public class FindTheDistinctDifferenceArray {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> suffix = new HashSet<>();
        Set<Integer> prefix = new HashSet<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                prefix.add(nums[j]);
            }

            for (int j = i + 1; j < nums.length; j++) {
                suffix.add(nums[j]);
            }

            result[i] = prefix.size() - suffix.size();

            prefix.clear();
            suffix.clear();
        }

        return result;
    }
}
