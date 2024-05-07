package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Determine if String Halves Are Alike",
        url = "https://leetcode.com/problems/determine-if-string-halves-are-alike/")
public class DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(firstHalf.length());
        Pattern pattern = Pattern.compile("[^aeiouAEIOU]");

        return pattern.matcher(firstHalf).replaceAll("").length() == pattern.matcher(secondHalf).replaceAll("").length();
    }

    public static void main(String[] args) {
        halvesAreAlike("book");
    }
}
