package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Sort Array By Parity",
        url = "https://leetcode.com/problems/sort-array-by-parity/")
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        even.addAll(odd);

        return even.stream().mapToInt(Integer::intValue).toArray();
    }
}
