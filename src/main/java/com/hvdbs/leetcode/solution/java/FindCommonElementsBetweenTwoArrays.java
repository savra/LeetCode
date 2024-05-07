package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Common Elements Between Two Arrays",
        url = "https://leetcode.com/problems/find-common-elements-between-two-arrays")
public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];

        result[0] = countCommonElements(nums1, nums2);
        result[1] = countCommonElements(nums2, nums1);

        return result;
    }


    private int countCommonElements(int[] nums1, int[] nums2) {
        int result = 0;

        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}
