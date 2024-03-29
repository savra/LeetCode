package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Faulty Keyboard",
        url = "https://leetcode.com/problems/faulty-keyboard"
)
public class FaultyKeyboard {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(n)
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
