package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Words Containing Character",
        url = "https://leetcode.com/problems/find-words-containing-character")
public class FindWordsContainingCharacter {
    //TC: O(N * M(length of words)), SC: O(N)
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        if (words == null || words.length == 0) {
            return result;
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }

        return result;
    }
}
