package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Absolute Difference",
        url = "https://leetcode.com/problems/minimum-absolute-difference"
)
public class MinimumAbsoluteDifference {
    //My Time Complexity: O(N * logN)
    //My Space complexity: O(N)
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        int minDifference = Math.abs(arr[1] - arr[0]);

        for (int i = 2; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if (diff < minDifference) {
                minDifference = diff;
            }
        }

        for(int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == minDifference) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i - 1]);
                tmp.add(arr[i]);
                result.add(tmp);
            }
        }

        return result;
    }
}
