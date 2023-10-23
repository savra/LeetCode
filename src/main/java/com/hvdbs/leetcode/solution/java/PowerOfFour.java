package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Power of Four",
        url = "https://leetcode.com/problems/power-of-four"
)
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        long x = 0;
        int i = 0;

        while (x < n) {
            x = (long) Math.pow(4, i);

            if (x == n) {
                return true;
            }

            i++;
        }

        return false;
    }
}
