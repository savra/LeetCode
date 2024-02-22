package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Number of Changing Keys",
        url = "https://leetcode.com/problems/number-of-changing-keys")
public class NumberOfChangingKeys {
    public int countKeyChanges(String s) {
        String upperCaseSourceString = s.toUpperCase();
        int result = 0;

        for (int i = 1; i < upperCaseSourceString.length(); i++) {
            if (upperCaseSourceString.charAt(i) != upperCaseSourceString.charAt(i - 1)) {
                result++;
            }
        }

        return result;
    }
}
