package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum 69 Number",
        url = "https://leetcode.com/problems/maximum-69-number/")
public class Maximum69Number {
    public int maximum69Number (int num) {
        char[] chars = String.valueOf(num).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(chars));
    }
}
