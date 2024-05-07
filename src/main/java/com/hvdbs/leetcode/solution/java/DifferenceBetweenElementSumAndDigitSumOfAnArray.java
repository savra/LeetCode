package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Difference Between Element Sum and Digit Sum of an Array",
        url = "https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/")
public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int sum = java.util.Arrays.stream(nums).sum();

        int digitSum = java.util.Arrays.stream(nums)
                .flatMap(num -> String.valueOf(num).chars())
                .map(Character::getNumericValue)
                .sum();

        return Math.abs(sum - digitSum);
    }
}
