package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Two Sum II - Input Array Is Sorted",
        url = "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted",
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
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

    //My Time Complexity: O(N LogN)
    //My Space complexity: O(1)
    public int[] twoSum2(int[] numbers, int target) {
        int i = 0, j = 1;

        while (i < numbers.length && j < numbers.length) {
            int subTarget = target - numbers[i];

            int l = i + 1;
            int r = numbers.length - 1;

            if (r - l == 0) {
                if (numbers[i] + numbers[r] == target) {
                    return new int[]{i + 1, r + 1};
                } else {
                    return null;
                }
            }

            while (l <= r) {
                int m = l + (r - l) / 2;
                int mVal = numbers[m];
                if (mVal == subTarget) {
                    return new int[]{i + 1, m + 1};
                } else if (mVal < subTarget) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }

            i++;
            j++;

        }

        return null;
    }
}
