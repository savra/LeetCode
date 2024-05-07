package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Richest Customer Wealth",
        url = "https://leetcode.com/problems/richest-customer-wealth/")
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int[] wealths = new int[accounts.length];
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j ++) {
                wealths[i] += accounts[i][j];
            }
        }

        for (int i = 0; i < wealths.length; i++) {
            maxWealth = Math.max(maxWealth, wealths[i]);
        }

        return maxWealth;
    }

    public static int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(acc -> Arrays.stream(acc).sum()).max().getAsInt();
    }
}
