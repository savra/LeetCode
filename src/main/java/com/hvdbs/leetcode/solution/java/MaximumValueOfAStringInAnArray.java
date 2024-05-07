package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Comparator;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum Value of a String in an Array",
        url = "https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/")
public class MaximumValueOfAStringInAnArray {
    public int maximumValue(String[] strs) {
        int maxValue = 0;

        for (int i = 0; i < strs.length; i++) {
            try {
                int tmp = Integer.parseInt(strs[i]);

                if (tmp > maxValue) {
                    maxValue = tmp;
                }

                strs[i] = Integer.toString(tmp);
            } catch (NumberFormatException ignored) {
            }
        }

        Arrays.sort(strs, Comparator.comparingInt(String::length).reversed());

        int result;

        try {
            result = Integer.parseInt(strs[0]);
        } catch(NumberFormatException e) {
            result = strs[0].length();
        }

        return Math.max(result, maxValue);
    }
}
