package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Subarrays Distinct Element Sum of Squares I",
        url = "https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.CUBIC
)
public class SubarraysDistinctElementSumOfSquaresI {
    public static int sumCounts(List<Integer> nums) {
        int[] numsArray = nums.stream().mapToInt(Integer::intValue).toArray();
        int sum = 0;
        Set<Integer> uniqueSubarray = new HashSet<>();

        for (int i = 0; i < numsArray.length; i++) {
            for (int j = i; j < numsArray.length; j++) {
                for (int k = i; k <= j; k++) {
                    uniqueSubarray.add(numsArray[k]);
                }

                if (!uniqueSubarray.isEmpty()) {
                    sum += Math.pow(uniqueSubarray.size(), 2);
                    uniqueSubarray.clear();
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        sumCounts(List.of(1,2,1));
    }
}
