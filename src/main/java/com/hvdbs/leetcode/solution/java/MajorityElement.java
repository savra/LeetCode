package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Majority Element",
        url = "https://leetcode.com/problems/majority-element",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int votes = 0;
        int candidate = -1;

        for (int num : nums) {
            if (votes == 0) {
                candidate = num;
            }

            if (candidate == num) {
                votes++;
            } else {
                votes--;
            }
        }

        votes = 0;

        for (int num : nums) {
            if (num == candidate) {
                votes++;
            }
        }

        return candidate;
    }
}
