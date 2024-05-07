package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Next Greater Element I",
        url = "https://leetcode.com/problems/next-greater-element-i")
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        boolean isEqual;
        int targetElem;

        for (int i = 0; i < nums1.length; i++) {
            isEqual = false;
            targetElem = -1;

            for (int k : nums2) {
                if (nums1[i] == k) {
                    isEqual = true;
                }

                if (isEqual && nums1[i] < k) {
                    targetElem = k;
                    break;
                }
            }

            result[i] = targetElem;
        }

        return result;
    }
}
