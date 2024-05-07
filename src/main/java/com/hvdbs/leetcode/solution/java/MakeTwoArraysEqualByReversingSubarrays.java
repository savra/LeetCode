package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Make Two Arrays Equal by Reversing Subarrays",
        url = "https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/")
public class MakeTwoArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        boolean isEqual = true;

        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                isEqual = false;
                break;
            }
        }

        return isEqual;
    }
}
