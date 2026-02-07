package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Product of Array Except Self",
        url = "https://leetcode.com/problems/product-of-array-except-self/description/",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        difficulty = Difficulty.MEDIUM
)
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int prefixProduct = 1;
        int suffixProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefixProduct;

            prefixProduct *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return answer;
    }

}
