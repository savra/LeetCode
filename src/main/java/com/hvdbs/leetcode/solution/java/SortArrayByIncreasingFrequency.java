package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Sort Array by Increasing Frequency",
        url = "https://leetcode.com/problems/sort-array-by-increasing-frequency")
public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Long> frequencyTable = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));

        return IntStream.of(nums).boxed()
                .sorted(Comparator.comparingLong(frequencyTable::get)
                        .thenComparing((o1, o2) -> Integer.compare((int) o2, (int) o1)))
                .mapToInt(value -> value)
                .toArray();
    }
}
