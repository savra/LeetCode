package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Remove Duplicates from Sorted Array",
        url = "https://leetcode.com/problems/remove-duplicates-from-sorted-array/",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int prev = 0, cur = 1;

        while (cur < nums.length) {
            while (cur < nums.length && nums[prev] == nums[cur]) {
                cur++;
            }

            prev++;

            if (cur == nums.length) {
                break;
            }

            nums[prev] = nums[cur];
        }

        return prev;
    }

    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1, 1, 1});
    }
}
