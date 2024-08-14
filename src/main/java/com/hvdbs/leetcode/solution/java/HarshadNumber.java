package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Harshad Number",
        url = "https://leetcode.com/problems/harshad-number",
        timeComplexity = Complexity.ConstantComplexity.LOGARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}
