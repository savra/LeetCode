package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Find the Difference of Two Arrays",
        url = "https://leetcode.com/problems/find-the-difference-of-two-arrays")
public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(getDistinctValues(nums1, nums2));
        result.add(getDistinctValues(nums2, nums1));

        return result;
    }

    private List<Integer> getDistinctValues(int[] nums1, int[] nums2) {
        Set<Integer> tmp = new HashSet<>();
        boolean exists;

        for (int j : nums1) {
            exists = false;

            for (int k : nums2) {
                if (j == k) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                tmp.add(j);
            }
        }

        return new ArrayList<>(tmp);
    }
}
