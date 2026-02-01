package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Best Time to Buy and Sell Stock",
        url = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n <= 1) {
            return 0;
        }

        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }
}
