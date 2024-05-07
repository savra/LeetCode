package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Square Sum Triples",
        url = "https://leetcode.com/problems/count-square-sum-triples")
public class CountSquareSumTriples {
    public int countTriples(int n) {
        int result = 0;

        for (int i = n; i >= 3; i--) {
            for (int j = i - 1; j >= 2; j--) {
                for (int k = j - 1; k >= 1; k--) {
                    if (Math.pow(i, 2) == (Math.pow(j, 2) + Math.pow(k, 2))) {
                        result += 2;
                    }
                }
            }
        }

        return result;
    }
}
