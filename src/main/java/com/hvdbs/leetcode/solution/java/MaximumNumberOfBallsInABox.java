package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Maximum Number of Balls in a Box",
        url = "https://leetcode.com/problems/maximum-number-of-balls-in-a-box")
public class MaximumNumberOfBallsInABox {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = lowLimit; i <= highLimit; i++) {
            int tmp = i;
            int sum = 0;

            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            result.put(sum, result.getOrDefault(sum, 0) + 1);
        }

        return result.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .get()
                .getValue();
    }
}
