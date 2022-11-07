package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Decompress Run-Length Encoded List",
        url = "https://leetcode.com/problems/decompress-run-length-encoded-list/")
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer[]> result = new ArrayList<>();
        int j, k;

        for (int i = 0; i < nums.length; i += 2) {
            Integer[] tmp = new Integer[nums[i]];

            j = nums[i];
            k = 0;

            while(j > 0) {
                tmp[k] = nums[i + 1];
                k++;
                j--;
            }

            result.add(tmp);
        }

        return result.stream()
                .flatMap(Arrays::stream)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
