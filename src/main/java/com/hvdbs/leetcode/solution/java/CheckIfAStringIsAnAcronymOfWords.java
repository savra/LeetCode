package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check if a String Is an Acronym of Words",
        url = "https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words"
)
public class CheckIfAStringIsAnAcronymOfWords {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();

        for (String str : words) {
            sb.append(str.charAt(0));
        }

        return s.equals(sb.toString());
    }
}
