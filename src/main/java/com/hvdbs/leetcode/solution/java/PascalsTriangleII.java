package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Pascal's Triangle II",
        url = "https://leetcode.com/problems/pascals-triangle-ii/",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(N)")
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> base = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        base.add(1);

        if (rowIndex == 0) {
            return base;
        }

        base.add(1);

        if (rowIndex == 1) {
            return base;
        }

        int i = 2;

        while (i <= rowIndex) {
            res.clear();

            for (int j = 0; j <= base.size(); j++) {
                res.add(((j - 1) < 0 ? 0 : base.get(j - 1)) + (j == base.size() ? 0 : base.get(j)));
            }

            base.clear();
            base.addAll(res);

            i++;
        }

        return res;
    }
}
