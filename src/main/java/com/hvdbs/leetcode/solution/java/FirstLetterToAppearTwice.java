package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "First Letter to Appear Twice",
        url = "https://leetcode.com/problems/first-letter-to-appear-twice/")
public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        char result = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                result = chars[i];
                break;
            }
        }

        return result;
    }
}
