package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Check If It Is a Straight Line",
        url = "https://leetcode.com/problems/check-if-it-is-a-straight-line"
)
public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] c) {
        int x1 = c[0][0];
        int y1 = c[0][1];

        int x2 = c[1][0];
        int y2 = c[1][1];

        int dX = x2 - x1;
        int dY = y2 - y1;

        for (int i = 2; i < c.length; i++) {
            int x3 = c[i][0];
            int y3 = c[i][1];

            int curDx = x3 - x1;
            int curDy = y3 - y1;

            if (dX * curDy != dY * curDx) {
                return false;
            }
        }

        return true;
    }
}
