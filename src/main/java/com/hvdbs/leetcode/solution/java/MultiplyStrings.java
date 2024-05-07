package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.MEDIUM,
        name = "Multiply Strings",
        url = "https://leetcode.com/problems/multiply-strings")
public class MultiplyStrings {
    public String multiply(String n1, String n2) {
        int l1 = n1.length();
        int l2 = n2.length();

        int[] result = new int[l1 + l2];

        for (int i = l1 - 1; i >= 0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                result[i + j + 1] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
            }
        }

        int memory = 0;

        for (int i = result.length - 1; i >= 0; i--) {
            int tmp = (result[i] + memory) % 10;
            memory = (result[i] + memory) / 10;
            result[i] = tmp;
        }

        StringBuilder sb = new StringBuilder();

        for (int i : result) {
            sb.append(i);
        }

        while (sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
