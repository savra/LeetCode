package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Isomorphic Strings",
        url = "https://leetcode.com/problems/isomorphic-strings"
)
public class IsomorphicStrings {
    //TC: O(N), SC: O(N)
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (m.containsKey(sChar) && m.get(sChar) != tChar) return false;
            if (!m.containsKey(sChar) && m.containsValue(tChar)) return false;

            m.put(sChar, tChar);
        }

        return true;
    }
}
