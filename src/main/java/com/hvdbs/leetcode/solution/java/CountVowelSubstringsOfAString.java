package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Vowel Substrings of a String",
        url = "https://leetcode.com/problems/count-vowel-substrings-of-a-string/description/")
public class CountVowelSubstringsOfAString {
    public int countVowelSubstrings(String word) {
        Set<Character> chars = new HashSet<>();
        int res = 0;

        for (int i = 0; i < word.length(); i++) {
            int j = i;

            while (j < word.length()) {
                char c = word.charAt(j);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    chars.add(c);

                    if (chars.size() >= 5) {
                        res++;
                    }

                    j++;
                } else {
                    break;
                }
            }

            chars.clear();
        }

        return res;
    }
}
