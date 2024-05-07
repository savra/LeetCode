package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find the Peaks",
        url = "https://leetcode.com/problems/find-the-peaks")
public class FindThePeaks {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> result = new ArrayList<>();

        if (mountain.length < 3) {
            return result;
        }

        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                result.add(i);
            }
        }

        return result;
    }
}
