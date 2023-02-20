package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Reverse String",
        url = "https://leetcode.com/problems/reverse-string")
public class ReverseString {
    public void reverseString(char[] s) {
        int middleElem = s.length / 2;

        char tmp;

        for(int i = 0, j = s.length - 1; i < middleElem && j >= middleElem; i++, j--) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
