package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Reverse String",
        url = "https://leetcode.com/problems/reverse-string",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class ReverseString {
    public void reverseString(char[] s) {
        reverse(0, s.length - 1, s);

        /*char tmp;

        for(int i = 0, j = s.length - 1; i < j; i++, j--) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }*/
    }

    private void reverse(int i, int j, char[] source) {
        if (i >= j) {
            return;
        }

        char tmp = source[i];
        source[i] = source[j];
        source[j] = tmp;

        reverse(i + 1, j - 1, source);
    }
}
