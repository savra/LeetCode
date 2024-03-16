package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Missing and Repeated Values",
        url = "https://leetcode.com/problems/find-missing-and-repeated-values")
public class FindMissingAndRepeatedValues {
    //TC: O(N), SC: O(N)
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];

        if (grid == null || grid.length == 0) {
            return ans;
        }

        Set<Integer> tmp = new HashSet<>();

        for (int[] i : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (tmp.contains(i[j])) {
                    ans[0] = i[j];
                }

                tmp.add(i[j]);
            }
        }

        int n = grid.length * grid.length;

        for (int i = 1; i <= n; i++) {
            if (!tmp.contains(i)) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
