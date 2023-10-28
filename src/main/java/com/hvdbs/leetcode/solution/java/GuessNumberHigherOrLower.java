package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Guess Number Higher or Lower",
        url = "https://leetcode.com/problems/guess-number-higher-or-lower")
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int l = 0;
        int h = n;

        while (true) {
            int m = l + (h - l) / 2;

            if (guess(m) == 0) {
                return m;
            } else if (guess(m) == -1) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
    }

    private int guess(int num) {
        return 0;
    }
}
