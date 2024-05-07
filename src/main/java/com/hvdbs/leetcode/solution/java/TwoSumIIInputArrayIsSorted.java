package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Two Sum II - Input Array Is Sorted",
        url = "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(1)")
public class TwoSumIIInputArrayIsSorted {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;

                    return result;
                }
            }
        }

        return result;
    }
}
