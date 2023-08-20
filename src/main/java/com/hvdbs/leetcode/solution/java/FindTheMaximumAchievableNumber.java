package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Maximum Achievable Number",
        url = "https://leetcode.com/problems/find-the-maximum-achievable-number"
)
public class FindTheMaximumAchievableNumber {
    public int theMaximumAchievableX(int num, int t) {
        return num + (2 * t);
    }
}
