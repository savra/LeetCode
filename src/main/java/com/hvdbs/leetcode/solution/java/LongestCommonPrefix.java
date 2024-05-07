package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Longest Common Prefix",
        url = "https://leetcode.com/problems/longest-common-prefix")
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int longestCount = 0, j = 0;

        boolean wasIncrement = false;

        while (j < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                wasIncrement = false;

                if (j < strs[i].length()) {
                    wasIncrement = true;
                    if (strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                        return strs[0].substring(0, longestCount);
                    }
                } else {
                    break;
                }
            }
            j++;

            if (wasIncrement) {
                longestCount++;
            }
        }

        return strs[0].substring(0, longestCount);
    }
}
