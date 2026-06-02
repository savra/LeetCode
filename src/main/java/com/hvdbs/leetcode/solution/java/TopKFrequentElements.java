package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CodeInfo(
        name = "Top K Frequent Elements",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://leetcode.com/problems/top-k-frequent-elements",
        difficulty = Difficulty.MEDIUM
)
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> tmp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            tmp.put(nums[i], tmp.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (var e : tmp.entrySet()) {
            if (freq[e.getValue()] == null) {
                freq[e.getValue()] = new ArrayList<>();
            }

            freq[e.getValue()].add(e.getKey());
        }

        for (int i = freq.length - 1, j = 0; i > 0 && k > 0; i--) {
            List<Integer> current = freq[i];

            if(current != null) {
                for(Integer num : current) {
                    res[j++] = num;

                    if (--k == 0) {
                        break;
                    }
                }
            }
        }

        return res;
    }
}
