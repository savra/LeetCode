package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum String Length After Removing Substrings",
        url = "https://leetcode.com/problems/minimum-string-length-after-removing-substrings"
)
public class MinimumStringLengthAfterRemovingSubstrings {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public int minLength(String s) {
        int prevSize = 0;
        int currentSize = s.length();
        String tmp = s;

        while(currentSize != prevSize) {
            prevSize = currentSize;
            tmp = tmp.replaceAll("(AB)|(CD)", "");
            currentSize = tmp.length();
        }

        return currentSize;
    }
}
