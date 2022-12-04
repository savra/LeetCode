package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.stream.IntStream;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Sort the People",
        url = "https://leetcode.com/problems/sort-the-people/")
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        return IntStream.range(0, heights.length)
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(names[i], heights[i]))
                .sorted(Comparator.comparingInt((AbstractMap.SimpleEntry<String, Integer> value) -> value.getValue()).reversed())
                .map(AbstractMap.SimpleEntry::getKey)
                .toArray(String[]::new);
    }
}
