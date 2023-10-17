package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Intersection of Two Arrays II",
        url = "https://leetcode.com/problems/intersection-of-two-arrays-ii"
)
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int k : nums1) {
            m.put(k, m.getOrDefault(k, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int j : nums2) {
            Integer tmp = m.get(j);
            if (tmp != null) {
                result.add(j);

                if (tmp == 1) {
                    m.remove(j);
                } else {
                    m.put(j, --tmp);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
