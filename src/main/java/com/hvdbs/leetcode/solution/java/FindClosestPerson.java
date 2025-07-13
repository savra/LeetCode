package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Closest Person",
        url = "https://leetcode.com/problems/find-closest-person",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int firstDistance = Math.abs(z - x);
        int secondDistance = Math.abs(z - y);

        return firstDistance < secondDistance ? 1 : firstDistance > secondDistance ? 2 : 0;
    }
}
