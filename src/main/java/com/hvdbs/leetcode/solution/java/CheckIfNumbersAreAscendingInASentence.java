package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check if Numbers Are Ascending in a Sentence",
        url = "https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence"
)
public class CheckIfNumbersAreAscendingInASentence {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
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
