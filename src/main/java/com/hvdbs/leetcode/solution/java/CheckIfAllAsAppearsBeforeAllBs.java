package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Check if All A's Appears Before All B's",
        url = "https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/")
public class CheckIfAllAsAppearsBeforeAllBs {
    public boolean checkString(String s) {
        boolean wasB = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                if (wasB) {
                    return false;
                }
            } else {
                wasB = true;
            }
        }

        return true;
    }
}
