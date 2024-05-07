package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Check if All Characters Have Equal Number of Occurrences",
        url = "https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/")
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            Integer currentValue = result.get(s.charAt(i));

            if (currentValue == null) {
                result.put(s.charAt(i), 1);
            } else {
                result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
            }
        }

        Integer firstElementCount = result.get(s.charAt(0));

        for (Integer v : result.values()) {
            if (v.intValue() != firstElementCount.intValue()) {
                return  false;
            }
        }

        return true;
    }
}
