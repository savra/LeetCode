package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Squares of a Sorted Array",
        url = "https://leetcode.com/problems/squares-of-a-sorted-array/")
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(v -> v * v).sorted().toArray();
    }
}
