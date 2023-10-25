package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Robot Bounded In Circle",
        url = "https://leetcode.com/problems/robot-bounded-in-circle"
)
public class RobotBoundedInCircle {
    private static class Robot {
        int x;
        int y;
    }

    private enum Direction {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    public boolean isRobotBounded(String instructions) {
        int stepCount = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'G') {
                stepCount++;
            }
        }

        int i = 0;

        Robot slowRobot = new Robot();
        Robot fastRobot = new Robot();

        Direction currentDirection = Direction.NORTH;

        stepCount *= 4;

        while (stepCount > 0) {
            if (instructions.charAt(i) == 'G') {
                switch (currentDirection) {
                    case NORTH -> {
                        slowRobot.y = slowRobot.y + 1;
                        fastRobot.y = fastRobot.y + 2;
                    }
                    case SOUTH -> {
                        slowRobot.y = slowRobot.y - 1;
                        fastRobot.y = fastRobot.y - 2;
                    }
                    case WEST -> {
                        slowRobot.x = slowRobot.x - 1;
                        fastRobot.x = fastRobot.x - 2;
                    }
                    default -> {
                        slowRobot.x = slowRobot.x + 1;
                        fastRobot.x = fastRobot.x + 2;
                    }
                }
                ;
                stepCount--;
            } else if (instructions.charAt(i) == 'L') {
                currentDirection = switch (currentDirection) {
                    case NORTH -> Direction.WEST;
                    case SOUTH -> Direction.EAST;
                    case WEST -> Direction.SOUTH;
                    default -> Direction.NORTH;
                };
            } else {
                currentDirection = switch (currentDirection) {
                    case NORTH -> Direction.EAST;
                    case SOUTH -> Direction.WEST;
                    case WEST -> Direction.NORTH;
                    default -> Direction.SOUTH;
                };
            }

            i++;

            if (i == instructions.length()) {
                i = 0;
            }
        }

        return slowRobot.x == fastRobot.x && slowRobot.y == fastRobot.y;
    }
}
