package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Number of Lines To Write String",
        url = "https://leetcode.com/problems/number-of-lines-to-write-string")
public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int width = 0;
        int rowCount = 0;

        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';

            if (width + widths[pos] <= 100) {
                width += widths[pos];
            } else {
                width = widths[pos];
                rowCount++;
            }
        }

        return new int[]{rowCount + 1, width};
    }
}
