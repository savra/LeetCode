package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Self Dividing Numbers",
        url = "https://leetcode.com/problems/self-dividing-numbers/")
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        int lastDigit;
        int countDigit;
        int countCurrentNumberDigit;

        for (int i = left; i <= right; i++) {
            int tmp = i;

            countDigit = (int) Math.log10(tmp) + 1;
            countCurrentNumberDigit = 0;
            while (tmp != 0) {
                lastDigit = tmp % 10;
                tmp /= 10;

                if (lastDigit == 0) {
                    break;
                }

                if (i % lastDigit == 0) {
                    countCurrentNumberDigit++;
                }
            }

            if (countDigit == countCurrentNumberDigit) {
                result.add(i);
            }
        }

        return result;
    }
}
