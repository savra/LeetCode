package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Sum of Digits of String After Convert",
        url = "https://leetcode.com/problems/sum-of-digits-of-string-after-convert",
        timeComplexity = Complexity.ConstantComplexity.BILINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }

        int j = 0;
        String result = sb.toString();

        while (j < k) {
            result = sumDigits(result);
            j++;
        }

        return Integer.parseInt(result);
    }

    private String sumDigits(String n) {
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }

        return String.valueOf(sum);
    }
}
