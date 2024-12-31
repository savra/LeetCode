package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Substrings That Satisfy K-Constraint I",
        url = "https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.QUADRATIC
)
public class CountSubstringsThatSatisfyKConstraintI {
    public int countKConstraintSubstrings(String s, int k) {
        int zeroCount = 0;
        int oneCount = 0;
        int result = 0;

        int i = 0;
        int length = s.length();

        while (i < length) {
            int j = i;

            while (j < length) {
                if (s.charAt(j) == '1') {
                    oneCount++;
                } else {
                    zeroCount++;
                }

                if (zeroCount > k && oneCount > k) {
                    break;
                } else {
                    result++;
                }

                j++;
            }

            i++;
            zeroCount = 0;
            oneCount = 0;
        }

        return result;
    }
}
