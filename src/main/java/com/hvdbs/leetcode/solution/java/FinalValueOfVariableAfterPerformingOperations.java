package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Final Value of Variable After Performing Operations", url = "https://leetcode.com/problems/final-value-of-variable-after-performing-operations/")
public class FinalValueOfVariableAfterPerformingOperations {
    private static final String prefixIncrement = "++X";
    private static final String postfixIncrement = "X++";
    private static final String prefixDecrement = "--X";
    private static final String postfixDecrement = "X--";

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (int i = 0; i < operations.length; i++) {
            switch(operations[i]) {
                case prefixIncrement:
                case postfixIncrement:
                    ++result;
                    break;
                default:
                    --result;
            }
        }

        return result;
    }
}
