package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find the Highest Altitude",
        url = "https://leetcode.com/problems/find-the-highest-altitude/description/")
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;

        for (int i = 1; i <= gain.length; i++) {
            altitudes[i] = altitudes[i - 1] + gain[i - 1];
        }

        return Arrays.stream(altitudes)
                .max()
                .getAsInt();
    }
}
