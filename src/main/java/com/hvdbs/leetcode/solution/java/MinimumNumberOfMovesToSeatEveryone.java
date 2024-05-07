package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Minimum Number of Moves to Seat Everyone",
        url = "https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/")
public class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int movesCount = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == students[i]) {
                continue;
            } else if (seats[i] < students[i]) {
                while(seats[i] != students[i]) {
                    movesCount++;
                    seats[i]++;
                }
            } else {
                while(seats[i] != students[i]) {
                    movesCount++;
                    seats[i]--;
                }
            }
        }

        return movesCount;
    }
}
