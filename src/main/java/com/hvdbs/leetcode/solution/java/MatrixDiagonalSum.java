package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Matrix Diagonal Sum",
        url = "https://leetcode.com/problems/matrix-diagonal-sum/description/")
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sumPd = 0;
        int sumSd = 0;
        int result = 0;

        for (int i = 0, j = 0; i < mat.length; i++, j++) {
            sumPd += mat[i][j];
        }

        for (int i = 0, j = mat[i].length - 1; i < mat.length; i++, j--) {
            sumSd += mat[i][j];
        }

        result = sumPd + sumSd;

        if (mat.length % 2 != 0) {
            result -= mat[mat.length / 2][mat.length / 2];
        }

        return result;
    }
}
