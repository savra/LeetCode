package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Remove Element", url = "https://leetcode.com/problems/remove-element/")
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int tmp;

        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }

        for (int i = 0, j = nums.length - 1; i <= j; i++) {
            if (nums[i] == val) {
                while (nums[j] == val && i < j) {
                    j--;
                    result++;
                }

                result++;
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }

        return nums.length - result;

        /* NOT IN-PLACE
        int[] ints = Arrays.stream(nums).filter(value -> value != val).toArray();
        int duplicateCount = nums.length - (nums.length - ints.length);

        System.arraycopy(ints, 0, nums, 0, ints.length);

        return duplicateCount;*/
    }
}
