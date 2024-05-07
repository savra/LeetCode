package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Binary Search",
        url = "https://leetcode.com/problems/binary-search")
public class BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int m;

        while (l <= h) {
            m = l + (h - l) / 2;

            if (target == nums[m]) {
                return m;
            } else if (target < nums[m]) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}
