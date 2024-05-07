package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "First Unique Character in a String",
        url = "https://leetcode.com/problems/first-unique-character-in-a-string")
public class FirstUniqueCharacterInAString {
    //TC: O(N), SC: O(N)
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}
