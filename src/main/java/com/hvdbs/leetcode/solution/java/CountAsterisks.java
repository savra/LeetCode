package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Count Asterisks",
        url = "https://leetcode.com/problems/count-asterisks/")
public class CountAsterisks {
    public int countAsterisks(String s) {
        String[] source = s.split("\\|");
        int result = 0;

        for (int i = 0; i < source.length; i += 2) {
            result += source[i].replaceAll("[^*]", "").length();
        }

        return result;
    }
}
