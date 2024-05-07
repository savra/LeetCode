package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Set Matrix Zeroes",
        url = "https://leetcode.com/problems/set-matrix-zeroes")
public class SetMatrixZeroes {
    public void setZeroes(int[][] m) {
        boolean firstColumnsZero = false;

        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == 0) {
                firstColumnsZero = true;
            }
            for (int j = 1; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    m[i][0] = 0;
                    m[0][j] = 0;
                }
            }
        }

        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = m[i].length - 1; j >= 1; j--) {
                if (m[i][0] == 0 || m[0][j] == 0) {
                    m[i][j] = 0;
                }
            }

            if (firstColumnsZero) {
                m[i][0] = 0;
            }
        }
    }
}
