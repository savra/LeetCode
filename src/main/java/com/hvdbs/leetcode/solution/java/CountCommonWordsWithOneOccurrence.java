package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Count Common Words With One Occurrence",
        url = "https://leetcode.com/problems/count-common-words-with-one-occurrence/")
public class CountCommonWordsWithOneOccurrence {
    public static int countWords(String[] words1, String[] words2) {
        Map<String, Long> map1 = Arrays.stream(words1).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        Map<String, Long> map2 = Arrays.stream(words2).collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        return map1.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1 && Objects.equals(entry.getValue(), map2.get(entry.getKey())))
                .toList()
                .size();
    }
}
