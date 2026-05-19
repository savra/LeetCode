package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Longest Consecutive Sequence",
        url = "https://leetcode.com/problems/longest-consecutive-sequence",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int res = 0;

        if (nums.length < 1) {
            return 0;
        }

        Set<Integer> tmp = new HashSet<>();

        for (int i : nums) {
            tmp.add(i);
        }

        for (int i : tmp) {
            if (!tmp.contains(i - 1)) {
                int cur = i;
                int longetsSeq = 1;

                while (tmp.contains(cur + 1)) {
                    longetsSeq++;
                    cur++;
                }

                res = Math.max(res, longetsSeq);
            }
        }

        return res;
    }
}
