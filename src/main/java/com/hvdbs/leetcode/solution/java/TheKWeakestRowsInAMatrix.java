package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.*;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "The K Weakest Rows in a Matrix",
        url = "https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix")
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int soldiersCount = 1;
        List<Map.Entry<Integer, Integer>> matrixStat = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldiersCount++;
                }
            }

            matrixStat.add(new java.util.AbstractMap.SimpleEntry<>(i, soldiersCount));
            soldiersCount = 1;
        }

        return matrixStat.stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().thenComparing(Map.Entry::getKey))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
