package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Good Pairs",
        url = "https://leetcode.com/problems/number-of-good-pairs/",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class NumberOfGoodPairs {
    /*Time complexity: O(n^2), Space complexity: O(1)*/
    /*public int numIdenticalPairs(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }

        return res;
    }*/

    /*Time complexity: O(n), Space complexity: O(n)*/
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];

        int res = 0;

        for (int num : nums) {
            freq[num]++;
        }

        for (int num : freq) {
            res += num * (num - 1) / 2;
        }

        return res;
    }

    /*Time complexity: O(n), Space complexity: O(n)*/
   /* public int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Integer e: freqMap.values()) {
            res += e * (e - 1) / 2;
        }

        return res;
    }*/
}
