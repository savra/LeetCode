package com.hvdbs.leetcode.solution.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> weightMap = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            weightMap.put(arr2[i], i);
        }

        return Arrays.stream(arr1)
                .boxed()
                .sorted(Comparator.comparing(weightMap::get, Comparator.nullsLast(Comparator.reverseOrder())))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] ints = relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});
    }
}
