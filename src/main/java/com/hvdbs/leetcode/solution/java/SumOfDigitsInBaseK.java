package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Sum of Digits in Base K",
        url = "https://leetcode.com/problems/sum-of-digits-in-base-k")
public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        String s = Integer.toString(n, k);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += Character.getNumericValue(s.charAt(i));
        }

        return result;
    }
}
