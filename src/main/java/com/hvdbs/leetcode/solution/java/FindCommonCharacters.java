package com.hvdbs.leetcode.solution.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        String first = words[0];
        List<String> result = new ArrayList<>();

        if (words.length == 1) {
            return first.chars().mapToObj(String::valueOf).collect(Collectors.toList());
        }

        boolean notExists;

        for (int i = 0; i < first.length(); i++) {
            notExists = false;

            for (int j = 1; j < words.length; j++) {
                if (words[j].indexOf(first.charAt(i)) == -1) {
                    notExists = true;
                    break;
                }
            }

            if (!notExists) {
                result.add(String.valueOf(first.charAt(i)));
            }
        }

        return result;
    }
}
