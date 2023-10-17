package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Index Sum of Two Lists",
        url = "https://leetcode.com/problems/minimum-index-sum-of-two-lists"
)
public class MinimumIndexSumOfTwoLists {
    //TC: O(N), SC: O(N + M)
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        Map<String, Integer> m3 = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            m1.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            m2.put(list2[i], i);
        }

        int resSum = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> e : m1.entrySet()) {
            if (m2.get(e.getKey()) != null) {
                int tmpSum = e.getValue() + m2.get(e.getKey());
                m3.put(e.getKey(), tmpSum);

                if (tmpSum < resSum) {
                    resSum = tmpSum;
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> e : m3.entrySet()) {
            if (e.getValue() == resSum) {
                result.add(e.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}
