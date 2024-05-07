package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number Of Rectangles That Can Form The Largest Square",
        url = "https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/")
public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int largestSquares = 0;
        int minLen;
        int[] result = new int[rectangles.length];

        for (int i = 0; i < rectangles.length; i++) {
            minLen = Math.min(rectangles[i][0], rectangles[i][1]);

            if (minLen > largestSquares) {
                largestSquares = minLen;
            }

            result[i] = minLen;
        }

        final int maximum = largestSquares;

        return (int)Arrays.stream(result)
                .filter(rectangleLen -> rectangleLen == maximum)
                .count();
    }
}
