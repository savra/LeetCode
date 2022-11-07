package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Check if the Sentence Is Pangram",
        url = "https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/")
public class CheckIfTheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        return sentence.chars()
                .distinct()
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .collect(Collectors.joining())
                .matches("[a-z]{26}");
    }
}
