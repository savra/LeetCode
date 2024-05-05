package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Shuffle the Array",
        url = "https://leetcode.com/problems/shuffle-the-array/")
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int x = 0, y = n, i = 0; x < n; x++, y++, i += 2) {
            result[i] = nums[x];
            result[i + 1] = nums[y];
        }

        return result;
    }
}
