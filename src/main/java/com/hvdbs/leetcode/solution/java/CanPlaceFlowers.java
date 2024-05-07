package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Can Place Flowers",
        url = "https://leetcode.com/problems/can-place-flowers")
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] f, int n) {
        if (f.length == 1 && f[0] == 0) {
            return true;
        }

        if (f.length == 2 && f[0] == 0 && f[1] == 0 && n != 2) {
            return true;
        }

        if (f.length > 2 && f[0] == 0 && f[1] == 0) {
            f[0] = 1;
            n--;
        }

        for (int i = 1; i < f.length - 1; i++) {
            if (f[i - 1] == 0 && f[i] == 0 && f[i + 1] == 0) {
                f[i] = 1;
                n--;
            }
        }

        if (f.length > 2 && f[f.length - 2] == 0 && f[f.length - 1] == 0) {
            n--;
        }

        return n <= 0;
    }
}
