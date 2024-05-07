package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum Number of Pairs in Array",
        url = "https://leetcode.com/problems/maximum-number-of-pairs-in-array/")
public class MaximumNumberOfPairsInArray {
    public int[] numberOfPairs(int[] nums) {
        int[] result = new int[2];

        if (nums.length == 1) {
            result[1] = 1;

            return result;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] >= 0 && nums[j] >= 0 && nums[i] == nums[j]) {
                    nums[i] = nums[j] = -1;
                    result[0]++;
                }
            }
        }

        result[1] = (int)Arrays.stream(nums).filter(i -> i >= 0).count();

        return result;
    }
}
