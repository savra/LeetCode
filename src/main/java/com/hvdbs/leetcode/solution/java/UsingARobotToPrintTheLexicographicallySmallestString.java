package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.MEDIUM,
        name = "Using a Robot to Print the Lexicographically Smallest String",
        url = "https://leetcode.com/problems/find-the-original-array-of-prefix-xor/submissions/892451074/")
public class UsingARobotToPrintTheLexicographicallySmallestString {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];

        for (int i = 0; i < pref.length; i++) {
            if (i == 0) {
                arr[i] = pref[i];
                continue;
            }

            arr[i] = pref[i - 1] ^ pref[i];
        }

        return arr;
    }
}
