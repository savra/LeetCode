package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Two Sum",
        url = "https://leetcode.com/problems/two-sum/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class TwoSum {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = t - nums[i];

            if (m.containsKey(diff)) {
                return new int[]{i, m.get(diff)};
            }

            m.put(nums[i], i);
        }

        return null;
    }
}
