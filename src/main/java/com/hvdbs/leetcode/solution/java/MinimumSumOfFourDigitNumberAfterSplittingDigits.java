package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Sum of Four Digit Number After Splitting Digits",
        url = "https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/")
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        int[] ints = Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::valueOf)
                .sorted().toArray();

        int firstNumber = Integer.parseInt(ints[0] + String.valueOf(ints[2]));
        int secondNumber = Integer.parseInt(ints[1] + String.valueOf(ints[3]));

        return firstNumber + secondNumber;
    }
}
