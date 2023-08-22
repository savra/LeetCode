package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimize String Length",
        url = "https://leetcode.com/problems/minimize-string-length"
)
public class MinimizeStringLength {
    //My Time Complexity: O(N LogN)
    //My Space complexity: O(n)
    public int minimizedStringLength(String s) {
        int j = 0;
        int resultCount = 1;
        char[] tmp = s.toCharArray();

        Arrays.sort(tmp);

        for (int i = 1; i < tmp.length; i++) {
            if (tmp[i] != tmp[j]) {
                resultCount++;
                j = i;
            }
        }

        return resultCount;
    }
}
