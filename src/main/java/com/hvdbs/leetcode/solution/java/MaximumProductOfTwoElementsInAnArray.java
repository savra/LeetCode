package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum Product of Two Elements in an Array",
        url = "https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/")
public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
    }
}
