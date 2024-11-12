package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Convert Date to Binary",
        url = "https://leetcode.com/problems/convert-date-to-binary/",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        String[] splitted = date.split("-");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitted.length; i++) {
            int currentDateSegment = Integer.parseInt(splitted[i]);

            sb.append(Integer.toBinaryString(currentDateSegment));

            if (i != splitted.length - 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }
}
