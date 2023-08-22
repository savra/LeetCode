package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Remove Trailing Zeros From a String",
        url = "https://leetcode.com/problems/remove-trailing-zeros-from-a-string"
)
public class RemoveTrailingZerosFromAString {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public String removeTrailingZeros(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
