package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Maximum Odd Binary Number",
        url = "https://leetcode.com/problems/maximum-odd-binary-number")
public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        if (s.length() == 1) {
            return s;
        }

        int oneCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i < oneCount - 1) {
                sb.append('1');
                continue;
            }

            if (sb.length() == s.length() - 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}
