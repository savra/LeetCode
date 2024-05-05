package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Can Make Arithmetic Progression From Sequence",
        url = "https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence",
        timeComplexity = "O(N * LogN)",
        spaceComplexity = "O(1)"
)
public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int step = Math.abs(arr[1] - arr[0]);

        for (int i = 2; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) != step) {
                return false;
            }
        }

        return true;
    }
}
