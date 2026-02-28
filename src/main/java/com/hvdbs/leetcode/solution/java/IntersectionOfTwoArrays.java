package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Intersection of Two Arrays",
        url = "https://leetcode.com/problems/intersection-of-two-arrays/",
        timeComplexity = Complexity.ConstantComplexity.LINEAR, // На самом деле O(N+M)
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int j : nums1) {
            set1.add(j);
        }

        for (int j : nums2) {
            if (set1.contains(j)) {
                res.add(j);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
