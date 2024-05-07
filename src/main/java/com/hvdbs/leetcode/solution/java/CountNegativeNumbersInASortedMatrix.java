package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Count Negative Numbers in a Sorted Matrix",
        url = "https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix")
public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int negativeCount = 0;

        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    negativeCount++;
                } else {
                    break;
                }
            }
        }

        return negativeCount;
    }
}
