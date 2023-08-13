package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check If N and Its Double Exist",
        url = "https://leetcode.com/problems/check-if-n-and-its-double-exist"
)
public class CheckLfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }

                if (arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
