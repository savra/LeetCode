package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Number of Recent Calls",
        url = "https://leetcode.com/problems/number-of-recent-calls")
public class NumberOfRecentCalls {
    private final List<Integer> pings = new ArrayList<>();

    public NumberOfRecentCalls() {
    }

    public int ping(int t) {
        pings.add(t);

        int pingCount = 0;

        for (Integer i : pings) {
            if (i >= t - 3000) {
                pingCount++;
            }
        }

        return pingCount;
    }
}
