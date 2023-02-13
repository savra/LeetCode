package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Separate the Digits in an Array",
        url = "https://leetcode.com/problems/separate-the-digits-in-an-array/description/")
public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int[] tmp = separateNumber(num);

            for (int k : tmp) {
                result.add(k);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int[] separateNumber(int v) {
        int size = (int) Math.log10(v) + 1;
        int[] result = new int[size];

        size--;

        while (v != 0) {
            result[size--] = v % 10;
            v /= 10;
        }

        return result;
    }
}
