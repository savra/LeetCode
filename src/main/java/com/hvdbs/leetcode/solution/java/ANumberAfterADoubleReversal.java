package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "A Number After a Double Reversal",
        url = "https://leetcode.com/problems/a-number-after-a-double-reversal")
public class ANumberAfterADoubleReversal {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }

        int reversed = reverseNum(num);

        return num == reverseNum(reversed);
    }

    private int reverseNum(int num) {
        int tmp = num;

        StringBuilder sb = new StringBuilder();

        while (tmp != 0) {
            sb.append(tmp % 10);
            tmp /= 10;
        }

        return Integer.parseInt(sb.toString());
    }
}
