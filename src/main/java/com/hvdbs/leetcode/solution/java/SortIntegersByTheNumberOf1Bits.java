package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Comparator;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Sort Integers by The Number of 1 Bits",
        url = "https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/")
public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(Integer::bitCount).thenComparingInt(a -> a))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
