package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Number of Senior Citizens",
        url = "https://leetcode.com/problems/number-of-senior-citizens")
public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int result = 0;

        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                result++;
            }
        }

        return result;
    }
}
