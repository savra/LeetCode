package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Construct the Minimum Bitwise Array I",
        url = "https://leetcode.com/problems/construct-the-minimum-bitwise-array-i",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.BILINEAR)
public class ConstructTheMinimumBitwiseArrayI {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        int j = 0;

        for (Integer num : nums) {
            int i = 0;

            while (i <= num - 1) {
                int temp = i | (i + 1);

                if (temp == num) {
                    ans[j] = i;
                    break;
                }

                i++;
            }

            if (ans[j] == 0) {
                ans[j] = -1;
            }

            j++;
        }

        return ans;
    }
}
