package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Nearest Point That Has the Same X or Y Coordinate",
        url = "https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class FindNearestPointThatHasTheSameXOrYCoordinate {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int smallestManhattan = Integer.MAX_VALUE;
        int smallestManhattanIndex = -1;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int manhattanValue = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);

                if (manhattanValue < smallestManhattan) {
                    smallestManhattan = manhattanValue;
                    smallestManhattanIndex = i;
                }
            }
        }

        return smallestManhattanIndex;
    }
}
