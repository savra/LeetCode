package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Valid Mountain Array",
        url = "https://leetcode.com/problems/valid-mountain-array/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class ValidMountainArray {
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
