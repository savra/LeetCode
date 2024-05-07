package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Merge Two 2D Arrays by Summing Values",
        url = "https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/")
public class MergeTwo2DArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> tmp = new HashMap<>();

        for (int[] ints : nums1) {
            tmp.put(ints[0], tmp.getOrDefault(ints[0], 0) + ints[1]);
        }

        for (int[] ints : nums2) {
            tmp.put(ints[0], tmp.getOrDefault(ints[0], 0) + ints[1]);
        }

        int[][] result = new int[tmp.size()][2];

        int i = 0;

        for(Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();

            i++;
        }

        Arrays.sort(result, Comparator.comparingInt(res -> res[0]));

        return result;
    }
}
