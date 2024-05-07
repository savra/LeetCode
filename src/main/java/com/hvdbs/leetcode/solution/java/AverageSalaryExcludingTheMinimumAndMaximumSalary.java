package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Average Salary Excluding the Minimum and Maximum Salary",
        url = "https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary"
)
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        long sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : salary) {
            if (max < i) {
                max = i;
            }

            if (min > i) {
                min = i;
            }

            sum += i;
        }

        return (double) (sum - max - min) / (salary.length - 2);
    }
}
