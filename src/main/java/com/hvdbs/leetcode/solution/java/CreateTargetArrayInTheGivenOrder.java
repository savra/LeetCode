package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Create Target Array in the Given Order",
        url = "https://leetcode.com/problems/create-target-array-in-the-given-order/description/")
public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int[] copy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                System.arraycopy(target, 0, copy, 0, index[i]);
                copy[index[i]] = nums[i];
                System.arraycopy(target, index[i], copy, index[i] + 1, (target.length - index[i]) - 1);
                System.arraycopy(copy, 0, target, 0, copy.length);
            } else {
                target[index[i]] = nums[i];
            }
        }

        return target;
    }
}
