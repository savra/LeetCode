package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Set;

@CodeInfo(
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://leetcode.com/problems/find-most-frequent-vowel-and-consonant",
        name = "Find Most Frequent Vowel and Consonant",
        difficulty = Difficulty.EASY
)
public class FindMostFrequentVowelAndConsonant {
    public int maxFreqSum(String s) {
        int[] lettersFrequency = new int[26];
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int maxVowelsFrequency = 0;
        int maxConsonantFrequency = 0;

        for (char c : s.toCharArray()) {
            lettersFrequency[c - 'a']++;
        }

        for (int i = 0; i < lettersFrequency.length; i++) {
            if (vowels.contains((char) ('a' + i))) {
                if (lettersFrequency[i] > maxVowelsFrequency) {
                    maxVowelsFrequency = lettersFrequency[i];
                }
            } else {
                if (lettersFrequency[i] > maxConsonantFrequency) {
                    maxConsonantFrequency = lettersFrequency[i];
                }
            }
        }

        return maxConsonantFrequency + maxVowelsFrequency;
    }

}
