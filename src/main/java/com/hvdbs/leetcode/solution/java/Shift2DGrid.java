package com.hvdbs.leetcode.solution.java;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        int m = grid.length;

        int n = grid[0].length;

        for(int l = 0; l < k; l++) {
            for (int i = 0; i < m; i++) {
                for(int j = 0; j < n - 1; j++) {
                    result.get(i).add(grid[i][j]);
                }
                if (i + 1 < m) {
                    result.add(new ArrayList<>());
                    result.get(i + 1).add(0, grid[i][n - 1]);
                }
            }
        }

        result.get(0).add(0, grid[m - 1][n - 1]);

        return result;
    }

    public static void main(String[] args) {
        shiftGrid(new int[][]{{1,2,3}, {4,5,6},{7,8,9}}, 1);
    }
}
