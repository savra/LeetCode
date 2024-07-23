package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Integer Added to Array I",
        url = "https://leetcode.com/problems/find-the-integer-added-to-array-i",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N * LogN)"

)
public class FindTheIntegerAddedToArrayI {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int diff;
        int result = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (result != 0) {
                if (nums1[i] + result != nums2[i]) {
                    return result;
                }

                continue;
            }

            diff = nums2[i] - nums1[i];

            if (nums1[i] + diff == nums2[i]) {
                result = diff;
            } else {
                if (nums1[i] - diff == nums2[i]) {
                    result = -diff;
                }
            }

        }

        return result;
    }
}
