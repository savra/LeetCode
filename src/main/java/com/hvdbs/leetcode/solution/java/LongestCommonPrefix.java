package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Longest Common Prefix",
        url = "https://leetcode.com/problems/longest-common-prefix",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC)
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);

        String target = strs[0];
        String lastStr = strs[strs.length - 1];

        int i = 0, j = 0;
        int maxPrefix = 0;

        while (i < target.length() && j < lastStr.length()) {
            if (target.charAt(i) != lastStr.charAt(j)) {
                break;
            } else {
                maxPrefix++;
            }
            i++;
            j++;
        }

        return target.substring(0, maxPrefix);
    }

    // TC O(N * M) SC O(1)
    public String longestCommonPrefix2(String[] strs) {
        String target = strs[0];

        if (strs.length == 1) {
            return target;
        }

        int maxPrefix = 0x7fffffff;

        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            int curPrefix = 0;

            while (j < strs[i].length()
                    && j < target.length()
                    && strs[i].charAt(j) == target.charAt(j)) {
                curPrefix++;
                j++;
            }

            maxPrefix = Math.min(maxPrefix, curPrefix);
        }

        return target.substring(0, maxPrefix);
    }
}
