package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Add Two Integers",
        url = "https://leetcode.com/problems/add-two-integers/",
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
