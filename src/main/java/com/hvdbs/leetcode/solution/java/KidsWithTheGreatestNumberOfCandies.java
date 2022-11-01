package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Kids With the Greatest Number of Candies",
        url = "https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/")
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        int localMax = 0;
        boolean greatest = true;

        for (int i = 0; i < candies.length; i++) {
            localMax = candies[i] + extraCandies;
            greatest = true;

            for (int j = 0; j < candies.length; j++) {
                if (candies[j] > localMax) {
                    greatest = false;
                    break;
                }
            }

            result.add(greatest);
        }

        return result;
    }
}
