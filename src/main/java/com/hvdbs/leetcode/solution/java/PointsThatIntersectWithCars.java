package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Points That Intersect With Cars",
        url = "https://leetcode.com/problems/points-that-intersect-with-cars",
        timeComplexity = "O(N * M)",
        spaceComplexity = "O(N)")
public class PointsThatIntersectWithCars {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();

        for (List<Integer> l : nums) {
            int end = l.get(1);

            for (int i = l.get(0); i <= end; i++) {
                set.add(i);
            }
        }

        return set.size();
    }
}
