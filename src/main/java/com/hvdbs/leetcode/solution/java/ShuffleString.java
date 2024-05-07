package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Shuffle String",
        url = "https://leetcode.com/problems/shuffle-string/description/")
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] tmp = s.toCharArray();
        char[] result = new char[s.length()];

        for (int i = 0; i < tmp.length; i++) {
            result[indices[i]] = tmp[i];
        }

        return String.valueOf(result);
    }
}
