package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Widest Vertical Area Between Two Points Containing No Points",
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.LOGARITHMIC,
        url = "https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points"
)
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        int maxLengthBetweenTwoPoints = points[1][0] - points[0][0];

        for (int i = 2; i < points.length; i++) {
            int currentX = points[i][0];
            int prevX = points[i - 1][0];

            if (currentX - prevX > maxLengthBetweenTwoPoints) {
                maxLengthBetweenTwoPoints = currentX - prevX;
            }
        }

        return maxLengthBetweenTwoPoints;
    }
}
