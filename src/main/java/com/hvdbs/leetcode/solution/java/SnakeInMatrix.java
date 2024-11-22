package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Snake in Matrix",
        url = "https://leetcode.com/problems/snake-in-matrix",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;

        for (String command : commands) {
            switch (command) {
                case "RIGHT":
                    j++; break;
                case "DOWN":
                    i++; break;
                case "LEFT":
                    j--;
                    break;
                case "UP":
                    i--;
                    break;
            }
        }

        return (i * n) + j;
    }
}
