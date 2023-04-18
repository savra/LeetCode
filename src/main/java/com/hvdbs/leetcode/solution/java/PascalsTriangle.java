package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Pascal's Triangle",
        url = "https://leetcode.com/problems/pascals-triangle/")
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        int i = 0;

        while (i < numRows) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            if (result.isEmpty()) {
                result.add(tmp);
            } else {
                List<Integer> prevList = result.get(i - 1);

                for (int j = 0; i < prevList.size() - 1; j++) {
                    tmp.add(prevList.get(j) + prevList.get(j + 1));
                }

                tmp.add(1);

                result.add(tmp);
            }

            i++;
        }

        return result;
    }
}
