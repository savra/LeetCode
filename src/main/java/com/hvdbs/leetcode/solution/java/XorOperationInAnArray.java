package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "XOR Operation in an Array",
        url = "https://leetcode.com/problems/xor-operation-in-an-array/description/")
public class XorOperationInAnArray {
    public int xorOperation(int n, int start) {
        int result = start;

        for (int i = 1; i < n; i++) {
            result ^= (start + 2 * i);
        }

        return result;
    }
}
