package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Count the Number of Vowel Strings in Range",
        url = "https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/")
public class CountTheNumberOfVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {
        Set<Character> vowels = Collections.unmodifiableSet(new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u')));
        int result = 0;

        for (int i = left; i <= right; i++) {
            if (vowels.contains(words[i].charAt(0))
                    && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                result++;
            }
        }

        return result;
    }
}
