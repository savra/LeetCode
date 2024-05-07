package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Spiral Matrix",
        url = "https://leetcode.com/problems/spiral-matrix/")
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0, rowEnd = matrix.length - 1;
        int columnStart = 0, columnEnd = matrix[0].length - 1;
        int currentElemCount = 0, totalElemCount = matrix.length * matrix[0].length;

        List<Integer> result = new ArrayList<>();

        while(rowStart <= rowEnd) {
            for(int i = columnStart; i <= columnEnd; i++){
                result.add(matrix[rowStart][i]);
                currentElemCount++;
            }

            if (currentElemCount == totalElemCount) {
                break;
            }

            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][columnEnd]);
                currentElemCount++;
            }

            if (currentElemCount == totalElemCount) {
                break;
            }

            columnEnd--;

            for(int i = columnEnd; i >= columnStart; i--) {
                result.add(matrix[rowEnd][i]);
                currentElemCount++;
            }

            if (currentElemCount == totalElemCount) {
                break;
            }

            rowEnd--;

            for(int i = rowEnd; i >= rowStart; i--) {
                result.add(matrix[i][columnStart]);
                currentElemCount++;
            }

            if (currentElemCount == totalElemCount) {
                break;
            }

            columnStart++;
        }

        return result;
    }
}
