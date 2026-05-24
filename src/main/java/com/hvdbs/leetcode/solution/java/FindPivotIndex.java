package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Pivot Index",
        url = "https://leetcode.com/problems/find-pivot-index",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = prefix[i];
            int rightSum = prefix[prefix.length - 1] - prefix[i + 1];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
