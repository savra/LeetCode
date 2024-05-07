package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Faulty Keyboard",
        url = "https://leetcode.com/problems/faulty-keyboard",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(N)")
public class FaultyKeyboard {
    public static String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar != 'i') {
                sb.append(currentChar);
            } else {
                sb.reverse();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(finalString("poiinter"));
    }
}
