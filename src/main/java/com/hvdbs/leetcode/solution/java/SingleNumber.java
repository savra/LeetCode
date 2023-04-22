package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Single Number",
        url = "https://leetcode.com/problems/single-number")
public class SingleNumber {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().equals(1L))
                .mapToInt(Map.Entry::getKey)
                .findFirst()
                .getAsInt();
    }
}
