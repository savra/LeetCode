package com.hvdbs.leetcode.solution;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] ints = Arrays.stream(nums).filter(value -> value != val).toArray();
        int duplicateCount = nums.length - (nums.length - ints.length);

        System.arraycopy(ints, 0, nums, 0, ints.length);

        return duplicateCount;
    }
}
