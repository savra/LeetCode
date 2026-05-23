package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.HARD,
        url = "https://leetcode.com/problems/minimum-window-substring/",
        name = "Minimum Window Substring",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.BILINEAR //O(N + M)
)
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);

            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int needed = t.length();
        int minWind = Integer.MAX_VALUE;
        int bestLeft = 0;
        int bestRight = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (tMap.containsKey(c)) {
                if (tMap.get(c) > 0) {
                    needed--;
                }

                tMap.put(c, tMap.get(c) - 1);
            }

            while (needed == 0) {
                if (r - l + 1 <= minWind) {
                    minWind = r - l + 1;
                    bestLeft = l;
                    bestRight = r;
                }

                char leftChar = s.charAt(l);

                if (tMap.containsKey(leftChar)) {
                    tMap.put(leftChar, tMap.get(leftChar) + 1);

                    if (tMap.get(leftChar) > 0) {
                        needed++;
                    }

                }

                l++;
            }
        }

        return minWind == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestRight + 1);
    }
}
