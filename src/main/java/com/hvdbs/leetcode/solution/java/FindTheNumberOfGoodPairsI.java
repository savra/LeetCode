package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Number of Good Pairs I",
        url = "https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N * M)"
)
public class FindTheNumberOfGoodPairsI {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int result = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
