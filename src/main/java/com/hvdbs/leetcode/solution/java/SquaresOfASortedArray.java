package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Squares of a Sorted Array",
        url = "https://leetcode.com/problems/squares-of-a-sorted-array/")
public class SquaresOfASortedArray {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
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
