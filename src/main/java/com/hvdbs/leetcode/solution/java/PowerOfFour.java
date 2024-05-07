package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Power of Four",
        url = "https://leetcode.com/problems/power-of-four")
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
       /* long x = 0;
        int i = 0;

        while (x < n) {
            x = (long)Math.pow(4, i);

            if (x == n) {
                return true;
            }

            i++;
        }

        return false;*/

        if (n == 1) {
            return true;
        }

        if (n <= 0) {
            return false;
        }

        double logarithmBase4 = Math.log(n) / Math.log(4);

        return (logarithmBase4 == (int)logarithmBase4);
    }
}
