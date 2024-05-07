package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Count Pairs Of Similar Strings",
        url = "https://leetcode.com/problems/count-pairs-of-similar-strings")
public class CountPairsOfSimilarStrings {
    public int similarPairs(String[] words) {
        Set<Character> tmp1 = new HashSet<>();
        Set<Character> tmp2 = new HashSet<>();
        int result = 0;

        for (int i = 0; i < words.length; i++) {
            tmp1.addAll(words[i].chars().mapToObj(chr -> (char) chr).toList());

            for (int j = i + 1; j < words.length; j++) {
                tmp2.clear();
                tmp2.addAll(words[j].chars().mapToObj(chr -> (char) chr).toList());

                if (tmp1.size() == tmp2.size() && tmp1.containsAll(tmp2)) {
                    result++;
                }
            }

            tmp1.clear();
        }

        return result;
    }
}
