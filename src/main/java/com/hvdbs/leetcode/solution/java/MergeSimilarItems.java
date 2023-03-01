package com.hvdbs.leetcode.solution.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();

        if (items1.length >= items2.length) {
            mergeItems(items2, items1, result);
        } else {
            mergeItems(items1, items2, result);
        }

        result.sort(Comparator.comparing(o -> o.get(0)));

        return result;
    }

    private void mergeItems(int[][] items1, int[][] items2, List<List<Integer>> result) {
        for (int i = 0; i < items2.length; i++) {
            for (int j = 0; j < items1.length; j++) {
                List<Integer> tmp = new ArrayList<>();
                if (items2[i][0] == items1[j][0]) {

                    tmp.add(items2[i][0]);
                    tmp.add(items2[i][1] + items1[j][1]);

                    result.add(tmp);

                    break;
                }

                if (j == items1.length - 1) {
                    tmp.add(items2[i][0]);
                    tmp.add(items2[i][1]);

                    result.add(tmp);
                }
            }
        }
    }
}
