package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Alternating Digit Sum",
        url = "https://leetcode.com/problems/alternating-digit-sum/")
public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        int multiplier = (int)Math.pow(10, (int)Math.log10(n));
        int sum = 0;
        int i = 2;

        int tmp;
        int rest = n;

        while (multiplier != 0) {
            tmp = rest / multiplier;
            rest %= multiplier;

            if (i % 2 != 0) {
                sum += tmp * -1;
            } else {
                sum += tmp;
            }

            multiplier /= 10;
            i++;
        }

        return sum;
    }
}
