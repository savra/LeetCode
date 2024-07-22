package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find the XOR of Numbers Which Appear Twice",
        url = "https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class FindTheXorOfNumbersWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;

        Set<Integer> tmp = new HashSet<>();

        for (Integer i : nums) {
            if (tmp.contains(i)) {
                result ^= i;
            } else {
                tmp.add(i);
            }
        }

        return result;
    }
}
