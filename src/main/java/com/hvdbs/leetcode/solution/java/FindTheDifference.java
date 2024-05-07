package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Difference",
        url = "https://leetcode.com/problems/find-the-difference",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        //TC: O(N + M), SC: O(N + M)
       /* if (s.length() == 0) {
            return t.charAt(0);
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> e : map2.entrySet()) {
            if (!e.getValue().equals(map1.get(e.getKey()))) {
                return e.getKey();
            }
        }

        return s.charAt(0);*/

        //TC: O(N), SC: O(1)
        if (s.length() == 0) {
            return t.charAt(0);
        }

        int c = 0;

        for(char cs : s.toCharArray()) {
            c ^= cs;
        }

        for (char ct : t.toCharArray()) {
            c ^= ct;
        }

        return (char)c;
    }
}
