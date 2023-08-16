package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.*;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find All Numbers Disappeared in an Array",
        url = "https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array")
public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        long[] bits = new long[nums.length / 63 + 1];
        List<Integer> result = new ArrayList<>();

        for (int i : nums) {
            bits[(i - 1) / 63] |= 1L << ((i - 1) % 63);
            System.out.println("Число " + i + " = " + Long.toBinaryString(bits[0]));
        }

        for (int i = 1; i <= nums.length; i++) {
            if ((bits[(i - 1) / 63] & (1L << ((i - 1) % 63))) == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
