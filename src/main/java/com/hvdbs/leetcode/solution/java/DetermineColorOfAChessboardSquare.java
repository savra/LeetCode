package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Determine Color of a Chessboard Square",
        url = "https://leetcode.com/problems/determine-color-of-a-chessboard-square/")
public class DetermineColorOfAChessboardSquare {
    private static final int aCode = 63;

    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - aCode) % 2 == 0
                && Character.getNumericValue(coordinates.charAt(1)) % 2 != 0
                || (coordinates.charAt(0) - aCode) % 2 != 0
                && Character.getNumericValue(coordinates.charAt(1)) % 2 == 0 ? false : true;
    }
}
