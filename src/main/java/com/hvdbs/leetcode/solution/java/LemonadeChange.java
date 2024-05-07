package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Lemonade Change",
        url = "https://leetcode.com/problems/lemonade-change"
)
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int[] wallet = new int[2];
        int change = 0;

        for (int bill : bills) {
            change = 0;

            if (bill == 5) {
                wallet[0]++;
            } else if (bill == 10) {
                if (wallet[0] > 0) {
                    wallet[0]--;
                } else {
                    return false;
                }

                wallet[1]++;
            } else {
                if (wallet[1] > 0) {
                    wallet[1]--;
                    change += 10;
                }

                if (wallet[0] > 0) {
                    if (change != 0) {
                        wallet[0]--;
                    } else {
                        while (change != 15 && wallet[0] > 0) {
                            change += 5;
                            wallet[0]--;
                        }

                        if (change != 15) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
