package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "DI String Match",
        url = "https://leetcode.com/problems/di-string-match/")
public class DiStringMatch {
    public int[] diStringMatch(String s) {
        int min = 0;
        int max = s.length();
        int[] result = new int[max + 1];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min++;
            } else {
                result[i] = max--;
            }
        }

        if (s.charAt(s.length() - 1) == 'I') {
            result[result.length - 1] = min;
        } else {
            result[result.length - 1] = max;
        }

        return result;
    }
}
