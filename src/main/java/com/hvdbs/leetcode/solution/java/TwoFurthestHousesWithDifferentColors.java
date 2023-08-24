package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Two Furthest Houses With Different Colors",
        url = "https://leetcode.com/problems/two-furthest-houses-with-different-colors"
)
public class TwoFurthestHousesWithDifferentColors {
    public int maxDistance(int[] colors) {
        int result = 0;

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    int min = Math.abs(j - i);

                    if (result < min) {
                        result = min;
                    }
                }
            }
        }

        return result;
    }
}
