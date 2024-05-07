package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Plus One",
        url = "https://leetcode.com/problems/plus-one")
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int memory = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                memory++;
            } else {
                digits[i]++;
                memory = 0;
                break;
            }
        }

        if (memory >= 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);

            return res;
        } else {
            return digits;
        }
    }
}
