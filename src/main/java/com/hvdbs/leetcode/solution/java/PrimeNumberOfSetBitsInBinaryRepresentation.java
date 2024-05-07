package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Prime Number of Set Bits in Binary Representation",
        url = "https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/")
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                result++;
            }
        }

        return result;
    }

    private boolean isPrime(int source) {
        int divCount = 0;

        if (source == 1) {
            return false;
        }

        for (int i = 1; i <= source; i++) {
            if (source % i == 0) {
                divCount++;
            }
        }

        return divCount <= 2;
    }
}
