package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.MEDIUM,
        name = "Strictly Palindromic Number",
        url = "https://leetcode.com/problems/strictly-palindromic-number/description/")
public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        int radix = 2;
        String base;
        StringBuilder sb;

        do {
            base = Integer.toString(n, radix);
            sb = new StringBuilder(base).reverse();
            radix++;
        } while (radix <= n - 2 && base.equals(sb.toString()));

        return base.equals(sb.toString());
    }
}
