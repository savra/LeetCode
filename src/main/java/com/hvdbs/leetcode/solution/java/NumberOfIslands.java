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
        Queue<Node> q = new ArrayDeque<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    q.offer(new Node(i, j));

                    while (!q.isEmpty()) {
                        Node current = q.poll();

                        if (current.row > 0 && grid[current.row - 1][current.col] == '1') {
                            q.offer(new Node(current.row - 1, current.col));
                            grid[current.row - 1][current.col] = '0';
                        }

                        if (current.row < grid.length - 1 && grid[current.row + 1][current.col] == '1') {
                            q.offer(new Node(current.row + 1, current.col));
                            grid[current.row + 1][current.col] = '0';
                        }

                        if (current.col > 0 && grid[current.row][current.col - 1] == '1') {
                            q.offer(new Node(current.row, current.col - 1));
                            grid[current.row][current.col - 1] = '0';
                        }

                        if (current.col < grid[current.row].length - 1 && grid[current.row][current.col + 1] == '1') {
                            q.offer(new Node(current.row, current.col + 1));
                            grid[current.row][current.col + 1] = '0';
                        }
                    }

                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }

    public static void main(String[] args) {
        //numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});
        numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}});
    }
}
