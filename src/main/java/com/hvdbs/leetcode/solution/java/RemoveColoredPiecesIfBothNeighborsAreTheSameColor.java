package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Remove Colored Pieces if Both Neighbors are the Same Color",
        url = "https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/")
public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    public boolean winnerOfGame(String colors) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    aliceScore++;
                } else {
                    bobScore++;
                }
            }
        }

        return aliceScore > bobScore;
    }
}
