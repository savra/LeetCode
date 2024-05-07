package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Sign of the Product of an Array",
        url = "https://leetcode.com/problems/sign-of-the-product-of-an-array",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        //TC: O(N), SC: O(1)
        /*
        BigInteger product = BigInteger.ONE;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            product = product.multiply(BigInteger.valueOf(num));
        }

        return product.signum();*/

        //TC: O(N), SC: O(1)
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                negativeCount++;
            }
        }

        return negativeCount % 2 == 0 ? 1 : -1;
    }
}
