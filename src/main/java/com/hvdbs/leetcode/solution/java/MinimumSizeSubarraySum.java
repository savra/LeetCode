package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Minimum Size Subarray Sum",
        url = "https://leetcode.com/problems/minimum-size-subarray-sum")
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        if (nums.length == 1) {
            if (target <= nums[0]) {
                return 1;
            } else {
                return 0;
            }
        }

        int curSum = nums[0];

        if (curSum >= target) {
            return 1;
        }

        boolean addTailSum = true;

        for (int i = 0, j = 1; j <= nums.length - 1;) {
            if (addTailSum) {
                curSum += nums[j];
            }

            if (curSum < target) {
                j++;
                addTailSum = true;
            } else {
                if (j - i + 1 <= minLength) {
                    minLength = j - i + 1;
                }

                curSum -= nums[i];
                addTailSum = false;

                i++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
