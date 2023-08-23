package com.hvdbs.leetcode.solution.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringsBySeparator {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        return words.stream()
                .flatMap(s ->
                        Arrays.stream(s.split("[^a-z]"))
                                .filter(s1 -> !s1.isEmpty()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        splitWordsBySeparator(Arrays.asList("one.two.three", "four.five", "six"), '.');
    }
}
