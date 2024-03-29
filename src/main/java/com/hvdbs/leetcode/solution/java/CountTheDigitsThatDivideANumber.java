package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Count the Digits That Divide a Number",
        url = "https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/")
public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int lastDigit;
        int shortNumber = num;
        int countDigit = 0;

        while (shortNumber != 0) {
            lastDigit = shortNumber % 10;
            shortNumber /= 10;

            if (num % lastDigit == 0) {
                countDigit++;
            }
        }

        return countDigit;
    }
}
