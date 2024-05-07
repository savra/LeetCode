package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Intersection of Two Arrays",
        url = "https://leetcode.com/problems/intersection-of-two-arrays/")
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {;
        Set<Integer> first = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        first.retainAll(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));

        return first.stream().mapToInt(Integer::intValue).toArray();
    }
}
