package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Buy Two Chocolates",
        url = "https://leetcode.com/problems/buy-two-chocolates")
public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int sumTwoChocolates = prices[0] + prices[1];

        return sumTwoChocolates > money ? money : money - sumTwoChocolates;
    }
}
