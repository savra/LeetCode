package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Lexicographically Smallest Palindrome",
        url = "https://leetcode.com/problems/lexicographically-smallest-palindrome"
)
public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        char[] tmp = s.toCharArray();

        for (int i = 0, j = tmp.length - 1; i < j; i++, j--) {
            if (tmp[i] != tmp[j]) {
                if (tmp[i] > tmp[j]) {
                    tmp[i] = tmp[j];
                } else {
                    tmp[j] = tmp[i];
                }
            }
        }

        return new String(tmp);
    }
}
