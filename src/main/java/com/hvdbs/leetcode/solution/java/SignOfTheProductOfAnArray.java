package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.math.BigInteger;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Sign of the Product of an Array",
        url = "https://leetcode.com/problems/sign-of-the-product-of-an-array"
)
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
