package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Repeated Substring Pattern",
        url = "https://leetcode.com/problems/repeated-substring-pattern")
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) {
            return false;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                String str = s.substring(0, i);

                for (int j = 0; j < s.length(); j += str.length()) {
                    sb.append(str);
                }

                if (sb.toString().equals(s)) {
                    return true;
                } else {
                    sb.setLength(0);
                }
            }
        }

        return false;
    }
}
