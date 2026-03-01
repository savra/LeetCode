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
}
