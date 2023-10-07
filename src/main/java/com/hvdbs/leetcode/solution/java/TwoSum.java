package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Two Sum",
        url = "https://leetcode.com/problems/two-sum/")
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //TC: O(N), SC: O(1)
       /* int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return result;*/

        //TC: O(N), SC: O(N)
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];

            if (map.containsKey(tmp) && map.get(tmp) != i) {
                return new int[]{i, map.get(tmp)};
            }
        }

        return null;
    }
}
