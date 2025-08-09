package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Cost to Reach Every Position",
        url = "https://leetcode.com/problems/minimum-cost-to-reach-every-position",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class MinimumCostToReachEveryPosition {
    public int[] minCosts(int[] cost) {
        int minCost = cost[0];
        int[] result = new int[cost.length];

        for (int i = 0; i < cost.length; i++) {
            if (cost[i] < minCost) {
                result[i] = cost[i];
                minCost = cost[i];
            } else {
                result[i] = minCost;
            }
        }

        return result;
    }
}
