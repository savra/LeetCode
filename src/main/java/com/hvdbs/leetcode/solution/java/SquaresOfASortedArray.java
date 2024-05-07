package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Squares of a Sorted Array",
        url = "https://leetcode.com/problems/squares-of-a-sorted-array/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int resIndx = nums.length - 1;
        int[] result = new int[nums.length];

        int i = 0, j = nums.length - 1;

        while (i <= j) {
            if (Math.abs(nums[j]) >= Math.abs(nums[i])) {
                result[resIndx--] = nums[j] * nums[j];
                j--;
            } else {
                result[resIndx--] = nums[i] * nums[i];
                i++;
            }
        }

        return result;
    }
}
