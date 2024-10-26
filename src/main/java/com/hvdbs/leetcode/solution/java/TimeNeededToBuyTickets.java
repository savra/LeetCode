package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Time Needed to Buy Tickets",
        url = "https://leetcode.com/problems/time-needed-to-buy-tickets",
        timeComplexity = Complexity.ConstantComplexity.BILINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;

        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0 && tickets[k] != 0) {
                    tickets[i]--;
                    result++;
                }
            }
        }

        return result;
    }
}
