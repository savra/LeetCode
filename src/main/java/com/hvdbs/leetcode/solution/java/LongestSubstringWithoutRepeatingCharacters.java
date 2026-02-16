package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Longest Substring Without Repeating Characters",
        url = "https://leetcode.com/problems/longest-substring-without-repeating-characters",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        Set<Character> window = new HashSet<>();

        int i = 0, j = 0;
        int maxLength = 0;

        while (i < n) {
            char currentChar = s.charAt(i);

            while (window.contains(currentChar)) {
                window.remove(s.charAt(j));
                j++;
            }

            window.add(currentChar);
            maxLength = Math.max(maxLength, i - j + 1);
            i++;
        }

        return maxLength;
    }
}
