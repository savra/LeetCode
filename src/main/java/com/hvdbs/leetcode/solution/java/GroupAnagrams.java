package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Group Anagrams",
        url = "https://leetcode.com/problems/group-anagrams/"
)
public class GroupAnagrams {
    //TC: O(N * MLogM), SC: O(N)
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String, List<String>> m = new HashMap<>();

        for (String value : s) {
            char[] str = value.toCharArray();
            Arrays.sort(str);
            m.computeIfAbsent(new String(str), v -> new ArrayList<>()).add(value);
        }

        List<List<String>> res = new ArrayList<>();

        for (Map.Entry<String, List<String>> e : m.entrySet()) {
            res.add(e.getValue());
        }

        return res;
    }
}
