package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Fibonacci Number",
        url = "https://leetcode.com/problems/fibonacci-number/")
public class FibonacciNumber {
    public int fib(int n) {
        return n == 0 || n == 1 ? n : fib(n - 2) + fib(n - 1);
    }
}
