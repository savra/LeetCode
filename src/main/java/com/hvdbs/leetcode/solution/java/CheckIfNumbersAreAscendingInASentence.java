package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check if Numbers Are Ascending in a Sentence",
        url = "https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class CheckIfNumbersAreAscendingInASentence {
    public static boolean areNumbersAscending(String s) {
        int prevNumber = 0;
        String[] tmp = s.split(" ");

        for (String str: tmp) {
            try {
                int currentNumber = Integer.parseInt(str);

                if (currentNumber <= prevNumber) {
                    return false;
                } else {
                    prevNumber = currentNumber;
                }
            } catch (NumberFormatException e) {
                //ignored
            }
        }

        return true;
    }

    public static void main(String[] args) {
        areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
    }
}
