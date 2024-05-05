package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Robot Return to Origin",
        url = "https://leetcode.com/problems/robot-return-to-origin",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int[] m = new int[4];

        if (moves.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                m[0]++;
            } else if (moves.charAt(i) == 'D') {
                m[1]++;
            } else if (moves.charAt(i) == 'L') {
                m[2]++;
            } else {
                m[3]++;
            }
        }

        return m[0] == m[1] && m[2] == m[3];
    }
}
