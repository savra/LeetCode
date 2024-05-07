package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.MEDIUM,
        url = "https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/",
        name = "Partitioning Into Minimum Number Of Deci-Binary Numbers")
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        return n.chars().map(Character::getNumericValue).max().getAsInt();
    }
}
