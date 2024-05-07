package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Common Factors",
        url = "https://leetcode.com/problems/number-of-common-factors/description/")
public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int commonFactors = 0;

        int minValue = Math.min(a, b);

        for (int i = 1; i <= minValue; i++) {
            if (a % i == 0 && b % i == 0) {
                commonFactors++;
            }
        }

        return commonFactors;
    }
}
