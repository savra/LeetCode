package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Indices of Stable Mountains",
        url = "https://leetcode.com/problems/find-indices-of-stable-mountains",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class FindIndicesOfStableMountains {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }

        return result;
    }
}
