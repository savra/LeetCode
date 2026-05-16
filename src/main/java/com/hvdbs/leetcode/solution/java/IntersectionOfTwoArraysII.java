package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Intersection of Two Arrays II",
        url = "https://leetcode.com/problems/intersection-of-two-arrays-ii",
        timeComplexity = Complexity.ConstantComplexity.BILINEAR, // O(N + M)
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {/*
        int[] freq1 = new int[1001];
        int[] freq2 = new int[1001];

        for(int i = 0; i < nums1.length; i++) {
            freq1[nums1[i]]++;
        }

        for(int i = 0; i < nums2.length; i++) {
            freq2[nums2[i]]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 1001; i++) {
            int n = Math.min(freq1[i], freq2[i]);
            int j = 0;

            while(j < n) {
                result.add(i);
                j++;
            }
        }*/

        Map<Integer, Integer> tmp = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : nums1) {
            tmp.put(i, tmp.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (tmp.getOrDefault(i, 0) > 0) {
                result.add(i);
                tmp.put(i, tmp.get(i) - 1);
            }
        }

        return result.stream()
                .mapToInt(v -> v)
                .toArray();
    }
}
