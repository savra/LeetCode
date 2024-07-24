package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Number of Chairs in a Waiting Room",
        url = "https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)"
)
public class MinimumNumberOfChairsInAWaitingRoom {
    public int minimumChairs(String s) {
        int tmp = 0;
        int max = 0;

        for (Character c : s.toCharArray()) {
            if (c == 'E') {
                tmp++;
            } else {
                max = Math.max(tmp, max);
                tmp--;
            }
        }

        return Math.max(tmp, max);
    }
}
