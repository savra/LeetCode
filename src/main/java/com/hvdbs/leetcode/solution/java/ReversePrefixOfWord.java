package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Reverse Prefix of Word",
        url = "https://leetcode.com/problems/reverse-prefix-of-word/description/")
public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int chrPosition = word.indexOf(ch);

        if (chrPosition != -1) {
            StringBuilder sb = new StringBuilder(word.substring(0, chrPosition + 1));
            String reversed = sb.reverse().toString();

            return reversed + word.substring(chrPosition + 1);
        } else {
            return word;
        }
    }
}
