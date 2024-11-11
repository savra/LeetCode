package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "The Two Sneaky Numbers of Digitville",
        url = "https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];

        Set<Integer> unique = new HashSet<>();

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (unique.contains(nums[i])) {
                result[j++] = nums[i];
            }

            unique.add(nums[i]);
        }

        return result;
    }
}
