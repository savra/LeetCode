package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Add Two Integers",
        url = "https://leetcode.com/problems/add-two-integers/",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)"
)
public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
