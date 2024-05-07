package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Sorting the Sentence",
        url = "https://leetcode.com/problems/sorting-the-sentence/description/")
public class SortingTheSentence {
    String sortSentence(String s) {
        return Arrays.stream(s.split(" ")).sorted(Comparator.comparingInt(o -> o.charAt(o.length() - 1)))
                .map(word -> word.substring(0, word.length() - 1))
                .collect(Collectors.joining(" "));
    }
}
