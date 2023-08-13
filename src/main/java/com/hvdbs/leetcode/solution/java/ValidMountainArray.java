package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Valid Mountain Array",
        url = "https://leetcode.com/problems/valid-mountain-array/")
public class ValidMountainArray {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }

        int lastValue = arr[0];
        boolean IsIncrease = false;
        boolean IsDecrease = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lastValue) {
                if (!IsIncrease && !IsDecrease) {
                    IsIncrease = true;
                }
                if (IsDecrease) {
                    return false;
                }
                lastValue = arr[i];
            } else if (arr[i] < lastValue) {
                if (IsIncrease) {
                    IsDecrease = true;
                    IsIncrease = false;
                    lastValue = arr[i];
                    continue;
                }
                if (IsDecrease) {
                    lastValue = arr[i];
                }
            } else {
                return false;
            }
        }

        return !IsIncrease && IsDecrease;
    }
}
