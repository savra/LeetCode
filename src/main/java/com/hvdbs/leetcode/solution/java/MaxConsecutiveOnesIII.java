package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Max Consecutive Ones III",
        url = "https://leetcode.com/problems/max-consecutive-ones-iii/description/",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int l = 0;
        int answer = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[l] == 0) {
                    zeroCount--;
                }

                l++;
            }

            answer = Math.max(answer, r - l + 1);
        }

        return answer;
    }
}
