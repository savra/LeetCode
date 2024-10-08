package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Add Binary",
        url = "https://leetcode.com/problems/add-binary",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class AddBinary {
    public String addBinary(String a, String b) {
        boolean isMemorized = false;
        StringBuilder result = new StringBuilder();

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            char chr1 = i < 0 ? '0' : a.charAt(i);
            char chr2 = j < 0 ? '0' : b.charAt(j);

            if (chr1 == '0' && chr2 == '0') {
                if (isMemorized) {
                    result.insert(0, '1');
                    isMemorized = false;
                } else {
                    result.insert(0, '0');
                }
            } else if (chr1 == '1' && chr2 == '1') {
                if (isMemorized) {
                    result.insert(0, '1');
                } else {
                    result.insert(0, '0');
                    isMemorized = true;
                }
            } else {
                if (isMemorized) {
                    result.insert(0, '0');
                } else {
                    result.insert(0, '1');
                }
            }
        }

        if (isMemorized) {
            result.insert(0, '1');
        }

        return result.toString();
    }
}
