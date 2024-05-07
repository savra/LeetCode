package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.*;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Diagonal Traverse",
        url = "https://leetcode.com/problems/diagonal-traverse")
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        int rowsCount = mat.length;
        int columnsCount = mat[0].length;

        int[] res = new int[rowsCount * columnsCount];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                map.computeIfAbsent(i + j, k -> new ArrayList<>());
                map.get(i + j).add(mat[i][j]);
            }
        }

        int indx = 0;

        for (int i = 0; i < rowsCount + columnsCount - 1; i++) {
            List<Integer> tmp = map.get(i);

            if (i % 2 == 0) {
                Collections.reverse(tmp);
            }

            for (int item : tmp) {
                res[indx++] = item;
            }
        }

        return res;
    }
}
