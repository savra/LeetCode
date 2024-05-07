package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Final Prices With a Special Discount in a Shop",
        url = "https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/")
public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];

            for(int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    price -= prices[j];
                    break;
                }
            }

            result[i] = price;
        }

        return result;
    }
}
