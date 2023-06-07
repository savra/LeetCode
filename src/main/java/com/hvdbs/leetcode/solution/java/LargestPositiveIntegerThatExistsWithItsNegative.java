package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Largest Positive Integer That Exists With Its Negative",
        url = "https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/")
public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            int tmp = nums[i] * -1;

            if (tmp > 0) {
                break;
            }

            for (int num : nums) {
                if (tmp == num) {
                    return tmp * -1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        findMaxK(new int[] {-1,2,-3,3});
    }
}
