package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Maximum Units on a Truck",
        url = "https://leetcode.com/problems/maximum-units-on-a-truck")
public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maxUnitSum = 0;
        int maxUnit = 0;

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        for (int[] boxType : boxTypes) {
            for (int i = 1; i <= boxType[0] && maxUnit < truckSize; i++) {
                maxUnit++;
                maxUnitSum += boxType[1];
            }
        }

        return maxUnitSum;
    }
}
