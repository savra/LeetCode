package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Contains Duplicate II",
        url = "https://leetcode.com/problems/contains-duplicate-ii"
)
public class ContainsDuplicateII {
    //TC: O(N), SC: O(N)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                if (Math.abs(m.get(nums[i]) - i) <= k) {
                    return true;
                }
            }

            m.put(nums[i], i);
        }

        return false;
    }
}
