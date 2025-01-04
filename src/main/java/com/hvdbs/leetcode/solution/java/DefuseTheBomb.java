package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Defuse the Bomb",
        url = "https://leetcode.com/problems/defuse-the-bomb",
        timeComplexity = Complexity.ConstantComplexity.BILINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int sum = 0;

        int[] result = new int[code.length];


        for (int i = 0; i < code.length; i++) {
            if (k > 0) {
                int j = i + 1;

                if (j == code.length) {
                    j = 0;
                }

                int l = 1;

                while (l <= k) {
                    result[i] += code[j];

                    j++;

                    if (j == code.length) {
                        j = 0;
                    }

                    l++;
                }
            } else if (k == 0) {
                code[i] = 0;
            } else {
                int j = i - 1;

                if (j < 0) {
                    j = code.length - 1;
                }

                int l = 1;

                while (l <= Math.abs(k)) {
                    result[i] += code[j];

                    j--;

                    if (j == -1) {
                        j = code.length - 1;
                    }

                    l++;
                }
            }
        }

        return result;
    }
}
