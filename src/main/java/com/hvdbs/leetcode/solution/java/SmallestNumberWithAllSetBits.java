package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Smallest Number With All Set Bits",
        url = "https://leetcode.com/problems/smallest-number-with-all-set-bits",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT)
public class SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {
        for (int i = 1; i <= 10; i++) {
            int p = (int) Math.pow(2, i);

            if (p > n) {
                return p - 1;
            }
        }

        return 0;
    }
}
