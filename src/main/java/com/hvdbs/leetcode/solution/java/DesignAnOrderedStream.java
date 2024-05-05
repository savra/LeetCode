package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Design an Ordered Stream",
        url = "https://leetcode.com/problems/design-an-ordered-stream/description/")
public class DesignAnOrderedStream {
    private int ptr;
    private final String[] result;

    public DesignAnOrderedStream(int n) {
        result = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        result[idKey - 1] = value;

        List<String> res = new ArrayList<>();

        for (int i = ptr; i < result.length; i++) {
            if (result[i] == null) {
                break;
            }

            ptr++;
            res.add(result[i]);
        }

        return res;
    }
}
