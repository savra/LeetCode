package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Kth Distinct String in an Array",
        url = "https://leetcode.com/problems/kth-distinct-string-in-an-array")
public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> res = new LinkedHashMap<>();

        for (String s : arr) {
            res.put(s, res.getOrDefault(s, 0) + 1);
        }

        List<Map.Entry<String, Integer>> collect = res.entrySet()
                .stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getValue() == 1)
                .toList();

        return collect.size() < k ? "" : collect.get(k - 1).getKey();
    }
}

