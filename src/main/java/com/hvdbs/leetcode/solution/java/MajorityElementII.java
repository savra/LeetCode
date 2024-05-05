package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Majority Element II",
        url = "https://leetcode.com/problems/majority-element-ii")
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int votes1 = 0, votes2 = 0;
        int candidate1 = -1, candidate2 = -1;

        for (int num : nums) {
            if (votes1 == 0 && num != candidate2) {
                votes1++;
                candidate1 = num;
            } else if (votes2 == 0 && num != candidate1) {
                votes2++;
                candidate2 = num;
            } else if (candidate1 == num) {
                votes1++;
            } else if (candidate2 == num) {
                votes2++;
            } else {
                votes1--;
                votes2--;
            }
        }

        votes1 = 0;
        votes2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                votes1++;
            } else if (num == candidate2) {
                votes2++;
            }
        }

        int threshold = nums.length / 3;

        if (votes1 > threshold) {
            result.add(candidate1);
        }

        if (votes2 > threshold) {
            result.add(candidate2);
        }

        return result;
    }
}
