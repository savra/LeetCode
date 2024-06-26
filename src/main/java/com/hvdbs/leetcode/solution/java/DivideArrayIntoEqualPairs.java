package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Divide Array Into Equal Pairs",
        url = "https://leetcode.com/problems/divide-array-into-equal-pairs/")
public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        int pairsCount = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                pairsCount++;
            }
        }

        return pairsCount == nums.length / 2;
    }
}
