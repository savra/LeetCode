package com.hvdbs.leetcode.solution.java;

import java.util.Arrays;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int sum = Arrays.stream(nums).reduce(0, Integer::sum) / nums.length;

        int min = Math.min(sum, k);

        for (int i = 0; i < nums.length; i++) {
            nums[i] += min;
        }

        return Arrays.stream(nums).reduce(0, Integer::sum);
    }
}
