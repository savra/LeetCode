package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Apply Operations to an Array",
        url = "https://leetcode.com/problems/apply-operations-to-an-array")
public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != 0) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    break;
                }
            }
        }

        return nums;
    }
}
