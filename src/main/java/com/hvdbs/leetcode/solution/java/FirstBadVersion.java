package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "First Bad Version",
        url = "https://leetcode.com/problems/first-bad-version")
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int h = n;
        int l = 1;
        int m;

        while (l < h) {
            m = l + (h - l) / 2;

            if (isBadVersion(m)) {
                h = m;
            } else {
                l = m + 1;
            }
        }

        return isBadVersion(l) ? l : h;
    }

    private boolean isBadVersion(int n) {
        return true;
    }
}
