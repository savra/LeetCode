package com.hvdbs.leetcode.solution.java;

public class CheckIfNumbersAreAscendingInASentence {
    public static boolean areNumbersAscending(String s) {
        String tmp = s.replaceAll("[^0-9]", "");

        for (int i = 1; i < tmp.length(); i++) {
            if (tmp.charAt(i) <= tmp.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
    }
}
