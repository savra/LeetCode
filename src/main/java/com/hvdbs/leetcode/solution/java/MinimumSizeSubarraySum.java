package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Minimum Size Subarray Sum",
        url = "https://leetcode.com/problems/minimum-size-subarray-sum",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;

        int minLength = 0x7fffffff;
        int sum = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                minLength = Math.min(r - l + 1, minLength);

                sum -= nums[l];
                l++;
            }
        }

        return minLength == 0x7fffffff ? 0 : minLength;
    }
}
