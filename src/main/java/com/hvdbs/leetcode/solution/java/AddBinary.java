package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Add Binary",
        url = "https://leetcode.com/problems/add-binary"
)
public class AddBinary {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public String addBinary(String a, String b) {
        boolean isMemorized = false;
        StringBuilder result = new StringBuilder();

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            char chr1 = i < 0 ? '0' : a.charAt(i);
            char chr2 = j < 0 ? '0' : b.charAt(j);

            if (chr1 == '0' && chr2 == '0') {
                if (isMemorized) {
                    result.insert(0, '1');
                    isMemorized = false;
                } else {
                    result.insert(0, '0');
                }
            } else if (chr1 == '1' && chr2 == '1') {
                if (isMemorized) {
                    result.insert(0, '1');
                } else {
                    result.insert(0, '0');
                    isMemorized = true;
                }
            } else {
                if (isMemorized) {
                    result.insert(0, '0');
                } else {
                    result.insert(0, '1');
                }
            }
        }

        if (isMemorized) {
            result.insert(0, '1');
        }

        return result.toString();
    }
}
