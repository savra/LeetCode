package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Sum of Unique Elements",
        url = "https://leetcode.com/problems/sum-of-unique-elements/")
public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int[] result = new int[101];
        int sumOfUnique = 0;

        for (int num : nums) {
            result[num]++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                sumOfUnique += i;
            }
        }

        return sumOfUnique;
    }
}
