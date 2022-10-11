package com.hvdbs.leetcode.solution;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Remove Element", url = "https://leetcode.com/problems/remove-element/")
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] ints = Arrays.stream(nums).filter(value -> value != val).toArray();
        int duplicateCount = nums.length - (nums.length - ints.length);

        System.arraycopy(ints, 0, nums, 0, ints.length);

        return duplicateCount;
    }
}
