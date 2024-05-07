package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Jewels and Stones",
        url = "https://leetcode.com/problems/jewels-and-stones/")
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();

        for (int i = 0; i < jewelsArray.length; i++) {
            for (int j = 0; j < stonesArray.length; j++) {
                if (stonesArray[j] == jewelsArray[i]) {
                    result++;
                }
            }
        }

        return result;
    }
}
