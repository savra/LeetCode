package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Maximum Achievable Number",
        url = "https://leetcode.com/problems/find-the-maximum-achievable-number")
public class FindTheMaximumAchievableNumber {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public int theMaximumAchievableX(int num, int t) {
        return num + (2 * t);
    }
}
