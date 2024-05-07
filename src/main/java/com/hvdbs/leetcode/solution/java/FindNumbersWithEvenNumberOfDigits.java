package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find Numbers with Even Number of Digits",
        url = "https://leetcode.com/problems/find-numbers-with-even-number-of-digits/")
public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        return (int)Arrays.stream(nums)
                .filter(num -> (int)(Math.log10(num) + 1) % 2 == 0)
                .count();
    }
}
