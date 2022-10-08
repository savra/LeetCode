package com.hvdbs.leetcode.solution;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Palindrome Number", url = "https://leetcode.com/problems/palindrome-number/")
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x >= -9 && x < 0) {
            return false;
        }

        if (x >= 0 && x <= 9) {
            return true;
        }

        char[] tmp = String.valueOf(x).toCharArray();

        int middleElement = tmp.length / 2;

        for(int i = 0, j = tmp.length - 1; i < Math.floor(middleElement) && j >= Math.ceil(middleElement); i++, j--) {
            if (tmp[i] != tmp[j]) {
                return false;
            }
        }

        return true;
    }
}
