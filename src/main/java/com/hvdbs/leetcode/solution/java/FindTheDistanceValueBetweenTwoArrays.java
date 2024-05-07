package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Distance Value Between Two Arrays",
        url = "https://leetcode.com/problems/find-the-distance-value-between-two-arrays")
public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        boolean wasError;

        for (int i = 0; i < arr1.length; i++) {
            wasError = false;

            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    wasError = true;
                    break;
                }
            }

            if (!wasError) {
                res++;
            }
        }

        return res;
    }
}
