package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Maximum Average Subarray I",
        url = "https://leetcode.com/problems/maximum-average-subarray-i/description/",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        difficulty = Difficulty.EASY
)
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] n, int k) {
        int currentAvg = 0;
        double globalAvg = 0x80000000;

        for (int i = 0; i < n.length; i++) {
            currentAvg += n[i];

            int j = i - k + 1;

            if (j >= 0) {
                globalAvg = Math.max(globalAvg, currentAvg / (double) k);

                currentAvg -= n[j];
            }
        }

        return globalAvg;
    }
}
