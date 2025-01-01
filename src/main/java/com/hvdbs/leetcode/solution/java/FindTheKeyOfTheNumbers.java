package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Key of the Numbers",
        url = "https://leetcode.com/problems/find-the-key-of-the-numbers",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT)
public class FindTheKeyOfTheNumbers {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb = new StringBuilder();

        String strNum1 = padding(num1);
        String strNum2 = padding(num2);
        String strNum3 = padding(num3);

        for (int i = 0; i < 4; i++) {
            sb.append((char) Math.min(Math.min(strNum1.charAt(i), strNum2.charAt(i)), strNum3.charAt(i)));
        }

        return Integer.parseInt(sb.toString());
    }


    private String padding(int num) {
        String stringValue = String.valueOf(num);

        return "0".repeat(4 - stringValue.length()) + stringValue;
    }
}
