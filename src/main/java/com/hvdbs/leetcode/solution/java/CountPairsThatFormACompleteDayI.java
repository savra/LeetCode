package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Pairs That Form a Complete Day I",
        url = "https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i",
        timeComplexity = Complexity.ConstantComplexity.QUADRATIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class CountPairsThatFormACompleteDayI {
    public int countCompleteDayPairs(int[] hours) {
        if (hours.length <= 1) {
            return 0;
        }

        int countPairs = 0;

        for (int i = 0; i < hours.length - 1; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    countPairs++;
                }
            }
        }

        return countPairs;
    }
}
