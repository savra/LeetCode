package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "N-Repeated Element in Size 2N Array",
        url = "https://leetcode.com/problems/n-repeated-element-in-size-2n-array/")
public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int num : nums) {
            Integer currentValue = result.get(num);

            if (currentValue == null) {
                result.put(num, 1);
            } else {
                result.put(num, ++currentValue);
            }
        }

        return result.entrySet()
                .stream()
                .filter(entrySet -> entrySet.getValue() == nums.length / 2)
                .map(Map.Entry::getKey)
                .findAny()
                .get();
    }
}
