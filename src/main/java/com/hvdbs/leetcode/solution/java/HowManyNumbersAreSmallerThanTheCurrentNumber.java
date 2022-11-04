package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "How Many Numbers Are Smaller Than the Current Number",
        url = "https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number")
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int smallerCount = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            smallerCount = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[j] < nums[i]) {
                    smallerCount++;
                }
            }

            result[i] = smallerCount;
        }

        return result;
    }
}
