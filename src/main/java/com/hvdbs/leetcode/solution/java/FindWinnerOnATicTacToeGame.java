package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Winner on a Tic Tac Toe Game",
        url = "https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game"
)
public class FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        char[][] result = new char[3][3];

        if (moves.length <= 2) {
            return "Pending";
        }

        char step = 'X';
        int stepCount = 0;

        for (int k = 0; k < moves.length; k++) {
            result[moves[k][0]][moves[k][1]] = step;
            stepCount++;

            if (k % 2 == 0) {
                step = 'O';
            } else {
                step = 'X';
            }
        }

        char answer = 'Q';

        for (int i = 0, j = 0; i < result.length; i++) {
            if ((result[i][j] == 'O' || result[i][j] == 'X') && (result[i][j] == result[i][j + 1] && result[i][j + 1] == result[i][j + 2])) {
                answer = result[i][j];
                break;
            }
        }

        if (answer != 'Q') {
            return answer == 'X' ? "A" : "B";
        }

        for (int i = 0, j = 0; j < result.length; j++) {
            if ((result[i][j] == 'O' || result[i][j] == 'X') && result[i][j] == result[i + 1][j] && result[i + 1][j] == result[i + 2][j]) {
                answer = result[i][j];
                break;
            }
        }

        if (answer != 'Q') {
            return answer == 'X' ? "A" : "B";
        }

        if ((result[0][0] == 'O' || result[0][0] == 'X') && result[0][0] == result[1][1] && result[1][1] == result[2][2]) {
            return result[0][0] == 'X' ? "A" : "B";
        }

        if ((result[0][2] == 'O' || result[0][2] == 'X') && result[0][2] == result[1][1] && result[1][1] == result[2][0]) {
            return result[0][2] == 'X' ? "A" : "B";
        }

        return stepCount < 9 ? "Pending" : "Draw";
    }
}
