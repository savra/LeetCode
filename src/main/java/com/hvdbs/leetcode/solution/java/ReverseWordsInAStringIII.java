package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Reverse Words in a String III",
        url = "https://leetcode.com/problems/reverse-words-in-a-string-iii/description/")
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
