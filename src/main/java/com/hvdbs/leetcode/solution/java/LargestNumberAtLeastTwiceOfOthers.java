package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Largest Number At Least Twice of Others",
        url = "https://leetcode.com/problems/largest-number-at-least-twice-of-others/")
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }

            if (max == nums[i]) {
                maxIndex = i;
            } else if (!(max / nums[i] >= 2)) {
                return -1;
            }
        }

        return maxIndex;
    }
}
