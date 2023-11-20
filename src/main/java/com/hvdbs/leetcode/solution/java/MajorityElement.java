package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Majority Element",
        url = "https://leetcode.com/problems/majority-element"
)
public class MajorityElement {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
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
