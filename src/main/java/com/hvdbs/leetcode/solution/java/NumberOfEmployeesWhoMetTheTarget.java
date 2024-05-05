package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Employees Who Met the Target",
        url = "https://leetcode.com/problems/number-of-employees-who-met-the-target/description/")
public class NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                result++;
            }
        }

        return result;
    }
}
