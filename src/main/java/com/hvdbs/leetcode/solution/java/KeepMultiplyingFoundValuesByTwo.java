package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Keep Multiplying Found Values by Two",
        url = "https://leetcode.com/problems/keep-multiplying-found-values-by-two/")
public class KeepMultiplyingFoundValuesByTwo {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> tmp = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        while (tmp.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
