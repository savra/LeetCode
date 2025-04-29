package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://leetcode.com/problems/reverse-degree-of-a-string",
        name = "Reverse Degree of a String",
        difficulty = Difficulty.EASY)
public class ReverseDegreeOfAString {
    public int reverseDegree(String s) {
        int multiplier = 'a' + 26;

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += (multiplier - s.charAt(i)) * (i + 1);
        }

        return result;
    }
}
