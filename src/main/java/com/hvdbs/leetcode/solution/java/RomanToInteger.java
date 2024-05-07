package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Roman to Integer",
        url = "https://leetcode.com/problems/roman-to-integer")
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0, j = 1; j <= s.length(); i++, j++) {
            if (s.charAt(i) == 'I') {
                if (j < s.length()) {
                    if (s.charAt(j) == 'V') {
                        result += 4;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'X') {
                        result += 9;
                        i++;
                        j++;
                    } else {
                        result += 1;
                    }
                } else {
                    result += 1;
                }
            } else if (s.charAt(i) == 'X') {
                if (j < s.length()) {
                    if (s.charAt(j) == 'L') {
                        result += 40;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'C') {
                        result += 90;
                        i++;
                        j++;
                    } else {
                        result += 10;
                    }
                } else {
                    result += 10;
                }
            } else if (s.charAt(i) == 'C') {
                if (j < s.length()) {
                    if (s.charAt(j) == 'D') {
                        result += 400;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'M') {
                        result += 900;
                        i++;
                        j++;
                    } else {
                        result += 100;
                    }
                } else {
                    result += 100;
                }
            } else if (s.charAt(i) == 'V') {
                result += 5;
            } else if (s.charAt(i) == 'L') {
                result += 50;
            } else if (s.charAt(i) == 'D') {
                result += 500;
            } else if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}
