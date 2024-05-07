package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Isomorphic Strings",
        url = "https://leetcode.com/problems/isomorphic-strings",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class IsomorphicStrings {
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
