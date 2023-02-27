package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.stream.Stream;

@LeetCodeInfo(difficulty = Difficulty.EASY, url = "https://leetcode.com/problems/counting-bits", name = "Counting Bits")
public class CountingBits {
    public static int[] countBits(int n) {
        return Stream.iterate(0, i -> i <= n, i -> i + 1)
                .map(Integer::toBinaryString)
                .mapToInt(j -> (int) j.chars().map(Character::getNumericValue).filter(k -> k == 1).count())
                .toArray();
    }
}
