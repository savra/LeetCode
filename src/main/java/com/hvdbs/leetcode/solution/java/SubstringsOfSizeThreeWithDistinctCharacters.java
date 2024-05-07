package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Substrings of Size Three with Distinct Characters",
        url = "https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters")
public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        char[] tmp = new char[3];
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            tmp[j++] = s.charAt(i);

            for (int k = i + 1; k < s.length() && j <= 2; k++, j++) {
                tmp[j] = s.charAt(k);
            }

            if (tmp[0] != tmp[1] && tmp[0] != tmp[2] && tmp[1] != tmp[2]) {
                result++;
            }
        }

        return result;
    }
}
