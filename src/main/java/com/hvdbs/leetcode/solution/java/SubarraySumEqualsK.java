package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Subarray Sum Equals K",
        url = "https://leetcode.com/problems/subarray-sum-equals-k",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length + 1];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Map<Integer, Integer> tmp = new HashMap<>();

        for (int i = 0; i < prefix.length; i++) {
            total += tmp.getOrDefault(prefix[i] - k, 0);
            tmp.put(prefix[i], tmp.getOrDefault(prefix[i], 0) + 1);
        }

        return total;
    }
}
