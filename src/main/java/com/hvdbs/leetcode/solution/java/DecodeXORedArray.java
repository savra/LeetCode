package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Decode XORed Array",
        url = "https://leetcode.com/problems/decode-xored-array/description/")
public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];

        result[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }

        return result;
    }
}
