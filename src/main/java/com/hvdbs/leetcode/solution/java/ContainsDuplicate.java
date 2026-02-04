package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Contains Duplicate",
        url = "https://leetcode.com/problems/contains-duplicate",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
