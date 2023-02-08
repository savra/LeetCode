package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Unique Morse Code Words",
        url = "https://leetcode.com/problems/unique-morse-code-words/")
public class UniqueMorseCodeWords {
    private static final Map<String, String> alphabet = new HashMap<>();

    static {
        alphabet.put("a", ".-");
        alphabet.put("b", "-...");
        alphabet.put("c", "-.-.");
        alphabet.put("d", "-..");
        alphabet.put("e", ".");
        alphabet.put("f", "..-.");
        alphabet.put("g", "--.");
        alphabet.put("h", "....");
        alphabet.put("i", "..");
        alphabet.put("j", ".---");
        alphabet.put("k", "-.-");
        alphabet.put("l", ".-..");
        alphabet.put("m", "--");
        alphabet.put("n", "-.");
        alphabet.put("o", "---");
        alphabet.put("p", ".--.");
        alphabet.put("q", "--.-");
        alphabet.put("r", ".-.");
        alphabet.put("s", "...");
        alphabet.put("t", "-");
        alphabet.put("u", "..-");
        alphabet.put("v", "...-");
        alphabet.put("w", ".--");
        alphabet.put("x", "-..-");
        alphabet.put("y", "-.--");
        alphabet.put("z", "--..");
    }

    public int uniqueMorseRepresentations(String[] words) {
        return Arrays.stream(words)
                .map(word ->
                        word.chars()
                                .mapToObj(chr -> String.valueOf((char)chr))
                                .map(alphabet::get)
                                .collect(Collectors.joining(""))
                )
                .collect(Collectors.toSet())
                .size();
    }
}
