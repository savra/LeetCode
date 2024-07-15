package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Minimum Operations to Make All Elements Divisible by Three",
        url = "https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (num % 3 == 0) {
                continue;
            }

            result++;
        }

        return result;
    }
}
