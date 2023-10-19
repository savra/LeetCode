package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Number of Islands",
        url = "https://leetcode.com/problems/number-of-islands"
)
public class NumberOfIslands {
    static class Node {
        int row;
        int col;

        Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int numIslands(char[][] grid) {
        int numOfIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;

                    Queue<Node> q = new ArrayDeque<>();
                    q.offer(new Node(i, j));

                    while (!q.isEmpty()) {
                        Node n = q.poll();

                        if (n.row - 1 >= 0 && grid[n.row - 1][n.col] == '1') {
                            q.offer(new Node(n.row - 1, n.col));
                            grid[n.row - 1][n.col] = '0';
                        }

                        if (n.row + 1 < grid.length && grid[n.row + 1][n.col] == '1') {
                            q.offer(new Node(n.row + 1, n.col));
                            grid[n.row + 1][n.col] = '0';
                        }

                        if (n.col - 1 >= 0 && grid[n.row][n.col - 1] == '1') {
                            q.offer(new Node(n.row, n.col - 1));
                            grid[n.row][n.col - 1] = '0';
                        }

                        if (n.col + 1 < grid[n.row].length && grid[n.row][n.col + 1] == '1') {
                            q.offer(new Node(n.row, n.col + 1));
                            grid[n.row][n.col + 1] = '0';
                        }
                    }
                }
            }
        }

        return numOfIslands;
    }

    public static void main(String[] args) {
        numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});
    }
}
