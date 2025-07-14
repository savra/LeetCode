package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Best Time to Buy and Sell Stock II",
        url = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 1) {
            return 0;
        }

        int prev = 0, cur = 1, maxProfit = 0;

        while (cur < n) {
            if (prices[cur] < prices[prev]) {
                cur++;
                prev++;
            } else {
                if (cur == n - 1) {
                    maxProfit += prices[cur] - prices[prev];
                    break;
                }
                if (prices[cur + 1] >= prices[cur]) {
                    cur++;
                } else {
                    maxProfit += prices[cur] - prices[prev];
                    prev = cur + 1;
                    cur += 2;
                }
            }
        }

        return maxProfit;
    }
}
