package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Average of Smallest and Largest Elements",
        url = "https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements",
        spaceComplexity = "O(N / 2)",
        timeComplexity = "O(N * LogN)"
)
public class MinimumAverageOfSmallestAndLargestElements {
    public double minimumAverage(int[] nums) {
        int n = nums.length / 2;
        double[] averages = new double[n];
        Arrays.sort(nums);

        for (int i = 0, j = nums.length - 1; i < n; i++, j--) {
            averages[i] = (nums[i] + nums[j]) / 2.0;
        }

        Arrays.sort(averages);

        return averages[0];
    }
}
