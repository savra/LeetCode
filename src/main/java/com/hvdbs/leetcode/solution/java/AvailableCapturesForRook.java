package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Available Captures for Rook",
        url = "https://leetcode.com/problems/available-captures-for-rook/")
public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int result = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    int row = i;
                    int col = j;

                    while (i >= 0 && board[i][j] != 'B') {
                        if (board[i][j] == 'p') {
                            result++;
                            break;
                        }

                        i--;
                    }

                    i = row;

                    while (i < 8 && board[i][j] != 'B') {
                        if (board[i][j] == 'p') {
                            result++;
                            break;
                        }

                        i++;
                    }

                    i = row;

                    while (j >= 0 && board[i][j] != 'B') {
                        if (board[i][j] == 'p') {
                            result++;
                            break;
                        }

                        j--;
                    }

                    j = col;

                    while (j < 8 && board[i][j] != 'B') {
                        if (board[i][j] == 'p') {
                            result++;
                            break;
                        }

                        j++;
                    }

                    break;
                }
            }
        }

        return result;
    }
}
