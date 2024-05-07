package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Island Perimeter",
        url = "https://leetcode.com/problems/island-perimeter/")
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int plusSum;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                plusSum = 4;

                if (grid[i][j] == 1) {
                    if (i > 0 && grid[i - 1][j] == 1) {
                        plusSum--;
                    }

                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        plusSum--;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        plusSum--;
                    }

                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        plusSum--;
                    }

                    result += plusSum;
                }
            }
        }

        return result;
    }
}
