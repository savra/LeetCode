package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Count Elements With Maximum Frequency",
        url = "https://leetcode.com/problems/count-elements-with-maximum-frequency/"
)
public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (int i : nums) {
            int currentValue = freq.getOrDefault(i, 0) + 1;
            maxFreq = Math.max(maxFreq, currentValue);

            freq.put(i, currentValue);
        }

        int result = 0;

        for (int num : nums) {
            if (freq.get(num) == maxFreq) {
                result++;
            }
        }

        return result;
    }
}
