package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "XOR Operation in an Array",
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
