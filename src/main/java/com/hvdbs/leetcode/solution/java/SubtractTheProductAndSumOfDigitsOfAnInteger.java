package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Subtract the Product and Sum of Digits of an Integer",
        url = "https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/")
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        char[] source = String.valueOf(n).toCharArray();
        int sum = 0;
        int product = 1;

        for (int i = 0; i < source.length; i++) {
            int tmp = Integer.parseInt(String.valueOf(source[i]));

            sum += tmp;
            product *= tmp;
        }

        return product - sum;
    }
}
