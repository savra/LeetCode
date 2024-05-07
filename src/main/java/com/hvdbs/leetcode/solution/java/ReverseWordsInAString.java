package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Reverse Words in a String",
        url = "https://leetcode.com/problems/reverse-words-in-a-string")
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length() - 1;

        int wordEndPos;
        int wordStartPos;

        for (int i = n; i >= 0;) {
            while(i >= 0 && s.charAt(i) == ' ') { i--; }
            wordEndPos = i;

            while(i >= 0 && s.charAt(i) != ' ') { i--; }
            wordStartPos = i;

            result.append(s, wordStartPos + 1, wordEndPos + 1).append(' ');
        }

        int j = result.length() - 1;

        while (result.charAt(j) == ' ') {
            result.deleteCharAt(j);
            j--;
        }

        return result.toString();
    }
}
