package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Unique Number of Occurrences",
        url = "https://leetcode.com/problems/unique-number-of-occurrences/")
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i : arr) {
            result.put(i, result.getOrDefault(i, 0) + 1);
        }

        return result.size() == new HashSet<>(result.values()).size();
    }
}
