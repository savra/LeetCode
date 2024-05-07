package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Steps to Reduce a Number to Zero",
        url = "https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/")
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int step = 0;

        while(num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            step++;
        }

        return step;
    }
}
