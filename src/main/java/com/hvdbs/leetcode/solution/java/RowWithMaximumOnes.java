package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Row With Maximum Ones",
        url = "https://leetcode.com/problems/row-with-maximum-ones/")
public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        Map<Integer, Integer> res = new HashMap<>();

        int onesCounter;
        int maxOnes = 0;

        for (int i = 0; i < mat.length; i++) {
            onesCounter = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    onesCounter++;
                }
            }

            if (onesCounter > maxOnes) {
                maxOnes = onesCounter;
            }

            res.put(i, onesCounter);
        }

        final int finalMaxOnes = maxOnes;

        Map.Entry<Integer, Integer> e = res.entrySet().stream()
                .filter(entry -> entry.getValue() == finalMaxOnes)
                .min((a, b) -> Integer.compare(a.getKey(), b.getKey()))
                .get();

        return new int[]{e.getKey(), e.getValue()};
    }
}
