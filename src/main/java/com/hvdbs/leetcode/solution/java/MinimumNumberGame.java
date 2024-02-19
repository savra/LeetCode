package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Number Game",
        url = "https://leetcode.com/problems/minimum-number-game")
public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];

        Arrays.sort(nums);

        for (int i = 0, j = 1, k = 0; j < nums.length; i += 2, j += 2) {
            arr[k++] = nums[j];
            arr[k++] = nums[i];
        }

        return arr;
    }
}
