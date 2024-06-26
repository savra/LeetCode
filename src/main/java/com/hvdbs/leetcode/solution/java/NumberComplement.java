package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Number Complement",
        url = "https://leetcode.com/problems/number-complement")
public class NumberComplement {
    public static int findComplement(int num) {
        long pow2 = 1;

        while (pow2 <= num) {
            pow2 <<= 1;
        }

        return (int) (num ^ (--pow2));
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(findComplement(5)));
    }
}
