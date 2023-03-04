package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, url = "https://leetcode.com/problems/hamming-distance",
        name = "Hamming Distance")
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return (int) Integer.toBinaryString(x ^ y)
                .chars()
                .map(Character::getNumericValue)
                .filter(chr -> chr != 0)
                .count();
    }
}
