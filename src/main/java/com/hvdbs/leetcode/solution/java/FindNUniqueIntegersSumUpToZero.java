package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Find N Unique Integers Sum up to Zero",
        url = "https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/")
public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        int[] arr1 = IntStream.iterate(1, accumulator -> accumulator + 1)
                .limit(n / 2)
                .toArray();

        int[] arr2 = IntStream.iterate(-1, accumulator -> accumulator - 1)
                .limit(n / 2)
                .toArray();

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        if (n % 2 != 0) {
            result[n - 1] = 0;
        }

        return result;
    }
}
