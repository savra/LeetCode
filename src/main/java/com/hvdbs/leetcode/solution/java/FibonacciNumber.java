package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Fibonacci Number",
        url = "https://leetcode.com/problems/fibonacci-number/",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.CUBIC /*timeComplexity - 2^n*/
)
public class FibonacciNumber {
    public int fib(int n) {
        return n == 0 || n == 1 ? n : fib(n - 2) + fib(n - 1);
    }
}
