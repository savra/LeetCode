package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Even and Odd Bits",
        url = "https://leetcode.com/problems/number-of-even-and-odd-bits")
public class NumberOfEvenAndOddBits {
    public int[] evenOddBit(int n) {
        int[] result = new int[2];

        int evenCount = 0;
        int oddCount = 0;

        String binaryString = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (i % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        result[0] = evenCount;
        result[1] = oddCount;

        return result;
    }
}
