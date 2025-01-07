package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Sum of Encrypted Integers",
        url = "https://leetcode.com/problems/find-the-sum-of-encrypted-integers",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += encrypt(num);
        }

        return sum;
    }


    private int encrypt(int x) {
        int max = 0;
        int digitCount = 0;

        while (x > 0) {
            digitCount++;
            max = Math.max(x % 10, max);

            x /= 10;
        }

        return Integer.parseInt(String.valueOf(max).repeat(digitCount));
    }
}
