package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Two Out of Three",
        url = "https://leetcode.com/problems/two-out-of-three")
public class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());

        Set<Integer> result = new HashSet<>();

        result.addAll(intersect(set1, set2, set3));
        result.addAll(intersect(set2, set1, set3));
        result.addAll(intersect(set3, set1, set2));

        return new ArrayList<>(result);
    }

    Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> result = new HashSet<>();

        for (Integer i : set1) {
            if (set2.contains(i) || set3.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
