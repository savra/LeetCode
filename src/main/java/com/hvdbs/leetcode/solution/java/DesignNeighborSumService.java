package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Design Neighbor Sum Service",
        url = "https://leetcode.com/problems/design-neighbor-sum-service",
        spaceComplexity = Complexity.ConstantComplexity.BILINEAR,
        timeComplexity = Complexity.ConstantComplexity.BILINEAR
)
public class DesignNeighborSumService {
    class NeighborSum {
        private int[][] grid;

        public NeighborSum(int[][] grid) {
            this.grid = grid;
        }

        public int adjacentSum(int value) {
            int result = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == value) {
                        if (i > 0) {
                            result += grid[i - 1][j];
                        }

                        if (i < grid.length - 1) {
                            result += grid[i + 1][j];
                        }

                        if (j > 0) {
                            result += grid[i][j - 1];
                        }

                        if (j < grid[i].length - 1) {
                            result += grid[i][j + 1];
                        }

                        break;
                    }
                }
            }

            return result;
        }

        public int diagonalSum(int value) {
            int result = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == value) {
                        if (i > 0) {
                            if (j > 0) {
                                result += grid[i - 1][j - 1];
                            }

                            if (j < grid[i].length - 1) {
                                result += grid[i - 1][j + 1];
                            }
                        }

                        if (i < grid.length - 1) {
                            if (j > 0) {
                                result += grid[i + 1][j - 1];
                            }

                            if (j < grid[i].length - 1) {
                                result += grid[i + 1][j + 1];
                            }
                        }

                        break;
                    }
                }
            }

            return result;
        }
    }

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
}
