package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Single Number",
        url = "https://leetcode.com/problems/single-number")
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        /* TC: O(N), SC: O(N)
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().equals(1L))
                .mapToInt(Map.Entry::getKey)
                .findFirst()
                .getAsInt();*/

/* TC: O(N), SC: O(1)
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;      */

        //TC: O(N), SC: O(n)
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }

        return -1;
    }
}
