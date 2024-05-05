package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Keyboard Row",
        url = "https://leetcode.com/problems/keyboard-row/")
public class KeyboardRow {
    private static final Set<Character> FIRST_ROW = "qwertyuiop".chars().mapToObj(chr -> (char) chr).collect(Collectors.toSet());
    private static final Set<Character> SECOND_ROW = "asdfghjkl".chars().mapToObj(chr -> (char) chr).collect(Collectors.toSet());
    private static final Set<Character> THIRD_ROW = "zxcvbnm".chars().mapToObj(chr -> (char) chr).collect(Collectors.toSet());

    public String[] findWords(String[] words) {
        Set<Character> tmp = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (String word : words) {
            tmp.addAll(word.toLowerCase().chars().mapToObj(value -> (char) value).collect(Collectors.toSet()));

            if (FIRST_ROW.containsAll(tmp) || SECOND_ROW.containsAll(tmp) || THIRD_ROW.containsAll(tmp)) {
                result.add(word);
            }

            tmp.clear();
        }

        return result.toArray(String[]::new);
    }
}
