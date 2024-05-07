package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Baseball Game",
        url = "https://leetcode.com/problems/baseball-game")
public class BaseballGame {
    public int calPoints(String[] operations) {
        List<Integer> subResult = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "+" -> subResult.add(subResult.get(subResult.size() - 2) + subResult.get(subResult.size() - 1));
                case "D" -> subResult.add(subResult.get(subResult.size() - 1) * 2);
                case "C" -> subResult.remove(subResult.get(subResult.size() - 1));
                default -> subResult.add(Integer.valueOf(operation));
            }
        }

        return subResult.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
