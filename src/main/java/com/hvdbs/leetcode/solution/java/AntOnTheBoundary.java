package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Ant on the Boundary",
        url = "https://leetcode.com/problems/ant-on-the-boundary")
public class AntOnTheBoundary {
    public int returnToBoundaryCount(int[] nums) {
        int antPosition = 0;
        int result = 0;

        for (int num : nums) {
            antPosition += num;

            if (antPosition == 0) {
                result++;
            }
        }

        return result;
    }
}
